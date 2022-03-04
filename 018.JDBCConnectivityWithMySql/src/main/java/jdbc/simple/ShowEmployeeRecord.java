package jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowEmployeeRecord {

	public static void main(String[] args) {
		//1. declare required references
		Connection connection=null;
		Statement stmt=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/";
		String username="root";
		String userpass="San@root123!";
		String query="Select * from employee";
		String dbname="infosys";

		//2. Load and register the driver with DriverManager
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("\nDriver loaded..");

			//3. Establishing connection to db
			connection=DriverManager.getConnection(url+dbname,username,userpass);
			System.out.print("\nConnection established..");

			//4. Creating statements
			stmt=connection.createStatement();
			System.out.print("\nStatement created..");

			//5. Execute and store result from query
			rs=stmt.executeQuery(query);
			System.out.print("\nQuery executed and Resultset returned..");

			//5. Display the result
			while(rs.next()) {
				System.out.print("\nempid="+rs.getInt(1)+"\tName="+rs.getString(2)
				+"\tSalary"+rs.getFloat(3)+"\tDesignation="+rs.getString(4));
			}

		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
