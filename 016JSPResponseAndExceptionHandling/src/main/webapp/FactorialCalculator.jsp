<%@page import="java.text.NumberFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.bean.FactorialBean" %>
<%@page errorPage="FactorialInputError.jsp" %>
<jsp:useBean id="factorial" class="com.bean.FactorialBean"/>
<jsp:setProperty name="factorial" property="*" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Factorial Calculator</title>
</head>
<body>
<p>Factorial of 
<jsp:getProperty property="num" name="factorial"/>  is
<% NumberFormat format=NumberFormat.getNumberInstance(); %>
<%=format.format(factorial.getFactorial()) %>
</body>
</body>
</html>