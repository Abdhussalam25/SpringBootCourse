<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <form action="">
     <label></label>
   		<input type="text" name="num">
   		<input type="submit" value="Submit"> 
   </form>

<%-- Declaring number to get the text box value --%>
<%! int number = 0; %>
<%
if(request.getParameter("num")!=null){
	
	number = Integer.parseInt(request.getParameter("num"));	
}
%>

<%= "Entered value is " + number %>
<table>
	<% for(int i=1; i<11; i++){ %>
		<tr> <th bgColor="cyan">   <%= number * i %></th></tr>	
		
		
<%	}        %>



</table>



</body>
</html>