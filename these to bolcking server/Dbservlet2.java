package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Dbservlet")
public class Dbservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Dbservlet2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}


	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException ,ServletException{
		response.setContentType("test/html");
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "infosys";
		String userName = "root";
		String userPass = "basha";
		String query = "select * from employee";
		
		PrintWriter out = response.getWriter();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("\n Driver loaded");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
			System.out.println("Connection established");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				
				out.print("<br>" + rs.getString(1)+ "   " + rs.getString(2)
				+"  " +rs.getString(3));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
