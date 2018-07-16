/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.junit.Test;

import net.sourceforge.pmd.cpd.CPD;
import net.sourceforge.pmd.cpd.CPDConfiguration;
import net.sourceforge.pmd.cpd.Language;
import net.sourceforge.pmd.cpd.Match;
import net.sourceforge.pmd.cpd.TypeScriptLanguage;

@Ignore
public class TypeScriptCPDPerformanceTest {

    @Test
    public void cpdtest() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        CPDConfiguration cpdConfiguration = new CPDConfiguration();
        Language language = new TypeScriptLanguage();

        cpdConfiguration.setMinimumTileSize(75);
        cpdConfiguration.setLanguage(language);
        cpdConfiguration.setSkipLexicalErrors(true);

        CPD cpd = new CPD(cpdConfiguration);
        addFiles(cpd, "C:/corona/cpdcode/typescript");
        long startTime = System.nanoTime();
        System.out.println(dateFormat.format(new Date()) + "Starting clone detection tool");
        cpd.go();
        System.out.println(dateFormat.format(new Date()) + "Finished clone detection tool");

        List<Match> matches = new ArrayList<>();
        Iterator<Match> matchesIter = cpd.getMatches();
        while (matchesIter.hasNext()) {
            matches.add(matchesIter.next());
        }
        System.out.println(matches.size());
        // for (Match match : matches) {
        // Set<Mark> marks = match.getMarkSet();
        // for (Mark mark : marks) {
        // System.out.println(mark.toString());
        // }
        // }
    }

    private static void addFiles(CPD cpd, String baseDir) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Collection<File> files = FileUtils.listFiles(new File(baseDir), new String[] { "ts" }, true);
            System.out.println(dateFormat.format(new Date()) + "Adding " + files.size() + " files to CPD tool");
            int fileCount = 0;
            for (File file : files) {
                cpd.add(file);
                fileCount++;
                if (fileCount % 100 == 0) {
                    System.out.println(fileCount);
                }
            }
            System.out
                    .println(dateFormat.format(new Date()) + "Finished adding " + files.size() + " files to CPD tool");
        } catch (IOException e) {
            System.out.println("IOException while adding files into CPD");
        }
    }
}
