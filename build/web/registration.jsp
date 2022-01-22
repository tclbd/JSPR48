<%-- 
    Document   : registration
    Created on : Jan 22, 2022, 4:34:31 PM
    Author     : Faculty Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Registration!</h1> <br>
        <form action="register" method="POST">
            Username <input type="text" name="username"/> <br>
            Password <input type="text" name="password"/> <br>
            <input type="submit" value="Register"/>
        </form>
        <br>
        <a href="login.jsp">Login here</a>
    </body>
</html>
