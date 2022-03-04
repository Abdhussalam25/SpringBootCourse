package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public LoginServlet() {
        super();
        
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<br>" + userId + "   you are welcome!!");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("userId", userId);
		
		ServletContext ctx =  getServletContext();
		
		int totalUsers = (int) ctx.getAttribute("totalUsers");
		int totalActiveUsers = (int) ctx.getAttribute("totalActiveUsers");
		
		
		out.print("<h3>Total Users are :" + totalUsers +"</h3>");
		
		out.print("<br><br><br><br><br><br><br>");
		
		out.print("<a href='LogoutServlet'> Logout </a>");
		
		
		
		
		
		
		
	}

}
