/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.IOException;

import org.junit.Test;

public class PygmentsTokenizerTest {

    @Test
    public void test1() throws IOException {
        PygmentsTokenizer pygmentsTokenizer = new PygmentsTokenizer();
        pygmentsTokenizer.tokenizeFile("C:/corona/cpdcode/java/DemoCode.java");
    }
}
