/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple tokenizer for TYPESCRIPT.
 */
public class TypeScriptTokenizer extends PygmentsTokenizer implements Tokenizer {

    public TypeScriptTokenizer() {
        super(CPDLanguage.TYPESCRIPT);

        List<String> skipKeys = new ArrayList<>();
        skipKeys.add("Token.Comment.Multiline");
        skipKeys.add("Token.Comment.Single");
        skipKeys.add("Token.Name.Variable");

        List<String> skipValues = new ArrayList<>();
        skipValues.add("\n");
        skipValues.add(" ");
        skipValues.add("\"");
        skipValues.add("\'");
        super.configureTokenizer(skipKeys, skipValues);
    }

    @Override
    public void tokenize(SourceCode tokens, Tokens tokenEntries) {
        super.tokenize(tokens, tokenEntries);
    }
}
