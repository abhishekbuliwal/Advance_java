package in.co.rays.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class TestInsertByBankAccount {
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
			System.out.println("Connection established successfully: " + conn.getCatalog());
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate(
					"insert into bankaccount values(789,'Krishna joshi','Saving',5600.00,'Inodre'),(456,'Pradhan','Saving',1100.00,'kota'),(123,'Riya','current',212354.00,'Dewas'),(741,'prince','Current',235600.00,'jaipur'),(852,'mohit','Saving',250000.00,'mhow')");
			System.out.println("Inserted into bankaccount " + i + " rows affected");

		}
	}


