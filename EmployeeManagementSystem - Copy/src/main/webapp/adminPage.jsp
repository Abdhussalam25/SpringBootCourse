<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%
   // import javax.servlet.http.HttpSession;
  //  HttpSession session = request.getSession(false); // To avoid new session creation to continue with the same session.
	
 // if((String) session.getAttribute("userName") == "Admin"){
    
    %>
 
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
      <li style="float:right"><a href="changePassword.jsp"><button class="btn btn-warning">Change Password</button></a></li>
   
     </ul>
     <br><br>

     <table class="table table-bordered" style="width: 50%; align-items: center;" >
        <thead>  Employee Management</thead>
        <tr style="align-items: center; font-weight: 800;">
          <td>S.No</td>
          <td>Options</td>
        </tr>
        <tr>
          <td>1</td>
          <td><a href="addEmployee.jsp">Add Employee</a></td>
        </tr>
        <tr>
          <td>2</td>
          <td><a href="employeeList.jsp">Employee List</a></td>
        </tr>
        <tr>
          <td>3</td>
          <td><a href="searchEmployeeById.jsp">Search Employee By Id</a></td>
        </tr>
        <tr>
          <td>4</td>
          <td><a href="modEmployeeById.jsp">Modify Employee By Id</a></td>
        </tr>
        
        <tr>
          <td>5</td>
          <td><a href="delEmployeeById.jsp">Remove By EmployeeId</a></td>
        </tr>        
        <tr>
          <td>6</td>
          <td><a href="listEmployeeByDept.jsp"> List By Dept</a></td>
        </tr>
        <!-- <tr>
          <td>7</td>
          <td><a href=""></a></td>
        </tr> -->
        


     </table>

   
    <!-- <h1>Assallaamu alaikkum</h1> -->

  
    </body>
    </html>
 