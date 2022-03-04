<%@page import="com.bean.Student"%>
<%@page errorPage="FactorialInputError.jsp" %>
<%-- 
int rollNumber=Integer.parseInt(request.getParameter("rollNumber"));
String firstName=request.getParameter("firstName");
String lastName=request.getParameter("lastName");
String contactNumber=request.getParameter("contactNumber");
System.out.print("roll number"+rollNumber);
--%>
<jsp:useBean id="student" class="com.bean.Student" scope="request">
<jsp:setProperty name="student" property="*"/>
<%-- <jsp:setProperty name="student" property="firstName" value="<%=firstName%>"/>
<jsp:setProperty name="student" property="lastName" value="<%=lastName%>"/>
<jsp:setProperty name="student" property="contactNumber" value="<%=contactNumber%>"/>--%>
</jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
			<tr>
				<td>Roll Number:</td>
				<td><jsp:getProperty property="rollNumber" name="student"/></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><jsp:getProperty property="firstName" name="student"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><jsp:getProperty property="lastName" name="student"/></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><jsp:getProperty property="contactNumber" name="student"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="Close Window" onClick="window.close();"/> 
				</td>
			</tr>
		</table>
</body>
</html>