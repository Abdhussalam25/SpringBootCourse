package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greetings
 */
@WebServlet("/Greetings")
public class Greetings extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Greetings() {
        super();
        
    }	
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// so here inside the out it will act as simple html page
		String name = request.getParameter("name");
		if(name == null) {
		out.print(" Hi Guest user You all are welcome in server programming");
		
		}else 
		out.print("<br> Hi " +name+" welcome");
		
		
		
	}

}
