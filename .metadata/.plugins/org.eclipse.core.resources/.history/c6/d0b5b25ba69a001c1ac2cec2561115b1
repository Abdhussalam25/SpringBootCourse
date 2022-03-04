<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
       <%
         Connection con=null;
         Statement stmt=null;
         ResultSet rs=null;
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             //System.out.println("driver loaded");
         }catch(ClassNotFoundException cnfe){ out.print(cnfe.getMessage());}
         
         try
         {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmarket","root","San@root123!");
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from employee222");
            %>
             <table border='2' bgcolor='cyan' bordercolor='pink' cellspacing='5' cellpadding='5'>
                 <tr><th>Emp Id</th><th>First Name</th><th>Last Name</th><th>Salary</th>
                 <th>Action1</th><th>Action2</th><th>Action3</th></tr>
             <%
              int mid=0;
             while(rs.next())
             {  mid=rs.getInt(1);   %>
                <tr><td><%=mid%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td>
                <td><%=rs.getInt(4)%></td>
                <td><a href="Display.jsp?id=<%=mid%>" >Display</a></td>
                <td><a href="Modify.jsp?id=<%=mid%>" >Modify</a></td>
                <td><a href="Delete.jsp?id=<%=mid%>" >Delete</a></td>
                </tr>
                             <%   
             }%>
             <tr><td colspan="7" align="center"><a href="Addition.jsp">Add New Record</a></td></tr>  
        <!--   <tr><td colspan="7" align="center"><a href="UploadExcelFile.jsp">Add New Records By Excel File</a></td></tr> -->  
          <tr><td colspan="7" align="center"><input type='button' value='Exit' onClick='window.close();'></td></tr>
        <% }catch(Exception e){ out.print(e.getMessage());}
%>
    </center></table></body>
</html>
