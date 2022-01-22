<%-- 
    Document   : login
    Created on : Jan 22, 2022, 5:11:00 PM
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
        <h1>User Login!</h1> <br>
        <form action="login" method="POST">
            Username <input type="text" name="username"/> <br>
            Password <input type="text" name="password"/> <br>
            <input type="submit" value="Login"/>
        </form>
        <br>
        <a href="registration.jsp">Register here</a>
    </body>
</html>
