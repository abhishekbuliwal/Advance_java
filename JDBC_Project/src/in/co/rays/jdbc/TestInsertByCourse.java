package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertByCourse {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		System.out.println("Connection established successfully: " + conn.getCatalog());
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate(
				"insert into Course values(10101,'BBA','3 years',60000.00,'Poonam Yadav'),(10102, 'BCA','3 years',50000.00,'Jitender Sharma'),(10103,'BSC','3 years',55000.00,'Ekta Agrwal'),(10104,'MCA','2 years',10000.00,'Deepika Rai')");
		System.out.println("Data inserted " + i + " rows affected");

	}

}
