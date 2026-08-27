package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws Exception {

		// step 1. Load Driver Class into the class loader
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2. Make Connection to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		System.out.println("connection established successfully.... " + conn.getCatalog());

		// step 3. create Statement and get ResultSet or insert, update and delete
		// records

		Statement stmt = conn.createStatement();

		// step 4 get records
		ResultSet rs = stmt.executeQuery("select * from marksheet");

		while (rs.next()) {
			System.out.println(rs.getInt("ID"));
			System.out.println(rs.getInt("RollNo"));
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getInt("Phy"));
			System.out.println(rs.getInt("chm"));
			System.out.println(rs.getInt("total"));
			System.out.println(rs.getDouble("persentage"));
			System.out.println(rs.getString("Result"));
			System.out.println("--------------");

		}
	}
}
