<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Author Master Form</title>
</head>
<BODY BGCOLOR="pink">
<jsp:directive.include file="AuthorMasterHeader.jsp" />
<!-- Initializing a form object, which will submit data captured on the form. --> 
<FORM ACTION="AuthorMaster.jsp" METHOD="post" NAME="FrmAuthMast">
<!-- Parent Table begins. -->
<TABLE ALIGN="center" BGCOLOR="cyan" BORDER="0" CELLPADDING="0" CELLSPACING="0" NAME="tblOuter" WIDTH="50%">
<TR HEIGHT="300" VALIGN="top">
<TD ALIGN="center" BORDER="1" COLSPAN="10"> <BR />
<TABLE ALIGN="center" BORDER="1" BORDERCOLOR="BLUE" CELLPADDING="2" CELLSPACING="0" NAME="tblFirstChild" WIDTH="100%">

<!-- Inserting table row to display the form title -->
<TR BGCOLOR="BLACK">
	<TD ALIGN="left" COLSPAN="2">
	<!-- Formatting the font of title -->
	<FONT SIZE="2" COLOR="white"><B>Author Master</B></FONT></TD>
</TR>
<!--Inserting table row that holds table data label and text box of Author Name -->
<TR>
<TD ALIGN="right" WIDTH="25%">Author Name:</TD>
<TD ALIGN="left"><INPUT MAXLENGTH="35" NAME="txtAuthorName" TYPE="text" SIZE="25"/></TD>
</TR>
<!-- Inserting table row that holds table data label and text box of Degree -->
<TR>
	<TD ALIGN="right">Degree:</TD>
	<TD ALIGN="left">
	<INPUT MAXLENGTH="255" NAME="txtDegree" TYPE="text" SIZE="42" />
	</TD>
</TR>
<!-- Inserting table row that holds table data label and text box of Speciality -->
<TR>
	<TD ALIGN="right">Speciality:</TD>
	<TD ALIGN="left">
	<INPUT MAXLENGTH="255" NAME="txtSpeciality" TYPE="text" SIZE="42" />
	</TD>
</TR>
<!-- Inserting table row that holds table data lable and text box of Date of birth -->
<TR>
	<TD ALIGN="right">Date Of Birth:</TD>
	<TD ALIGN="left">
	<INPUT MAXLENGTH="255" NAME="txtDOB" TYPE="text" SIZE="" />
	</TD>
</TR>
<!-- Inserting table row that holds inputs for Save button -->
<TR>
	<TD COLSPAN="2" ALIGN="RIGHT">
	<INPUT NAME="cmdSubmit" TYPE="submit" VALUE="Submit" />
	</TD>
</TR>
</TABLE>
</TD>
</TR>
</TABLE>
</FORM>

</body>
</html>