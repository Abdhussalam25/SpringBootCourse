package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DesignationServlet")
public class DesignationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public DesignationServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname =  request.getParameter("fname");
		String lname =  request.getParameter("lname");
		
		HttpSession session = request.getSession();
		
		// just like servlet context we will store the cookies 
		//size is 4kb so quite easy but user has to allow
		//life priod can be set for cookies
		
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		
		session.setMaxInactiveInterval(45);
		
		String output = "<html><head><title>Getting Employee designation</title></head>"
				+ "<body> "
				+ "<form action='ContactDetails' method='post'>"
				+ "<input type='text' name='designation'/><br>"
				+ "<input type='submit' value='submit'/>"
				+ "<input type='reset' value='refresh'/>"
				+ "<input type=button value='Back' onClick=history.go(-1)'/>"
				+ "</form></body></html>";
		out.print(output);
				
				
				
				}

}
