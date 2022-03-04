<%@ page language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Page</title>
</head>
<body>
<form>
<label>Enter Number</label>
<input type="text" name="num"/>
<input type="submit" value="Submit"/>
</form>
<%-- declaring number to get the text box value --%>
<%! int number=0; %>
<%
if(request.getParameter("num")!=null){
	number=Integer.parseInt(request.getParameter("num"));
}
%>
Entered value is:<%=number %>
<table>
<% for(int i=1;i<11;i++){%>
<tr><th bgcolor="cyan">
<%=number*i%>
</th></tr>
<% } %>
</table>
</body>
</html>