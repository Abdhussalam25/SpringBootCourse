<%@page import="java.text.NumberFormat"%>
<%@ page language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.bean.FactorialBean" %>
<jsp:useBean id="factorial" class="com.bean.FactorialBean">
</jsp:useBean>
<jsp:setProperty name="factorial" property="*"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Factorial</title>
</head>
<body>
<form method="post">
<input type="text" name="num" />
<input type="submit" value="submit"/>
</form>

<p>Factorial of 
<jsp:getProperty property="num" name="factorial"/>  is
<% NumberFormat format=NumberFormat.getNumberInstance(); %>
<%=format.format(factorial.getFactorial()) %>
</body>
</html>