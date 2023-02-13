package controller;

import dto.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(name = "ProductListController", urlPatterns = {"/list"})
public class ProductListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //edit here
        ArrayList<Product> arrProduct = new ArrayList<>();

        Product product = new Product(2, "iPhone 5", 199, 2);
        Product product1 = new Product(3, "iPhone 12 Pro", 1099, 4);
        Product product2 = new Product(4, "iPhone X", 500, 8);
        Product product3 = new Product(5, "iPhone 8 Plus", 399, 1);
        Product product4 = new Product(6, "iPhone 12 Mini", 699, 10);
        Product product5 = new Product(7, "iPhone 11", 609, 8);
        Product product6 = new Product(8, "iPhone 12", 999, 4);

        arrProduct.add(product);
        arrProduct.add(product1);
        arrProduct.add(product2);
        arrProduct.add(product3);
        arrProduct.add(product4);
        arrProduct.add(product5);
        arrProduct.add(product6);

        req.setAttribute("product", product);
        req.setAttribute("product1", product1);
        req.setAttribute("product2", product2);
        req.setAttribute("product3", product3);
        req.setAttribute("product4", product4);
        req.setAttribute("product5", product5);
        req.setAttribute("product6", product6);

        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ArrayList<Product> arrProduct = new ArrayList<>();
        Product product = new Product(2, "iPhone 5", 199, 2);
        Product product1 = new Product(3, "iPhone 12 Pro", 1099, 4);
        Product product2 = new Product(4, "iPhone X", 500, 8);
        Product product3 = new Product(5, "iPhone 8 Plus", 399, 1);
        Product product4 = new Product(6, "iPhone 12 Mini", 699, 10);
        Product product5 = new Product(7, "iPhone 11", 609, 8);
        Product product6 = new Product(8, "iPhone 12", 999, 4);

        arrProduct.add(product);
        arrProduct.add(product1);
        arrProduct.add(product2);
        arrProduct.add(product3);
        arrProduct.add(product4);
        arrProduct.add(product5);
        arrProduct.add(product6);

        req.setAttribute("product", product);
        req.setAttribute("product1", product1);
        req.setAttribute("product2", product2);
        req.setAttribute("product3", product3);
        req.setAttribute("product4", product4);
        req.setAttribute("product5", product5);
        req.setAttribute("product6", product6);

        String status = "";
        String search = (String) req.getParameter("search");
        for (Product p : arrProduct) {
            if (p.getName().equalsIgnoreCase(search)) {
                status = "exist";
                req.setAttribute("status", status);
                req.getRequestDispatcher("List.jsp").forward(req, resp);
            } else {
                status = "not exist";
            }
        }
        req.setAttribute("status", status);
        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

}
