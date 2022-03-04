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
import javax.servlet.http.HttpSession;


@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter();
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("userName", userName);
		
		
		
		if(userName != null && password != null) {
		
		try {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");			
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("select * from `admin_table` where `user_name`='"+userName+"' and `password`='"+password+"'");
				
				
				if(rs.next())
				{
					
					response.sendRedirect("adminPage.jsp");
					
				}
				else
				{
					response.sendRedirect("admin.jsp?credencials=invalid");
				}
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}else {
			
			out.print("<h4 style='color:red'> Either Username or Password is null  </h4>");
			
		}
		
		
	}

}
