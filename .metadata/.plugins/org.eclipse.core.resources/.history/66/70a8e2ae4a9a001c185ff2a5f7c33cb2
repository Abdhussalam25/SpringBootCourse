<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Author Information</title>
</head>
<body>
	<jsp:declaration>
				String authorName;
				String degree;
				String speciality;
				String dob;
	</jsp:declaration>

	<jsp:scriptlet>
	authorName = request.getParameter("txtAuthorName");
	degree = request.getParameter("txtDegree");
	speciality = request.getParameter("txtSpeciality");
	dob = request.getParameter("txtDOB");
			</jsp:scriptlet>

	<H1>This is Author Information</H1>
	Author Name:<jsp:expression>authorName</jsp:expression><BR/> 
	Degree:<jsp:expression>degree</jsp:expression><BR/> 
	Speciality:<jsp:expression>speciality</jsp:expression><BR/> 
	Date of Birth:<jsp:expression>dob</jsp:expression>
</body>
</html>