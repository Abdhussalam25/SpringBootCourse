package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminPasswordController
 */
@WebServlet("/AdminPasswordController")
public class AdminPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String currentUserName = request.getParameter("currentUserName");
		String currentPassword = request.getParameter("currentPassword");
		String newPassword1 = request.getParameter("newPassword1");
	
		
		if(currentUserName != null && currentPassword != null && newPassword1 != null) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");			
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("select * from `admin_table` where `user_name`='"+currentUserName+"' and `password`='"+currentPassword+"'");
					
				if(rs.next())
				{
					String query = "update `admin_table` set `password`=? where `user_name`=?  and `password`=?";
			        PreparedStatement pstmt = conn.prepareStatement(query);
			        pstmt.setString(1,newPassword1);
			        pstmt.setString(2, currentUserName);
			        pstmt.setString(3, currentPassword);
			        
			        int i=pstmt.executeUpdate();  
			        System.out.println(i+" records updated");  	   
			       
			        System.out.println("updated successfully");
					response.sendRedirect("admin.jsp");
					
					
				}
				else
				{
					response.sendRedirect("admin.jsp?credencials=invalid");
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
		
			
			
		}else {
			out.print("<h4 style='color:red'> All the fields are required </h4>");
		}
		
		
	}

}
