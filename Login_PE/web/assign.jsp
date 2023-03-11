
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border = 1>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Published Date</th>
                <th>is Open access</th>
            </tr>
            <c:forEach items="${papers}" var="p">
                <tr>
                    <th>${p.getPid()}</th>
                    <th>${p.getTitle()}</th>
                    <th>${p.getPublished_date()}</th>                
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
