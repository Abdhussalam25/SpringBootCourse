<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.text.NumberFormat" %>
     <%@ page import="com.bean.FactorialBean" %>
<!DOCTYPE html>

<jsp:useBean id="factorial" class="com.bean.FactorialBean">
</jsp:useBean>
<jsp:setProperty name="factorial" property="*"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Factorial</title>
</head>
<body>

  <form method="post">
  	<input type="text" name = "num" />
  	<input type="submit" value="submit"/>  
  </form>


<p>Factorial of
<jsp:getProperty property="num" name="factorial"/> is
<% NumberFormat format = NumberFormat.getNumberInstance(); %>
<%= format.format(factorial.getFactorial())%>

</body>
</html>