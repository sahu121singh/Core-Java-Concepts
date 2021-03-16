package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) throws SQLException {
		
		// Create connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "hr", "hr");
		
		// Create a query/statement
		Statement stmt = con.createStatement();
		// String s = "insert into student values(101, 'smith)";   // ==> insert data
		// String s = "update student set sname = 'KIM' where sid = 105 "; // ==> update name value
		
		String s = "delete student where sid = 105";  // ==> delete row/recode
		
		// Execute query
		stmt.executeQuery(s);
		
		// close connection
		con.close();
		
		System.out.println("Program is completed");

	}

}
