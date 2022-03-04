<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP param Example</title>
</head>
<body>
<form method="get">
<table>
<tr>
<td>Name</td> <td><input type="text" name="userid"/></td>
</tr>
<tr>
<td>Password</td> <td><input type="password" name="password"/></td>
</tr>
<tr><td></td><td><input type="submit" value="submit"/></td></tr>
</table>
</form>
<%
String userid= request.getParameter("userid");
String password= request.getParameter("password");
if(userid!=null && userid.equals("san"))
{
%>
<jsp:forward page="Forwarded1.jsp">
<jsp:param name="userid" value="<%=userid %>"/>
</jsp:forward>
<% } 
else
	out.print("Password is not valid");
%>
</body>
</html>