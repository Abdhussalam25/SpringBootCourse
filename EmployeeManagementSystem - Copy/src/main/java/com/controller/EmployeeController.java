package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;



/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeController() {
        super();
       
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		
//		 try {
//		        Class.forName("com.mysql.cj.jdbc.Driver");
//		        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
//		        Statement st=conn.createStatement();
//		        
//		       // ResultSet rs=st.executeQuery("update employee set () values() where empId=" + updateId); 
//		        if(rs.next()){
//		        	
//		        	response.sendRedirect("employeeById.jsp?empId="+updateId);
//		        	
//		        }else {
//		        	out1.print("<h3 style='color:red'> Entered id is not found Please enter a valid id</h3>");
//		        }
//		        
//		 }catch(Exception e) {
//			 System.out.println(e.getMessage());
//		 }
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out1 = response.getWriter();
		String empIds = request.getParameter("empId");
		String delIds = request.getParameter("deleteId");
		int delId;
		if(delIds!=null) {
			delId = Integer.parseInt(delIds);
			 try {
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
			        Statement st=conn.createStatement();
			        
			        ResultSet rs=st.executeQuery("select * from employee where empId=" + delId); 
			        if(rs.next()){
			        	PreparedStatement stmt=conn.prepareStatement("delete from employee where empId=?");  
			        	stmt.setInt(1,delId);  
			        	  
			        	int i=stmt.executeUpdate();  
			        	System.out.println(i+" records deleted");  
			        	
			        	response.sendRedirect("employeeList.jsp");
			        }else {
			        	out1.print("<h3 style='color:red'> Entered id is not found Please enter a valid id</h3>");
			        }
			        
			 }catch(Exception e) {
				 System.out.println(e.getMessage());
			 }
			
		}
		
		
		
		String serchmodids = request.getParameter("searchModId");
		
		int serchmodid;
		if(serchmodids!=null) {
			serchmodid = Integer.parseInt(serchmodids);
			 try {
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
			        Statement st=conn.createStatement();
			        
			        ResultSet rs=st.executeQuery("select * from employee where empId=" + serchmodid); 
			        if(rs.next()){
			        	
			        	response.sendRedirect("employeeById.jsp?empId="+serchmodid);
			        	
			        }else {
			        	out1.print("<h3 style='color:red'> Entered id is not found Please enter a valid id</h3>");
			        }
			        
			 }catch(Exception e) {
				 System.out.println(e.getMessage());
			 }
			
		}
		
		
		
		int empId;
		if(empIds != null) {
			 empId = Integer.parseInt(empIds);	
			 System.out.println("inside if empid is" +empId);

			 try {
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
			        Statement st=conn.createStatement();
			        
			        ResultSet rs=st.executeQuery("select * from employee where empId=" + empId); 
			        //System.out.println(rs.getInt("empId"));
			        
			       //System.out.println(rs);
			      
			        
			        int i=0;
			       
			        
			        if(rs.next()) {
	               
			        	 out1.println("<table>");
			        	 out1.println("<thead>");
			             out1.println("<tr>");
			             out1.println("<th> S.No </th>");
			             out1.println("<th> Employee Id </th>");
			             out1.println("<th> FirstName </th>");
			             out1.println("<th> LasttName </th>");
			             out1.println("<th> Address </th>");
			             out1.println("<th> Department </th>");
			             out1.println("<th> Basic Salary </th>");
			             out1.println("<th> Gross Salary </th>");
			             out1.println("</tr>");
			             out1.println("</thead>");
						 out1.println("<tbody>");      
			        
			     
			        	
			        	i++; 
			        	//System.out.println(rs.getInt("empId"));
			        	out1.println("<tr>");
			        	
			              
			            	 			out1.println("<td>"  + i  +  "</td>" );
			            	 			out1.println("<td>" +  rs.getInt("empId")+ "</td>" );
			                        	 out1.println("<td>" +  rs.getString("empFName")+ "</td>" );
			                        	 out1.println("<td>" +  rs.getString("empLastName")+ "</td>" );
			                         	 out1.println("<td>" +  rs.getString("address")+ "</td>" );
			                          	 out1.println("<td>" +  rs.getString("department")+ "</td>" );
			                           	 out1.println("<td>" +  rs.getString("basicSalary")+ "</td>" );
			                             out1.println("<td>" +  rs.getString("grossSalary")+  "</td>" );
			                        
							 out1.println("</tr>");

			        	
			        
			     
					out1.println("</tbody>");

					out1.println("</table>");
			        }else {
			        	out1.print("<h4>The entered id is not present</h4>" );
			        }
			
		}catch(Exception e){
		      e.printStackTrace();
		      
		} 
		}
		
		
		
		
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
	}
	
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String updateIds = request.getParameter("updateId");
		 PrintWriter out1 = response.getWriter();
		int updateId;
		if(updateIds==null) {	
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");		
	
		String department = request.getParameter("department");
		String salaryText = request.getParameter("salary");
		String address = request.getParameter("address");
		float salary = Float.parseFloat(salaryText);	
		
		Employee employee =  new Employee(firstName,lastName,address,department,salary);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();	
		
		Transaction tx = session.beginTransaction();
		
		session.save(employee);

		tx.commit();
		System.out.println("\n data saved successfully");
		

		
		out.print("    entered values are \n" + firstName + "\n"+lastName 
				+ "\n"+department + " \n" +address + " \n" +salary);
		
		response.sendRedirect("adminPage.jsp?employees=employee");
		
	}else {
		
		updateId = Integer.parseInt(updateIds);
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");		
	
		String department = request.getParameter("department");
		String salaryText = request.getParameter("salary");
		String address = request.getParameter("address");
		float salary = Float.parseFloat(salaryText);	
		
		System.out.println("Id to be updated is: " + updateId);
		System.out.println(lastName);
		 try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
		       // Statement st=conn.createStatement();
		        String query = "update employee set address=?,basicSalary=?,department=?,empFname=?,empLastName=? where empId=?";
		        PreparedStatement pstmt = conn.prepareStatement(query);
		        pstmt.setString(1,address);
		        pstmt.setFloat(2, salary);
		        pstmt.setString(3, department);
		        pstmt.setString(4, firstName);
		        pstmt.setString(5, lastName);
		        pstmt.setInt(6, updateId);        
		        
//		        PreparedStatement stmt=conn.prepareStatement("update emp set name=? where id=?");  
//		        pstmt.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name  
//		        stmt.setInt(2,101);  
		          
		        int i=pstmt.executeUpdate();  
		        System.out.println(i+" records updated");  		       
		     
		       
		        System.out.println("updated successfully");
		        response.sendRedirect("employeeList.jsp");
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		
			
	    	
			
			
		
		
	}
}

}
