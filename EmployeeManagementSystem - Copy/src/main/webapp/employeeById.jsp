<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Apex International School || ADMIN</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href=”bootstrap/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” />
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>

<style>
    ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
      overflow: hidden;
      background-color:#aebde1;
    }
    
 
    
    li:last-child {
      border-right: none;
    }
    
    li a {
      display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;

    }
    
    li a:hover:not(.active) {
      background-color: #111;
    }
    #background{
        background-image: url('salambasha.png');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
    position: fixed;
    width: 100%;
    max-width: 400px !important;
    
        margin-left: 700px;
    margin-top: 200px;
    
    word-break: break-word;

    }
  
    </style>
    </head>
    <body>
    

       <ul>
     
      <li style="float:right"><a href="index.jsp"><button class="btn btn-danger">Logout</button></a></li>
   <!--     <li style="float:right"><a href="changePassword.jsp"><button class="btn btn-warning">Change Password</button></a></li> -->
   
     </ul>
     <br><br>
<%


String empIds = request.getParameter("empId");
String empName = "";
ResultSet rs = null;
if(empIds!=null){
	int empId = Integer.parseInt(empIds);
	try {
    	
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyberinforminies_ems","root","basha");
      Statement st=conn.createStatement();
      
      rs=st.executeQuery("select * from employee where empId="+empId); 
     
      rs.next();
   
        //  out.print(rs.getString("address"));
	   
    }catch(Exception e){
    	e.printStackTrace();
    }
	
   
     
    %>

<div class="container">
  <form  method="post" action = "EmployeeController">
    <div class="row">
      <div class="col-25">
        <label for="fname">First Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="fname" name="firstName" value="<%=rs.getString("empFName") %>"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">Last Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="lname" name="lastName" value="<%=rs.getString("empLastName") %>">
      </div>
    </div>     
    <div class="row">
      <div class="col-25">
        <label for="country">Department</label>
      </div>
      <div class="col-75">
        <select id="department" name="department" value="<%=rs.getString("department") %>">
          <option value="Accounts">Accounts</option>
          <option value="Human Resources">Human Resources</option>
          <option value="IT">IT</option>
          <option value="System Admin">System Admin</option>
        </select>
      </div>
    </div>
     <div class="row">
      <div class="col-25">
        <label for="salary">Salary</label>
      </div>
      <div class="col-75">
        <input type="text" id="salary" name="salary" value="<%=rs.getString("basicSalary") %>">
      </div>
    </div>     
    <div class="row">
      <div class="col-25">
        <label for="address">Address</label>
      </div>
      <div class="col-75">
        <textarea id="address" name="address"  style="height:200px;word-break: break-all">
        <%=rs.getString("address") %>      
        
        </textarea>
      </div>
      <input type="hidden" name ="updateId"value="<%=empId%>">
    </div>
    <div class="row">
      <input type="submit" value="Submit" style = "text-align:center; margin-right:35vw; margin-top:20px;"> 
      <!-- <button type="submit" class="btn btn-primary float-right" style = "text-align:center; margin-right:35vw; margin-top:20px;">ADD</button> -->
    </div>
  </form>
</div>


<%
} else{
	
	out.print("<h3> Entered id is not found </h3>");
}

%>






</body>
</html>