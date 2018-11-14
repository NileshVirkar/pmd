/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.lang3.StringUtils;

import net.sourceforge.pmd.cpd.db.TokensDao;

public class PygmentsTokenizer {
    private List<String> skipKeys;
    private List<String> skipValues;
    private CPDLanguage language;

    private static final String LEXER_SCRIPT_PATH = "tools" + File.separatorChar + "bin" + File.separatorChar + "lexer.py";
    
    public PygmentsTokenizer() {
        super();
    }

    public PygmentsTokenizer(CPDLanguage language) {
        super();
        this.language = language;
    }

    protected void configureTokenizer(List<String> skipKeys, List<String> skipValues) {
        this.skipKeys = skipKeys;
        this.skipValues = skipValues;
    }

    public void tokenize(SourceCode tokens, TokensDao tokensDao) {
        String fileName = tokens.getFileName();
        List<String> lextokens = tokenizeFile(fileName);

        int i = 1;
        for (String lextoken : lextokens) {
            String[] arr = lextoken.split("(, )");
            String key = arr[0];
            String value;
            if (arr.length < 2) {
                value = arr[0];
            } else {
                value = arr[1].replace("'", "");
            }

            if ("\\n".equals(value) || "Token.Comment.Single".equals(key)) {
                i++;
            } else if ("Token.Comment.Multiline".equals(key)) {
                i += getLinesFromMultiLComments(value);
            } else if (value.contains("\\n")) {
                i += getLinesFromMultiLComments(value);
            } else if (isValidToken(key, value)) {
                tokensDao.saveToken(new TokenEntry(value, tokens.getFileName(), i, 5));
            }
        }
        tokensDao.saveToken(TokenEntry.getEOF());
    }

    protected List<String> tokenizeFile(String filePath) {
        String executable = "python";
        String[] args = new String[3];
 
        args[0] = CoronaHome.getThrow() + File.separatorChar + LEXER_SCRIPT_PATH;
        args[1] = filePath;
        args[2] = language.toString();
        String string = executeProcessSyncNGetOutput(executable, args);

        List<String> tokens = new ArrayList<>();
        Pattern p3 = Pattern.compile("\\((.*?)\\)");
        Matcher m3 = p3.matcher(string);
        while (m3.find()) {
            tokens.add(m3.group(1));
        }
        return tokens;
    }

    private String executeProcessSyncNGetOutput(String executable, String[] args) {
        try {
            // System.out.println("Executing synchronous command " + executable
            // + " with args: " + Arrays.toString(args));
            CommandLine cmdLine = new CommandLine(executable);
            cmdLine.addArguments(args, true);
            DefaultExecutor executor = new DefaultExecutor();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream);
            executor.setStreamHandler(streamHandler);
            executor.execute(cmdLine);
            return (outputStream.toString());
        } catch (IOException e) {
            System.err.println(e);
        }
        return executable;
    }

    protected boolean isValidToken(String tokenKey, String tokenValue) {
        if (skipKeys.contains(tokenKey) || skipValues.contains(tokenValue) || StringUtils.isBlank(tokenKey)
                || StringUtils.isBlank(tokenValue)) {
            return false;
        }
        return true;
    }

    protected int getLinesFromMultiLComments(String token) {
        return StringUtils.countMatches(token, "\\n");
    }
}
