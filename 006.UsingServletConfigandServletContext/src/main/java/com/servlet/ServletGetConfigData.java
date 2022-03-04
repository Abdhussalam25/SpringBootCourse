package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetConfigData
 */
@WebServlet({ "/ServletGetConfigData", "/config" })
public class ServletGetConfigData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletGetConfigData() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String empid  = config.getInitParameter("empid");
		String name  = config.getInitParameter("name");
		String serverName = config.getServletName();
		out.print("<br>empid: " + empid);
		out.print("<br>empname: " + name);
		out.print("<br>servlet name: " + serverName);
		
		
	}

}
