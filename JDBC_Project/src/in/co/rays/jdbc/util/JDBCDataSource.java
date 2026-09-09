package in.co.rays.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class JDBCDataSource {

	public static Connection getConnection() {
		ResourceBundle r = ResourceBundle.getBundle("in.co.rays.jdbc.bundlee.app");
		Connection conn = null;

		try {
			Class.forName(r.getString("driver"));
			conn = DriverManager.getConnection(r.getString("url"), r.getString("username"), r.getString("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void trnRollBack(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
