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


@WebServlet("/contactDetails")
public class ContactDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ContactDetails() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String designation=request.getParameter("designation");
		HttpSession session=request.getSession(false);
		session.setAttribute("designation",designation);
		session.setMaxInactiveInterval(45);
		String output="<html><head><title>Getting Employee Contact</title></head>"
				+"<body>"
				+"<form action='showEmployeeDetails' method='post'>"
				+"<input type='text' name='contacts'/><br>"
				+"<input type='submit' value='submit'/>"
				+"<input type='reset' value='refresh'/>"
				+"<input type='button' value='Back' onclick='history.go(-1)'/>"
				+"</form></body></html>";
				out.print(output);
				
		
	}

}
