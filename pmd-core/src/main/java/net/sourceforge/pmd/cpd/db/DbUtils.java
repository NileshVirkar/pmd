package net.sourceforge.pmd.cpd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;

public class DbUtils {

	public static Connection getRawConnection(String connStr, String proxyUser, String schema) throws SQLException {
		// The original code without connection pooling

		// return DriverManager.getConnection(actualConnStr, dbUserName,
		// dbPassword);
		Connection conn = DriverManager.getConnection(connStr);
		if (StringUtils.isNotEmpty(proxyUser) && ! useH2(connStr)) {
			DbUtils.setRoleOnConn(conn, proxyUser);
		}

		if (StringUtils.isNotEmpty(schema) && ! useH2(connStr)) {
			DbUtils.setSearchPathOnConn(conn, schema);
		}
		return conn;
	}
	
	public static boolean useH2(String connStr) {
		return StringUtils.startsWith(connStr, "jdbc:h2:");
	}

	public static void executeUpdateAndClose(IConnectionProxy conn, String query) throws SQLException {
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			conn.commit();
		} finally {
			closeStmt(stmt);
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
			}
		}
	}

	public static void closeStmt(PreparedStatement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
			}
		}
	}

	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

	private static boolean isClosed(Connection conn) {
		try {
			return conn.isClosed();
		} catch (SQLException e) {
		    System.err.println("Error checking is closed" + e);
			return true;
		}
	}

	public static int getLastInsertedId(Statement stmt) throws SQLException {
		try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
			if (generatedKeys.next()) {
				return generatedKeys.getInt(1);
			} else {
				throw new SQLException("Insertion failed, no ID obtained.");
			}
		}
	}

	public static void setRoleOnConn(Connection conn, String role) throws SQLException {
		conn.createStatement().execute("set role " + role);
	}

	public static void setSearchPathOnConn(Connection conn, String searchPath) throws SQLException {
		conn.createStatement().execute("set search_path = " + searchPath);
	}
}
