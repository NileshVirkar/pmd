/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.cpd.grammer.KotlinLexer;

/**
 * Simple tokenizer for KOTLIN.
 */
public class KotlinTokenizer implements Tokenizer {

    private List<Integer> skipValues;
    
    public KotlinTokenizer() {
        skipValues = Arrays.asList(2, 3, 5);
    }

    @Override
    public void tokenize(SourceCode tokens, Tokens tokenEntries) {
        try {
            KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName(tokens.getFileName()));
            List<Token> list = (List<Token>) kotlinLexer.getAllTokens();
            for (Token token : list) {
                //System.out.println(token.getText() + ":" + token.getType() + ":" + token.getLine());
                
                if(! skipValues.contains(token.getType()) && token.getLine() > 0) {
                    tokenEntries.add(new TokenEntry(token.getText(), tokens.getFileName(), token.getLine()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();;
        } finally {
            tokenEntries.add(TokenEntry.getEOF());
        }
    }
}
