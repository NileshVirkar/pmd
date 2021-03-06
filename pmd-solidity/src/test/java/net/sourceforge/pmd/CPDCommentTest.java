/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import net.sourceforge.pmd.cpd.CPD;
import net.sourceforge.pmd.cpd.CPDConfiguration;
import net.sourceforge.pmd.cpd.Language;
import net.sourceforge.pmd.cpd.Mark;
import net.sourceforge.pmd.cpd.Match;
import net.sourceforge.pmd.cpd.SolidityLanguage;

public class CPDCommentTest {

    @Test
    public void phpCpdCommentTest() {
        CPDConfiguration cpdConfiguration = new CPDConfiguration();
        Language language = new SolidityLanguage();

        cpdConfiguration.setMinimumTileSize(8);
        cpdConfiguration.setLanguage(language);
        cpdConfiguration.setSkipLexicalErrors(true);
        cpdConfiguration.setIgnoreIdentifiers(true);

        CPD cpd = new CPD(cpdConfiguration);
        ClassLoader classLoader = getClass().getClassLoader();
        File file1 = new File(classLoader.getResource("solidity1.sol").getFile());
        File file2 = new File(classLoader.getResource("solidity2.sol").getFile());
        try {
            cpd.add(file1);
            cpd.add(file2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cpd.go();
        List<Match> matches = new ArrayList<>();
        Iterator<Match> matchesIter = cpd.getMatches();
        while (matchesIter.hasNext()) {
            matches.add(matchesIter.next());
        }

//        assertTrue(matches.size() == 1);
//        assertTrue(matches.get(0).getMarkCount() == 2);
//
//        Iterator<Mark> iterator = matches.get(0).getMarkSet().iterator();
//        while (iterator.hasNext()) {
//            Mark mark = iterator.next();
//            assertTrue(mark.getBeginLine() == 5);
//            assertTrue(mark.getEndLine() == 14);
//            assertTrue(mark.getLineCount() == 10);
//        }

         System.out.println(matches.size());
         
         for (Match match : matches) {
             Set<Mark> marks = match.getMarkSet();
             for (Mark mark : marks) {
                 System.out.println(mark.toString());
             }
         }
    }
}
