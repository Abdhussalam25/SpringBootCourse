<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial of Number</title>
</head>
<body>
   <%
   		if(request.getParameter("num") != null && request.getParameter("num") != ""){
   			
   			int num = Integer.parseInt(request.getParameter("num"));
   			
   			int fact = 1;
   			
   			for(int i=1; i<num; i++){
   				
   				fact *= i;
   				
   			}
   			
   			%>
   			
   			
   			
   			Factorial of <%= num%> is : <%= fact %>
   	<%		
   		}else{
   			
   			out.print("Enter numbr only");
   		} %>
   		
   		
   
   
   
  
    
 
</body>
</html>