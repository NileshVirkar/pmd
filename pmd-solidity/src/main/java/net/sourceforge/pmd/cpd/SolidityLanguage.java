/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

/**
 * Language implementation for SOLIDITY
 */
public class SolidityLanguage extends AbstractLanguage {

    /**
     * Creates a new SOLIDITY Language instance.
     */
    public SolidityLanguage() {
        super("SOLIDITY", "solidity", new SolidityTokenizer(), ".sol", ".class");
    }
}
