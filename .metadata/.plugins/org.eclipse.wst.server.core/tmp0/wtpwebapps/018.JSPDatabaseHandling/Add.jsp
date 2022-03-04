<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
        
        int mid=Integer.parseInt(request.getParameter("id"));
        String mfname=request.getParameter("fname");
        String mlname=request.getParameter("lname");
        int msalary=Integer.parseInt(request.getParameter("salary"));
      
         Connection con=null;
         PreparedStatement pstmt=null;
         ResultSet rs=null;
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
         }catch(ClassNotFoundException cnfe){ out.print(cnfe.getMessage());}
         
         try
         {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmarket","root","San@root123!");       
            pstmt=con.prepareStatement("insert into employee222 values(?,?,?,?)");
            pstmt.setInt(1,mid); 
            pstmt.setString(2,mfname);
             pstmt.setString(3,mlname);
             pstmt.setInt(4,msalary);
             
             int i=pstmt.executeUpdate();
                     
            if(i>0)
            {
             %>
             <table border='2' cellspacing='5' cellpadding='5'>
                 <tr><td>New Record Added </td></tr>
                 <tr><td><a href="index.jsp">go back to menu</a></td></tr>
             </table>
             <%
             }
             
         }catch(Exception e){ out.print("error in page");}
%>
    </body>
</html>
