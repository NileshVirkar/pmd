/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.cpd.grammer.PhpLexer;

/**
 * Simple tokenizer for PHP.
 */
public class PHPTokenizer extends PygmentsTokenizer implements Tokenizer {
    private List<Integer> skipValues;
    
    public PHPTokenizer() {
        skipValues = Arrays.asList(39, 40, 41);
    }

    @Override
    public void tokenize(SourceCode tokens, Tokens tokenEntries) {
        try {
            PhpLexer golangLexer = new PhpLexer(CharStreams.fromFileName(tokens.getFileName()));
            List<Token> list = (List<Token>) golangLexer.getAllTokens();
            for (Token token : list) {
                System.out.println(token.getText() + ":" + token.getType() + ":" + token.getLine());
                
                if(token.getType() != 40 && token.getType() != 41 && token.getType() != 39 && token.getType() != 4 && token.getLine() > 0) {
                    tokenEntries.add(new TokenEntry(token.getText(), tokens.getFileName(), token.getLine()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();;
        } finally {
            tokenEntries.add(TokenEntry.getEOF());
        }
    }

    // private Deque<Character> commentTokens;
    // private boolean inComment = false;
    // private char EOL = '\n';
    //
    // @Override
    // public void tokenize(SourceCode tokens, Tokens tokenEntries) {
    // commentTokens = new ArrayDeque<Character>();
    // List<String> code = tokens.getCode();
    // for (int i = 0; i < code.size(); i++) {
    // String currentLine = code.get(i);
    // if(! isLineContainedOnlySkipStr(currentLine)) {
    // for (int j = 0; j < currentLine.length(); j++) {
    // char tok = currentLine.charAt(j);
    // if (!Character.isWhitespace(tok) && tok != '{' && tok != '}' && tok !=
    // ';' && isValidToken(tok) && tok != '/') {
    // tokenEntries.add(new TokenEntry(String.valueOf(tok),
    // tokens.getFileName(), i + 1));
    // }
    // }
    // }
    // isValidToken(EOL);
    // }
    // tokenEntries.add(TokenEntry.getEOF());
    // }
    //
    // private boolean isLineContainedOnlySkipStr(String currentLine) {
    // return
    // (StringUtils.equalsAnyIgnoreCase(currentLine.replaceAll("\\s+",""),
    // "<?php") ||
    // StringUtils.equalsAnyIgnoreCase(currentLine.replaceAll("\\s+",""),
    // "?>"));
    // }
    //
    // private boolean isValidToken(char token) {
    // switch (token) {
    // case '/':
    // char tok = peekCommentsToken();
    // switch (tok) {
    // case '*':
    // if (commentTokens.size() == 3) {
    // // comment end
    // inComment = false;
    // popCommentsToken();
    // popCommentsToken();
    // popCommentsToken();
    // }
    // break;
    // case '/':
    // // comment start
    // inComment = true;
    // commentTokens.push(token);
    // break;
    // default:
    // break;
    // }
    // if (!inComment)
    // commentTokens.push(token);
    // break;
    // case '*':
    // char tok2 = peekCommentsToken();
    // switch (tok2) {
    // case '/':
    // // comment start
    // inComment = true;
    // commentTokens.push(token);
    // break;
    // case '*':
    // if (commentTokens.size() == 2 && inComment) {
    // // Bock comment ending start
    // commentTokens.push(token);
    // }
    // }
    // break;
    // case '\n':
    // char tok3 = popCommentsToken();
    // if (tok3 == '/') {
    // char tok4 = popCommentsToken();
    // if (tok4 == '/') {
    // // comment end
    // inComment = false;
    // }
    // } else if (tok3 == '*') {
    // commentTokens.push('*');
    // } else if (tok3 == '#') {
    // // comment end
    // inComment = false;
    // }
    // break;
    // case '#':
    // if (!inComment) {
    // // comment start
    // inComment = true;
    // commentTokens.push(token);
    // }
    // break;
    // default:
    // return (!inComment);
    // }
    // return (!inComment);
    // }
    //
    // private char popCommentsToken() {
    // if (!commentTokens.isEmpty())
    // return commentTokens.pop();
    // return EOL;
    // }
    //
    // private char peekCommentsToken() {
    // if (!commentTokens.isEmpty() && null != commentTokens.peek())
    // return commentTokens.peek();
    // return EOL;
    // }
}
