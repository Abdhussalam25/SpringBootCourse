package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/designation")
public class DesignationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DesignationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		Cookie cookie1=new Cookie("fname",fname);
		cookie1.setMaxAge(60*60);
		Cookie cookie2=new Cookie("lname",lname);
		cookie2.setMaxAge(60*60);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		String output="<html><head><title>Getting Employee designation</title></head>"
		+"<body>"
		+"<form action='contactDetails' method='post'>"
		+"<input type='text' name='designation'/><br>"
		+"<input type='submit' value='submit'/>"
		+"<input type='reset' value='refresh'/>"
		+"<input type='button' value='Back' onclick='history.go(-1)'/>"
		+"</form></body></html>";
		out.print(output);
		
		
		
		
		
		
		
	}

}
