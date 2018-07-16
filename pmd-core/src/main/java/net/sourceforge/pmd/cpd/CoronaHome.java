/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import org.apache.commons.configuration.EnvironmentConfiguration;

public class CoronaHome {
    
    private CoronaHome() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static String getExit() {
        String coronaHome = getInner();
        if (coronaHome == null) {
            System.out.println("ERROR!!!! CORONA_HOME not defined");
            System.exit(-1);
        }

        return coronaHome;
    }

    public static String getThrow() {
        String coronaHome = getInner();
        if (coronaHome == null) {
            System.out.println("ERROR!!!! CORONA_HOME not defined");
        }

        return coronaHome;
    }

    public static String get() {
        return getInner();
    }

    private static String getInner() {
        String coronaHome = System.getProperty("CORONA_HOME");
        if (coronaHome == null) {
            coronaHome = new EnvironmentConfiguration().getString("CORONA_HOME");
        }

        if (coronaHome != null) {
            if (!coronaHome.endsWith("/") && !coronaHome.endsWith("\\")) {
                coronaHome += '/';
            }
        }

        return coronaHome;
    }
}
