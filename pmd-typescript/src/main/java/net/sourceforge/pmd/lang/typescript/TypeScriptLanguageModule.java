/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.typescript;

import net.sourceforge.pmd.lang.BaseLanguageModule;

/**
 * Language Module for typescript.
 */
public class TypeScriptLanguageModule extends BaseLanguageModule {

    /** The name. */
    public static final String NAME = "typescript: Hypertext Preprocessor";
    /** The terse name. */
    public static final String TERSE_NAME = "typescript";

    /**
     * Create a new instance of the PHP Language Module.
     */
    public TypeScriptLanguageModule() {
        super(NAME, "TYPESCRIPT", TERSE_NAME, null, "ts", "class");
        addVersion("", null, true);
    }

}
