package controller;

import dao.DBContext;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "TuanVM");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("add");
        String khoa = req.getParameter("khoa");
        String dob = req.getParameter("txtDob");
        String school = req.getParameter("txtSchool");

        //in thang ra ma hinh
//        resp.getWriter().println(
//                "Name: " + name + "\n"
//                + "Address: " + address + "\n"
//                + "Khoa: " + khoa + "\n"
//                + "DOB: " + dob + "\n"
//                + "School: " + school);


        req.setAttribute("name", name);
        req.setAttribute("address", address);
        req.setAttribute("khoa", khoa);
        req.setAttribute("dob", dob);
        req.setAttribute("school", school);
        
        req.getRequestDispatcher("Display.jsp").forward(req, resp);
    }
    
    

}
