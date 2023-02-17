/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import DAO.LoginDAO;
import Model.User;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name ="LoginController",urlPatterns={"/login"})
public class LoginController extends HttpServlet {
   
    
  

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        LoginDAO dao = new LoginDAO();
        User loginUser = dao.login(user, password);
        if(!user.isEmpty()){
            request.setAttribute("loginUser", loginUser);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }else{
            String error = "User ko ton tai";
            request.setAttribute("error", error);
            response.sendRedirect("/Login");
        }
    }
}
 

