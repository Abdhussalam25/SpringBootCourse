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
            pstmt=con.prepareStatement("select * from employee222 where id=?");
             pstmt.setInt(1,mid);
             rs=pstmt.executeQuery();
                     
            if(rs.next())
            {
             %>
             <table border='2' cellspacing='5' cellpadding='5'>
                 <tr><td>Emp Id</td><td><%=rs.getInt(1)%></td></tr>
                 <tr><td>First Name</td><td><%=rs.getString(2)%></td><tr>
                 <tr><td>Last Name</td><td><%=rs.getString(3)%></td></tr>
                 <tr><td>Salary</td><td><%=rs.getInt(4)%></td></tr>
                 <tr><td><a href="index.jsp">go back to menu</a></td>
                     <td><a href="Del.jsp?id=<%=mid%>">Delete Record</a></td></tr>
             </table>
             <%
             }
             
         }catch(Exception e){ out.print(e.getMessage());}
%>
    </body>
</html>
