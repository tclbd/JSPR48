<%-- 
    Document   : welcome
    Created on : Jan 22, 2022, 5:10:49 PM
    Author     : Faculty Pc
--%>

<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <%
            List<User> users = (List<User>) request.getAttribute("users");
            for(int i = 0; i< users.size(); i++){
        %>
        <table>
            <tr>
                <td><% out.println(users.get(i).getUsername()); %></td>
                <td><% out.println(users.get(i).getPassword()); %></td>
            </tr>
        </table>
            <%}%>
    </body>
</html>
