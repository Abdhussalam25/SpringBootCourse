<%@ page language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Data Form</title>
</head>
<body>
	<form action="DataSetInStudentBean.jsp">
		<table border="2">
			<tr>
				<td>Roll Number:</td>
				<td><input type="text" name="rollNumber" /></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><input type="text" name="contactNumber" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="submit" /> <input type="reset" value="refresh" /></td>
			</tr>
		</table>
	</form>
</body>
</html>