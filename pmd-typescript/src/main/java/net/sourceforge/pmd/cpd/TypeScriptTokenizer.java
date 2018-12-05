/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.grammer.TypescriptLexer;

/**
 * Simple tokenizer for TYPESCRIPT.
 */
public class TypeScriptTokenizer implements Tokenizer {

    private List<Integer> skipValues;
    
    public TypeScriptTokenizer() {
        skipValues = Arrays.asList(117, 118);
    }

    @Override
    public void tokenize(SourceCode tokens, Tokens tokenEntries) {
        try {
            //super.tokenize(tokens, tokenEntries);
            TypescriptLexer java8Lexer = new TypescriptLexer(CharStreams.fromFileName(tokens.getFileName()));
            List<Token> list = (List<Token>) java8Lexer.getAllTokens();
            for (Token token : list) {
                //System.out.println(token.getText() + ":" + token.getType() + ":" + token.getLine());
                
                if(! skipValues.contains(token.getType()) && token.getLine() > 0) {
                    tokenEntries.add(new TokenEntry(token.getText(), tokens.getFileName(), token.getLine()));
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();;
        } finally {
            tokenEntries.add(TokenEntry.getEOF());
        }
    }
}
