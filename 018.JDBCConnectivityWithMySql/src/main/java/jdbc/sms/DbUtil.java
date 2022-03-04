package jdbc.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/";
		String username="root";
		String userpass="San@root123!";
		String dbname="infosys";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		connection=DriverManager.getConnection(url+dbname,username,userpass);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return(connection);
	}

}
