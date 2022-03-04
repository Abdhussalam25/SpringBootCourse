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
		//Returns the current session associated with this request,or 
		//if the request does not have a session, creates one.
		HttpSession session=request.getSession();
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		//Specifies the time, in seconds, between client requests before theservlet 
		//container will invalidate this session. 
		session.setMaxInactiveInterval(45);
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
