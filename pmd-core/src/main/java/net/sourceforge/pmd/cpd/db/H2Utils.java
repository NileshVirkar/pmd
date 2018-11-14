package net.sourceforge.pmd.cpd.db;

import java.io.File;

import org.apache.commons.lang3.StringUtils;

public class H2Utils {
	public static void loadDriver() {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
		    
		}
	}

	public static String getActualConnStr(String connStr, String projectName, String dataDir) {
		return getActualConnStr(connStr, projectName, dataDir, null);
	}
	
	public static String getActualConnStr(String connStr, String projectName, String dataDir, String dbName) {
		//System.out.println("connStr=" + connStr);
		System.out.println("projectName=" + projectName);
		System.out.println("dataDir=" + dataDir);
		String actualConnStr = StringUtils.replace(connStr, "${dataDir}", dataDir)
				.replace("${projectName}", projectName).replace("\\", "/");
		if(StringUtils.isEmpty(dbName)) {
			dbName = "cpd";
		}
		
		actualConnStr =  StringUtils.replace(actualConnStr, "${dbName}", dbName);
		return actualConnStr;
	}
	
//	public static String getDbDir(String connStr) {
//		String dbDir = StringUtils.substringAfterLast(connStr, "jdbc:h2:");
//		dbDir = StringUtils.substringBeforeLast(dbDir, "/");
//		dbDir = EnvVariableExpander.expandEnvironmentVariables(dbDir);
//		return dbDir;
//	}
	
//	public static void deleteH2Db(String iDbDir, String dbName) {
//		DeleteDbFiles.execute(iDbDir, dbName + H2DbInit.H2_DB_SUFFIX , true);
//	}
	
	public static boolean h2DbExists(String dbDir, String dbName) {
		String dbFile = dbDir + File.separator + dbName + ".mv.db";
		return new File(dbFile).exists();
	}
}
