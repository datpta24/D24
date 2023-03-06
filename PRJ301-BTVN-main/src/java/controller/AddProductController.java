import dao.ProductDAO;
import dto.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(name = "AddProductController", urlPatterns = {"/add"})
public class AddProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendRedirect("add-product.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int pid = Integer.parseInt(req.getParameter("pid"));
        String pname = req.getParameter("pname");
        Double pprice = Double.parseDouble(req.getParameter("pprice"));
        int pquantity = Integer.parseInt(req.getParameter("pquantity"));
        
        Product p = new Product(pid, pname, pprice, pquantity);
        
        new ProductDAO().addProduct(p);
        
        
        //hien thi
        ArrayList<Product> list = new ProductDAO().getProducts();
        req.setAttribute("arr", list);
        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

}