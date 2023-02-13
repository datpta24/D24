package controller;

import dto.Person;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ArrayList<Person> arrPerson = new ArrayList<>();
//        Person person1 = new Person("Pham Dat ", 21, "Ha Noi");
//        Person person2 = new Person("Pham Tuan ", 22, "Ha Noi");
//        Person person3 = new Person("Pham Tuan Dat ", 23, "Ha Noi");
//
//        arrPerson.add(person1);
//        arrPerson.add(person2);
//        arrPerson.add(person3);
//
//        for (Person p : arrPerson) {
//
//        }
//
//        req.setAttribute("person1", person1);
//
//        req.setAttribute("arrPerson", arrPerson);

        Person person1 = new Person("phi", 21, "Ha Noi");
        req.setAttribute("person1", person1);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Person person1 = null;
//        String username = (String) req.getParameter("txtName");
//        String password = req.getParameter("txtPass");
//        
//        String status = "";
//        if (username.equals("admin") && password.equals("123")) {
//            status = "dang nhap thanh cong";
//        }else{
//            status = "dang nhap that  bai";
//        }
//        

//create
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("add");

//        String search = (String) req.getParameter("txtSearch");
//        ArrayList<Person> arrPerson = new ArrayList<>();
//        Person person1 = new Person("phi", 21, "Ha Noi");
//        Person person2 = new Person("tuan", 22, "Ha Noi");
//        Person person3 = new Person("dat", 23, "Ha Noi");
//        Person person4 = new Person(name, Integer.parseInt(age), address);
//        arrPerson.add(person1);
//        arrPerson.add(person2);
//        arrPerson.add(person3);
//        arrPerson.add(person4);

        person1.setName(name);
        person1.setAge(age);
        person1.setAddress(address);

//        String status = "";
        //        for (Person p : arrPerson) {
        //            if (p.getName().equals(search)) {
        //                status = "co ton tai";
        //                req.setAttribute("status", status);
        //                req.getRequestDispatcher("index.jsp").forward(req, resp);
        //            } else {
        //                status = "khong ton tai";
        //            }
        //        }
        req.setAttribute("person1", person1);

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
