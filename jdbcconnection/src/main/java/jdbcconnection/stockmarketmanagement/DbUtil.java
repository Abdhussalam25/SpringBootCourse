package jdbcconnection.stockmarketmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtil {
	
	public void getConnection() {
	Connection connection = null;
	Statement stmt = null;
	PreparedStatement preparedStmt = null;
	ResultSet rs = null;

	String url = "jdbc:mysql://localhost:3306/";
	String username = "root";
	String password = "basha";
	String dbname = "infosys";
	String query = "insert into stocks(empid,empname,salary,location) values(?,?,?,?)";
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("jdbc driver loaded");
		
	//3.Create connection to db
		connection = DriverManager.getConnection(url+dbname,username,password);
		System.out.println("Connection established");
		
		//4. creating statements
		preparedStmt = connection.prepareStatement(query);
		
	   
	      preparedStmt.execute();
		
		System.out.println("Transaction completed");
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

	}
}
	

