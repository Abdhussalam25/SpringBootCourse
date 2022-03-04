package jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AddRecordToEmployeeTable {

	public static void main(String[] args) {
		//1. declare required references
				Connection connection=null;
				PreparedStatement pstmt=null;
				String url="jdbc:mysql://localhost:3306/";
				String username="root";
				String userpass="San@root123!";
				String query="insert into employee(empname,salary,address)values(?,?,?)";
				String dbname="infosys";

				//2. Load and register the driver with DriverManager
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.print("\nDriver loaded..");

					//3. Establishing connection to db
					connection=DriverManager.getConnection(url+dbname,username,userpass);
					System.out.print("\nConnection established..");
					
					//4. Creating statements
					pstmt=connection.prepareStatement(query);
					pstmt.setString(1, "Harsha");
					pstmt.setFloat(2, 67900);
					pstmt.setString(3, "Delhi");
					System.out.print("\nStatement created..");
					
					//5. Execute and store result from query
					int i=pstmt.executeUpdate();
					if(i>0)
					System.out.print("\nQuery executed and tuple added successfully..");
					else
						System.err.print("\nQuery failed to execute..");
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
	}

}
