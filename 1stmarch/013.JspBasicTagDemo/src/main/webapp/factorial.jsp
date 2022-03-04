<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Factorial of number</title>
</head>
<body>
<%
int fact = 1;
if (request.getParameter("num") != null && request.getParameter("num") != "") {
	int num = Integer.parseInt(request.getParameter("num"));
	for (int i = 1; i <= num; i++) {
		fact *= i; //fact=fact*i
	}
	%>
	Factorial of <%=num%> is :<%= fact %><br>
<%
}else{
out.print("Please enter number only..");
}
	%>
	<a href="index.jsp">click me to go back</a>
</body>
</html>