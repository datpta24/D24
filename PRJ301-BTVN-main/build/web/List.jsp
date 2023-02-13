<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <form action="list" method="post">
            <input type="text" name="search" placeholder="Search by name">
            <button type="submit">Search</button>
            <br>
         ${status}
    
    
           
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
                <tr>
                    <th>${product.getId()}</th>
                    <th>${product.getName()}</th>
                    <th>${product.getPrice()}$</th>
                    <th>${product.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
                <tr>
                    <th>${product1.getId()}</th>
                    <th>${product1.getName()}</th>
                    <th>${product1.getPrice()}$</th>
                    <th>${product1.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
                <tr>
                    <th>${product2.getId()}</th>
                    <th>${product2.getName()}</th>
                    <th>${product2.getPrice()}$</th>
                    <th>${product2.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
                <tr>
                    <th>${product3.getId()}</th>
                    <th>${product3.getName()}</th>
                    <th>${product3.getPrice()}$</th>
                    <th>${product3.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
                <tr>
                    <th>${product4.getId()}</th>
                    <th>${product4.getName()}</th>
                    <th>${product4.getPrice()}$</th>
                    <th>${product4.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
                <tr>
                    <th>${product5.getId()}</th>
                    <th>${product5.getName()}</th>
                    <th>${product5.getPrice()}$</th>
                    <th>${product5.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
                <tr>
                    <th>${product6.getId()}</th>
                    <th>${product6.getName()}</th>
                    <th>${product6.getPrice()}$</th>
                    <th>${product.getQuantity()}</th>
                    <td><a href="#">EDIT</a></td>
                </tr>
            </tbody>





    </body>

</html>
