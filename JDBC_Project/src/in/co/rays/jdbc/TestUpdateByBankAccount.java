package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdateByBankAccount {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		System.out.println("Connection established successfully " + conn.getCatalog());
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("Update bankaccount set branchName = 'Indore' where accountHolderName = 'pradhan'");
		System.out.println("Record updated " + i + " row affected");

	}
}
