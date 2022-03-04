package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String num1=request.getParameter("num1");
		String output="<html><head><title>Find sum of numbers</title></head>";
		output+="<body bgcolor='cyan'>";
		output+="<form action='SecondServlet' method='get'>";
		output+="<label>Enter Second Number:</label>";
		output+="<input type='text' name='num2'/>";
		output+="<br><input type='submit' value='Next==>'>";
		output+="<input type='button' value='<===Prev' onclick='history.go(-1)'>";
		output+="<br><input type='hidden' name='num1' value='"+num1+"'/>";
		output+="</form></body</html>";
		out.print(output);
	}

}
