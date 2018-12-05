/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.cpd.grammer.SolidityLexer;

/**
 * Simple tokenizer for PHP.
 */
public class SolidityTokenizer implements Tokenizer {
    private List<Integer> skipValues;
    
    public SolidityTokenizer() {
        skipValues = Arrays.asList(118, 119);
    }

    @Override
    public void tokenize(SourceCode tokens, Tokens tokenEntries) {
        try {
            SolidityLexer solidityLexer = new SolidityLexer(CharStreams.fromFileName(tokens.getFileName()));
            List<Token> list = (List<Token>) solidityLexer.getAllTokens();
            for (Token token : list) {
                System.out.println(token.getText() + ":" + token.getType() + ":" + token.getLine());
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
