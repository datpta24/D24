package controller;

import dao.ProductDAO;
import dto.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(name = "ProductListController", urlPatterns = {"/List"})
public class ProductListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ArrayList<Product> list = new ProductDAO().getProducts();
 
        req.setAttribute("arr", list);
        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String search = req.getParameter("search");
        ArrayList<Product> list = new ProductDAO().getProductByName(search);
        req.setAttribute("arr", list);
        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

}
