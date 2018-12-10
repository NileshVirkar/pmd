/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.cpd.grammer.GolangLexer;

/**
 * Implements a tokenizer for the Go Language.
 *
 * @author oinume@gmail.com
 */
public class GoTokenizer implements Tokenizer {
    private List<Integer> skipValues;
    
    public GoTokenizer() {
        skipValues = Arrays.asList(73, 74);
    }

    @Override
    public void tokenize(SourceCode tokens, Tokens tokenEntries) {
        try {
            GolangLexer golangLexer = new GolangLexer(CharStreams.fromFileName(tokens.getFileName()));
            List<Token> list = (List<Token>) golangLexer.getAllTokens();
            for (Token token : list) {
                //System.out.println("line number:" + token.getLine() + "," + token.getText());   
                
                if(! skipValues.contains(token.getType()) && token.getLine() > 0) {
                    tokenEntries.add(new TokenEntry(token.getText(), tokens.getFileName(), token.getLine()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            tokenEntries.add(TokenEntry.getEOF());
        }
    }
}
