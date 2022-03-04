package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int num3=Integer.parseInt(request.getParameter("num3"));
		int sum=num1+num2+num3;
		out.print("<html><head><title>Find sum of numbers</title></head>");
		out.print("<body bgcolor='golden'>");
		out.print("<font color='white'>"+num1+"+"+num2+"+"+num3+"="+sum+"</font>");
		out.print("<input type='button' value='<===Prev' onclick='history.go(-1)'>");
		out.print("<input type='button' value='close me' onclick='window.close()'>");
		out.print("</form></body</html>");
	}
}
