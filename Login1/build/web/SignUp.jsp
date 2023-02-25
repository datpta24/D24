<%-- 
    Document   : SignUp
    Created on : Feb 25, 2023, 3:30:01 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css" href="Login.css">
    </head>
    <body>
         <div class="signUpForm">
            <h2>Sign Up form</h2>
            <form method="post" action="SignUp">
                <input type="text" id="username" name="username" placeholder="username"><br>
                <input type="text" id="password" name="password" placeholder="password"><br>
                <input type="text" id="repass" name="repass" placeholder="repass"><br>
                <input type="submit" value="Submit">
            </form>
              <a href="${pageContext.request.contextPath}/Login">Back</a>
            <p>${error}</p>
    </body>
</html>
