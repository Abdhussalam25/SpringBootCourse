package jdbcconnection.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddRecordToEmployeeTable {

	public static void main(String[] args) {
		//1.declare required references
				//Connection
				
				Connection connection = null;
				//Statement stmt = null;
				PreparedStatement preparedStmt = null;
				ResultSet rs = null;
				
				String url = "jdbc:mysql://localhost:3306/";
				String username = "root";
				String password = "basha";
				String dbname = "infosys";
				System.out.println("hi all");
				String query = "insert into employees(empid,empname,salary,location) values(?,?,?,?)";
				// 2.REgister the driver with drive manager
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("jdbc driver loaded");
					
				//3.Create connection to db
					connection = DriverManager.getConnection(url+dbname,username,password);
					System.out.println("Connection established");
					
					//4. creating statements
					preparedStmt = connection.prepareStatement(query);
					
				   //5. excute query and store the rsults in resultset
					//PreparedStatement preparedStmt = conn.prepareStatement(query);
					  preparedStmt.setInt (1, 7);
				      preparedStmt.setString (2, "fadheela");
				      preparedStmt.setInt    (3, 50000);
				      preparedStmt.setString (4, "RAN");
				      
//				      preparedStmt.setDate   (3, startDate);
//				      preparedStmt.setBoolean(4, false);
//				     
				      preparedStmt.execute();
					
					System.out.println("Transaction completed");
					
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}


	}

}
