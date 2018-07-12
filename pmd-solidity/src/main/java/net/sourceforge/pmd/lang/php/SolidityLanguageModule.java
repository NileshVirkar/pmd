/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.php;

import net.sourceforge.pmd.lang.BaseLanguageModule;

/**
 * Language Module for Solidity.
 */
public class SolidityLanguageModule extends BaseLanguageModule {

    /** The name. */
    public static final String NAME = "Solidity: Hypertext Preprocessor";
    /** The terse name. */
    public static final String TERSE_NAME = "Solidity";

    /**
     * Create a new instance of the PHP Language Module.
     */
    public SolidityLanguageModule() {
        super(NAME, "Solidity", TERSE_NAME, null, "solidity", "class");
        addVersion("", null, true);
    }

}
