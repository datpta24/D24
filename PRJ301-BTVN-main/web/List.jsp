<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
    </head>
    <body>

        <form action="list" method="post">
            <input type="text" name="search" placeholder="Search by name">
            <button type="submit" >Search</button>
        </form>


        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${arr}">
                    <tr>
                        <td>${p.getId()}</td>
                        <td>${p.getName()}</td>
                        <td>${p.getPrice()}$</td>
                        <td>${p.getQuantity()}</td>
                        <td><a href="#">EDIT</a></td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>

    </body>
</html>
