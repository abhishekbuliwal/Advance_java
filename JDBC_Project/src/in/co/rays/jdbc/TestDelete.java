package in.co.rays.jdbc;

import java.sql.DriverManager;

import java.sql.Statement;

import java.sql.Connection;

public class TestDelete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from marksheet where id =9");
		System.out.println("record deleted " + i + "row affected");
	}

}
