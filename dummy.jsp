 

<%

if( (request.getParameter("employees") != null) ){
    
    out.println("<table>");
    out.println("<tr class = 'table table-bordered'>");
    out.println("<th> S.No </th>");
    out.println("<th> Employee Id </th>");
    out.println("<th> FirstName </th>");
    out.println("<th> LasttName </th>");
    out.println("<th> Address </th>");
    out.println("<th> Department </th>");
    out.println("<th> Basic Salary </th>");
    out.println("<th> Gross Salary </th>");
    out.println("</tr>");
  
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
          Statement st=conn.createStatement();
          
          ResultSet rs=st.executeQuery("select * from employee"); 
          int i=0;
          while(rs.next()){  
          %>
          
              
              <tr>
              
        <td> <% out.print(i); %></td>
                  <td><%=  rs.getString("empId")%></td>
                    <td><%=  rs.getString("empFName")%></td>
                    <td><%=  rs.getString("empLastName")%></td>
                     <td><%=  rs.getString("address")%></td>
                      <td><%=  rs.getString("department")%></td>
                       <td><%=  rs.getString("basicSalary")%></td>
                        <td><%=  rs.getString("grossSalary")%></td>
                    
               </tr>
              
          
      <% }
          
          
    }catch(Exception e){
        e.printStackTrace();
       
        
    
   /} %>

<div>
<h1> Alhamdhulillah this is List of employees page</h1>
</div>
<%	  }
    %>

<%

if( (request.getParameter("places") != null) ){

    %>
<div>
<h1> Alhamdhulillah this is Countries page</h1>
</div>


<% 
} %>
<%
if( (request.getParameter("flighthandling") != null) ){

    %>
<div>
<h1> Alhamdhulillah this is handlingflight page</h1>
</div>


<% 
} %>

<%
if( (request.getParameter("flightList") != null) ){

    %>
<div>
<h1> Alhamdhulillah this is flightList page</h1>
</div>

<%} %>






