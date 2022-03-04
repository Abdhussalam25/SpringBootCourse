<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action='Add.jsp'>
            <table border='2' cellspacing='5' cellpadding='5'>
                 <tr><td>Emp Id</td><td><input type='text' name='id' ></td></tr>
                 <tr><td>First Name</td><td><input type='text' name='fname'></td><tr>
                 <tr><td>Last Name</td><td><input type='text' name='lname'></td></tr>
                 <tr><td>Salary</td><td><input type='text' name='salary'></td></tr>
                 <tr><td><input type='submit' value='Save Record'></td><td><a href='index.jsp'>Back to Menu</a></td></tr>
            </table>
        </form>
                   
    </body>
</html>
