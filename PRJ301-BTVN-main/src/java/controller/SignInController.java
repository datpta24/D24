package controller;

import dao.AccountDAO;
import dto.Account;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SignInController", urlPatterns = {"/sign-in"})
public class SignInController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("sign-in.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String msg = "";
        Account account = new AccountDAO().getAccountByUsernameAndPassword(username, password);
        if (account == null) {
            msg = "Incorect username or password";
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("sign-in.jsp").forward(req, resp);
        }else{
            req.getSession().setAttribute("account", account);
            req.getRequestDispatcher("Home.jsp").forward(req, resp);
        }
    }

}