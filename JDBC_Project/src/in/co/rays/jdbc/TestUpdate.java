package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("update marksheet set Name ='Riya Gupta' where id =4");
		System.out.println("record update " + i + "row affected");
	}

}
