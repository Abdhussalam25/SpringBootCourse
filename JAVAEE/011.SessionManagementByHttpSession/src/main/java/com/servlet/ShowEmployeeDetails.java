package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
		HttpSession session=request.getSession(false);
		session.setAttribute("contacts",contacts);
		session.setMaxInactiveInterval(45);
		Enumeration <String>enums=session.getAttributeNames();
		out.print("<br>Showing session objects added:");
		String str=null;
		while(enums.hasMoreElements()) {

			str=enums.nextElement();
			out.print("<br>"+str+":<input type='text' value='"+session.getValue(str)+"'disabled/>");	
		}
		out.print("<input type='button' value='close me' onclick='window.close()'/>");
	}
}
