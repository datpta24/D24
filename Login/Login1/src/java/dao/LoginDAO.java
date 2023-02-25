/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author User
 */
public class LoginDAO extends DBContext {

//    public User login(String username1, String password1){
//        User user = null;
//        String sql = "select * from Users WHERE username = ? AND password = ?"; 
//        
//             
//        try (
//            PreparedStatement ps = connection.prepareStatement(sql); 
//            ps.setString(1, username1);
//            ps.setString(2, password1);
//             ResultSet rs = ps.executeQuery();) {
//            while (rs.next()){
//                String username = rs.getString("username");
//                String password = rs.getString("password");               
//                user = new User(username,password);
//            }
//            rs.close();
//             ps.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return user;
//    }
//    
    public User login(String username1, String password1) {
        User user = null;
        String sql = "select * from Users where username = ? AND password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username1);
            ps.setString(2, password1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                user = new User(username, password);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    public List<User> getUser() {
        List<User> listUser = new ArrayList<>();
        String sql = "select * from Users";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String username, password;
            User x;
            while (rs.next()) {
                username = rs.getString("username");
                password = rs.getString("password");
                x = new User(username, password);
                listUser.add(x);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listUser);
    }
    
       public List<User> checkUser() {
        List<User> listUser = new ArrayList<>();
        String sql = "select * from Users where username=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String username, password;
            User x;
            while (rs.next()) {
                username = rs.getString("username");
                password = rs.getString("password");
                x = new User(username, password);
                listUser.add(x);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listUser);
    }

    public void SignUp(String x, String y) {
        String xSql = "insert into Users (username,password) values (?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(xSql);
            ps.setString(1, x);
            ps.setString(2, y);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LoginDAO User = new LoginDAO();
        User user = User.login("wer", "123");
        System.out.println(user.toString());

    }
}
