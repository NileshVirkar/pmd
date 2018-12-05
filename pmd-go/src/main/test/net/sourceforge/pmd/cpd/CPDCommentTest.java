
package net.sourceforge.pmd.cpd;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CPDCommentTest {

    @Test
    public void phpCpdCommentTest() {
        CPDConfiguration cpdConfiguration = new CPDConfiguration();
        Language language = new GoLanguage();

        cpdConfiguration.setMinimumTileSize(25);
        cpdConfiguration.setLanguage(language);
        cpdConfiguration.setSkipLexicalErrors(true);

        CPD cpd = new CPD(cpdConfiguration);
        ClassLoader classLoader = getClass().getClassLoader();
        File file1 = new File(classLoader.getResource("go1.go").getFile());
        File file2 = new File(classLoader.getResource("go2.go").getFile());
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
//        if (iterator.hasNext()) {
//            Mark mark = iterator.next();
//            assertTrue(mark.getBeginLine() == 10);
//            assertTrue(mark.getEndLine() == 23);
//            assertTrue(mark.getLineCount() == 14);
//        }
//
//        if (iterator.hasNext()) {
//            Mark mark = iterator.next();
//            assertTrue(mark.getBeginLine() == 4);
//            assertTrue(mark.getEndLine() == 14);
//            assertTrue(mark.getLineCount() == 11);
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
