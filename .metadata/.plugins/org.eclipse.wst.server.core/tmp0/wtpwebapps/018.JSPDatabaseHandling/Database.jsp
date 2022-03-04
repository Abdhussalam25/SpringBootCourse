<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

    <%
         Connection con=null;
         Statement stmt=null;
         ResultSet rs=null;
         PreparedStatement pstmt=null;
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
         }catch(ClassNotFoundException cnfe){ out.print(cnfe.getMessage());}
         
         try
         {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmarket","root","San@root123!");
         }catch(Exception e){ out.print(e.getMessage());}
    %>
<%-- 
table:emp2
id,fname,lname,salary 
--%>