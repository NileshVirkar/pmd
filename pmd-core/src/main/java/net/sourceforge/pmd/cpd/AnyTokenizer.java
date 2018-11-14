/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;

import net.sourceforge.pmd.cpd.db.TokensDao;

/**
 * This class does a best-guess try-anything tokenization.
 *
 * @author jheintz
 */
public class AnyTokenizer implements Tokenizer {
    public static final String TOKENS = " \t!#$%^&*(){}-=+<>/\\`~;:";

    @Override
    public void tokenize(SourceCode sourceCode, TokensDao tokensDao) {
        StringBuilder sb = sourceCode.getCodeBuffer();
        BufferedReader reader = new BufferedReader(new CharArrayReader(sb.toString().toCharArray()));
        try {
            int lineNumber = 1;
            String line = reader.readLine();
            while (line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, TOKENS, true);
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (!" ".equals(token) && !"\t".equals(token)) {
                        int identifier = tokensDao.getIdentifierForImage(token);
                        tokensDao.saveToken(new TokenEntry(token, sourceCode.getFileName(), lineNumber, identifier));
                    }
                }
                // advance iteration variables
                line = reader.readLine();
                lineNumber++;
            }
        } catch (IOException ignored) {
            ignored.printStackTrace();
        } finally {
            IOUtils.closeQuietly(reader);
            tokensDao.saveToken(TokenEntry.getEOF());
        }
    }
}
