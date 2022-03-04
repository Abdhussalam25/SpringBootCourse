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
      System.out.println(mid+mfname+mlname+msalary);
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
            pstmt=con.prepareStatement("update employee222 set fname=?,lname=?,salary=? where id=?");
             pstmt.setString(1,mfname);
             pstmt.setString(2,mlname);
             pstmt.setInt(3,msalary);
             pstmt.setInt(4,mid);
             //System.out.println("ok");
             int i=0;
             i=pstmt.executeUpdate();
       
            if(i>0)
            {
             %>
             <table border='2' cellspacing='5' cellpadding='5'>
                 <tr><td>Record Modified </td></tr>
                 <tr><td><a href="index.jsp">go back to menu</a></td></tr>
             </table>
             <%
             }
             
         }catch(Exception e){ out.print(e.getMessage());}
%>
    </body>
</html>
