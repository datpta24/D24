<%-- 
    Document   : Login
    Created on : Feb 17, 2023, 12:26:20 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="loginForm">
            <h3>Login form</h3>
            <form method="post" action="LoginController">
                <label for="username">Username:</label><br>
                <input type="text" id="username" name="username"><br>
                <label for="password">Password:</label><br>
                <input type="text" id="password" name="password"><br>
                <input type="submit" value="Submit">
            </form>
            <p>${error}</p>
        </div>
    </body>
</html>
