package com.serlvet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url")
public class MyUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyUrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("userid"));
		String pass=request.getParameter("password");
		String url=null;
		if((id==1) && pass.equals("san@123!")) {
			url=response.encodeUrl("RightInfoServlet?uname="+id+"&upass="+pass);
			System.out.print("\n"+url);
			out.print("<h3><p>you have entered correct information..</h3>");
			out.print("<br><a href='"+url+"'>click me to show entered information</a>");
					
		}else {
			    url=response.encodeUrl("WrongInfoServlet?uname="+id+"&upass="+pass);
			    
			out.print("<h3><p>you have entered wrong information..</h3>");
			out.print("<br><a href='"+url+"'>click me to show entered information</a>");
		}
	}

}
