package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showEmployeeDetails")
public class ShowEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowEmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String contacts=request.getParameter("contacts");
		Cookie cookie1=new Cookie("contacts",contacts);
		cookie1.setMaxAge(60*60);
		response.addCookie(cookie1);
		Cookie cookies[]=request.getCookies();
		if(cookies.length>0) {
			out.print("<br>Showing cookies value:");
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("fname") 
				|| cookie.getName().equals("lname")
				|| cookie.getName().equals("contacts")
				|| cookie.getName().equals("designation")) {
					out.print("<br>"+cookie.getName()+":<input type='text' value='"+cookie.getValue()+"'disabled/>");	
				}
			}
		
			
		}
		out.print("<input type='button' value='close me' onclick='window.close()'/>");
	}

}
