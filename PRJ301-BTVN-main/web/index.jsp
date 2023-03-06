
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dto.*" %>


<%
    String name = (String) request.getAttribute("name");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>



        <form action="home" method="post">
            <label>Name</label>
            <input type="text" name="name">
            <br/>
            <label>Address</label>
            <input type="text" name="add" >
            <br/>
            <label>Khoa</label>
            <input type="radio"  name="khoa" value="K15">
            K15
            <input type="radio"  name="khoa" value="K16">
            K16
            <input type="radio" name="khoa" value="K17">
            K17
            <input type="radio" name="khoa" value="K18">
            K18
            <br/>
            <label>DOB</label>
            <input type="date" name="txtDob">
            <br/>
            <label>School</label>
            <select name="txtSchool">
                <option value="FBTU">FBTU</option>
                <option value="FPoly">FPoly</option>
                <option value="GreenWich">GreenWich</option>
            </select>

            <br/>
            <button type="submit" value="save"> save </button>

        </form>

        <br/>
        Display info
        <br/>
        <label>Name</label>
        <%= name%>
        <br/>
        <label>Address</label>
        ${address}
        <br/>
        <label>Khoa</label>
        ${khoa}
        <br/>
        <label>DOB</label>
        ${dob}
        <br/>
        <label>School</label>
        ${school}

    </body>
</html>
