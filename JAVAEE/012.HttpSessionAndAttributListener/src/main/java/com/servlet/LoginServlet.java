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
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userid=request.getParameter("userid");
		out.print("<br>"+userid+" &nbsp you are welcome");
		HttpSession session=request.getSession();
		session.setAttribute("userid", userid);
		ServletContext ctx=getServletContext();
		Integer totalUsers=(Integer)ctx.getAttribute("totalUsers");
		Integer totalActiveUsers=(Integer)ctx.getAttribute("totalActiveUsers");
		
		out.print("<h3>Total Users are:"+totalUsers);
		out.print("<h3>Total Active Users are:"+totalActiveUsers);
		
		out.print("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
		out.print("<br><a href='LogoutServlet'>Logout</a>");
		
	}

}
