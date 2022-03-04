<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:directive.page import="java.util.*" />
	<TABLE BORDER="1" ALIGN="center" WIDTH="100%">
		<TR>
			<TD ALIGN="center"><A HREF="javascript:alert('Goodbye');window.close();">Logout</A></TD>
		</TR>
		<TR>
			<TD COLSPAN="3" ALIGN="right">
				Date: <jsp:expression> new java.util.Date() </jsp:expression>
			</TD>
		</TR>
	</TABLE>
</body>
</html>