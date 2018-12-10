
package net.sourceforge.pmd.cpd;

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
        Language language = new ObjectiveCLanguage();

        cpdConfiguration.setMinimumTileSize(75);
        cpdConfiguration.setLanguage(language);
        cpdConfiguration.setSkipLexicalErrors(true);

        CPD cpd = new CPD(cpdConfiguration);
        ClassLoader classLoader = getClass().getClassLoader();
        File file1 = new File(classLoader.getResource("objectivec1.m").getFile());
        File file2 = new File(classLoader.getResource("objectivec2.m").getFile());
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

        System.out.println(matches.size());
        
        for (Match match : matches) {
            Set<Mark> marks = match.getMarkSet();
            for (Mark mark : marks) {
                System.out.println(mark.toString());
            }
        }
    }
}
