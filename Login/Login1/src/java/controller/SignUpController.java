/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.LoginDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.User;

/**
 *
 * @author User
 */
@WebServlet(name = "SignUpController", urlPatterns = {"/SignUp"})
public class SignUpController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("SignUp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text.html;charset=UTF-8");
        LoginDAO dao = new LoginDAO();
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        String re_pass = request.getParameter("repass");
        if(!password.equals(re_pass))
        {
            String error = "Mau khau khong trung khop";
            request.setAttribute("error", error);
              request.getRequestDispatcher("SignUp.jsp").forward(request, response);         
        }else{
             List<User> listUser = dao.checkUser();
             if(listUser == null)
             {
                 dao.SignUp(user, password);
                 response.sendRedirect("home.jsp");
             }else{
                 response.sendRedirect("Login.jsp");
             }
        }
//       
//        for (User user1 : listUser) {
//            if (user.equals(user1.getUsername())) {
//                String error = "User da ton tai";
//                request.setAttribute("error", error);
//                response.sendRedirect("/Login");
//                return;
//            } else if (!password.equals(re_pass)) {
//                String error = "User da ton tai";
//                request.setAttribute("error", error);
//                response.sendRedirect("/Login");
//                response.sendRedirect("Login.jsp");
//                return;
//            } else {
//                dao.SignUp(user, password);
//                request.getRequestDispatcher("home.jsp").forward(request, response);
//            }
//       }
    }

}
