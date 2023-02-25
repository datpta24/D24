<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="Login.css">
    </head>
    <body>
        <div class="loginForm">
            <h2>Login form</h2>
            <form method="post" action="Login">
                <input type="text" id="username" name="username" placeholder="username"><br>
                <input type="text" id="password" name="password" placeholder="password"><br>
                <input type="submit" value="Submit">
                <h3>Or<h3/>
                <a href="${pageContext.request.contextPath}/SignUp">SignUp</a>
            </form>
            <p>${error}</p>
        </div>
    </body>
</html>
