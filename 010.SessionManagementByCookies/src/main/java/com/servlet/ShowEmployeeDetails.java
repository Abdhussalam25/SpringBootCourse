package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowEmployeeDetails")
public class ShowEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ShowEmployeeDetails() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String contacts =  request.getParameter("contacts");
		Cookie cookie = new Cookie("contacts",contacts);
		   cookie.setMaxAge(60*60);		   
		   response.addCookie(cookie);
		   
		   Cookie cookies[] = request.getCookies();
		   
		   System.out.println(cookies);
		   
		   for(Cookie cook: cookies) {
			   System.out.println("Cookie name :" + cook.getName());
			   System.out.println("Cookie value :" + cook.getValue());
		   }
		   
		   if(cookies.length>0) {
			   out.print("<br> Showing Cookies value: </br>");
			   for(Cookie cookie1:cookies) {
				   // use if here
				   out.print("Cookie name" + cookie1.getName() + " and value is:" + cookie1.getValue() );
				   
			   }
		   }
		   
		   
		   
		   
	
	}

}
