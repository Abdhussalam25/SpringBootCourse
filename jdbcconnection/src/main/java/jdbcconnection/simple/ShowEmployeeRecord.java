package jdbcconnection.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowEmployeeRecord {

	public static void main(String[] args) {
		//1.declare required references
		//Connection
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "basha";
		String dbname = "infosys";
		System.out.println("hi all");
		String query = "select * from employees";
		// 2.REgister the driver with drive manager
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("jdbc driver loaded");
			
		//3.Create connection to db
			connection = DriverManager.getConnection(url+dbname,username,password);
			System.out.println("Connection established");
			
			//4. creating statements
			stmt = connection.createStatement();
			
		   //5. excute query and store the rsults in resultset
			
			rs = stmt.executeQuery(query);	 //  result set is used only for select type query
			
			System.out.println("Query executed");
			while(rs.next()) {
				
				System.out.println("\nempid " + rs.getInt(1) + " \t name " + rs.getString(2)
				+" \tsalary " + rs.getFloat(3) + "\t location " + rs.getString(4));
				
			}
			
			System.out.println("Transaction completed");
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
