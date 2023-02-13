
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dto.*" %>


<%
    Person person = (Person) request.getAttribute("person1");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <a href="<c:url value="/list"></c:url>">BTVN</a>
        
        <h1>${name123}</h1>
        <c:out value="${person.getName()}" />

        <c:if test="${person.getAge() == 21}">
            123456
        </c:if>




        <c:choose>
            <c:when test="${person1.getAge() == 20}">
                ban 20 tuoi
                <br />
            </c:when>   

            <c:when test="${person1.getAge() == 22}">
                ban 22 tuoi
                <br />
            </c:when>
            <c:otherwise>
                tuoi ban khac 20 va 22
                <br />
            </c:otherwise>
        </c:choose>





        <form action="home" method="post">
            <!--            username
                        <input type="text" name="txtName">
                        <br>
                        password
                        <input type="text" name="txtPass">
                        <br>-->
            <!--<input type="text" name="txtSearch">-->
            <label>Name</label>
            <input type="text" name="name" value="${person1.getName()}">
            <br/>
            <label>Age</label>
            <input type="text" name="age" value="${person1.getAge()}" >
            <br/>
            <label>Address</label>
            <input type="text" name="add" value="${person1.getAddress()}" >
            <br/>
            <button type="submit" value="search"> update </button>
        </form>


        <%--<c:forEach var="p" items="${arrPerson}" >--%>
            <h3>${person1.getName()}</h3>
            <h3>${person1.getAge()}</h3>
            <h3>${person1.getAddress()}</h3>
            <br/>
            ----------------------

        <%--</c:forEach>--%>





        <br/>
        ${status}


    </body>
</html>
