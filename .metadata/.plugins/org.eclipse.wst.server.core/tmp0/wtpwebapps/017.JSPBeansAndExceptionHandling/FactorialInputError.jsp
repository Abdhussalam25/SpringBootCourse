<%@ page language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isErrorPage="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
</head>
<body>
<h3>Following could be the reason for showing error</h3>
<ul>
	<li><%=exception.getClass()%></li>
	<li><%=exception.getMessage()%></li>
	<li><%=exception.getStackTrace()%></li>
</ul>
the quick brown fox jumps over the little lazy dog.
the quick brown fox jumps over the little lazy dog.
the quick brown fox jumps over the little lazy dog.
the quick brown fox jumps over the little lazy dog.
the quick brown fox jumps over the little lazy dog.
the quick brown fox jumps over the little lazy dog.
</body>
</html>