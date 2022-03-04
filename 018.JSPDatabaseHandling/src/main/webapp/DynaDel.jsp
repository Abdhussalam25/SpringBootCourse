<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>


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
         Enumeration enum1=null;
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
         }catch(ClassNotFoundException cnfe){ out.print(cnfe.getMessage());}
         try
         {
           enum1=request.getParameterNames();
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmarket","root","San@root123!");
           stmt=con.createStatement();
         }catch(Exception e){out.print(e.getMessage());}
         
  if(enum1!=null)
  {     try
        {
            while(enum1.hasMoreElements())
            {
                String str=(String)enum1.nextElement();
                int id=Integer.parseInt(str);
                String query="delete from employee222 where id="+id;
                stmt.executeUpdate(query);
            }
        }catch(Exception e){out.print(e.getMessage());}
    }%>
    
    <form method="get" action="DynaDel.jsp">
         <table border='2' bgcolor='cyan' bordercolor='pink' cellspacing='5' cellpadding='5'>
                 <tr><td colspan="8" align="center"><h1>Record Maintainace Menu</h1></td></tr>
                 <tr><th>Emp Id</th><th>First Name</th><th>Last Name</th><th>Salary</th>
                 <th>Action1</th><th>Action2</th><th>Action3</th><th>Action4</th></tr>
             <%
                rs=stmt.executeQuery("select * from emp2");
                int mid=0;
             while(rs.next())
             {  mid=rs.getInt(1);   %>
                <tr><td><%=mid%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td>
                <td><%=rs.getInt(4)%></td>
                <td><a href="Display.jsp?id=<%=mid%>" >Display</a></td>
                <td><a href="Modify.jsp?id=<%=mid%>" >Modify</a></td>
                <td><a href="Delete.jsp?id=<%=mid%>" >Delete</a></td>
                 <td><input type='checkbox'name='<%=mid%>'>delete</td>
                </tr>
            <%   
             }%>
          <tr><td colspan="8" align="center"><a href="Addition.jsp">Add New Record</a></td></tr>  
          <tr><td colspan="8" align="center"><input type='button' value='Exit' onClick='window.close();'></td></tr>
          <tr><td colspan="8" align="center"><input type='submit' value='Delete Selected Record'></td></tr>
         </table></form></center> </body>
</html>
