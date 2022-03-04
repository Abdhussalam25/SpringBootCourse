package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarryingFormData
 */
@WebServlet({"/simple" })
public class CarryingFormData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarryingFormData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int traineeId = Integer.parseInt(request.getParameter("tid"));
		String traineeName = request.getParameter("tname");
		String contact= request.getParameter("tcontact");
		
		out.print("==================");
		out.print("<br>Trainees Id " + traineeId);
		out.print("<br>Trainees name " + traineeName);
		out.print("<br>Trainees contact " + contact);
		
		
	}

}
