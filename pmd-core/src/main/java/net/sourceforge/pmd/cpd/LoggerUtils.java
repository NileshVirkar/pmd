package net.sourceforge.pmd.cpd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerUtils {

    public static String getLoggingString(String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(new Date()) + " : " + message;
    }
}
