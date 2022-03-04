package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
		
		// just like servlet context we will store the cookies 
		//size is 4kb so quite easy but user has to allow
		//life priod can be set for cookies
		
		Cookie cookie1 = new Cookie("fname",fname);
		Cookie cookie2 = new Cookie("lname",lname);
		
		//cookie1.setMaxAge(0) this 0 will delete the cookie
		
		cookie1.setMaxAge(60*60);
		cookie2.setMaxAge(60*60);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
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
