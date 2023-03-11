
import dal.Paper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import dal.*;

public class listPaperServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("txtUsername");
        String password = req.getParameter("txtPassword");
        LoginDAO loginDao = new LoginDAO();
        Account loginUser = loginDao.login(user, password);       
        ArrayList<Paper> papers = new PaperDAO().getPapers();
        if(loginUser == null)
        {
            String msg = "acesss denied";
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("assign.jsp").forward(req, resp);
        }
        req.setAttribute("papers", papers);
        
    }

}
