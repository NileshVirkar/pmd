/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Implements a tokenizer for the Go Language.
 *
 * @author oinume@gmail.com
 */
public class GoTokenizer extends PygmentsTokenizer implements Tokenizer {
    private Deque<Character> commentTokens;
    private boolean inComment = false;

    public GoTokenizer() {
        super(CPDLanguage.GO);

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
