<%-- 
    Document   : login
    Created on : Mar 9, 2023, 7:55:51 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form  method="post" action="login">
            <label>Username:</label>
            <input type="text" name="txtUsername">
            <label>Password:</label>
            <input type="text" name="txtPassword">
            <input type="submit" value ="login">
            ${msg}
            ${error}
            <h4 style="text-align: justify">Login form</h4>
            
        </form>
    </body>
</html>
