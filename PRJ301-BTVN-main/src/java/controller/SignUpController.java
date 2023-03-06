package controller;

import dao.AccountDAO;
import dto.Account;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(name = "SignUpController", urlPatterns = {"/sign-up"})
public class SignUpController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("sign-up.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("txtName");
        String address = req.getParameter("txtAddress");
        int phone_number = Integer.parseInt(req.getParameter("txtPhone"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        ArrayList<Account> list = new AccountDAO().getAllAccount();
        String msg = "";

        Account account = new Account(0, name, address, phone_number, username, password);

        for (Account acc : list) {
            if (username.equals(acc.getUsername())) {
                msg = "Username already exists";
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("sign-up.jsp").forward(req, resp);
            }
        }

        int status = new AccountDAO().insertAccount(account);
        if (status == 0) {
            msg = "Sign up fail, please recheck your infomation";
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("sign-up.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("sign-in.jsp").forward(req, resp);
        }

    }

}