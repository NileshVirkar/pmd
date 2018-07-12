/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

/**
 * Language implementation for TYPESCRIPT
 */
public class TypeScriptLanguage extends AbstractLanguage {

    /**
     * Creates a new TYPESCRIPT Language instance.
     */
    public TypeScriptLanguage() {
        super("TYPESCRIPT", "typescript", new TypeScriptTokenizer(), ".ts", ".tsx");
    }
}
