/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class LoginDAO extends DBContext {
    
  
    public User login(String username, String password){
        User user = new User();
        String sql = "select * from Users WHERE username = ? AND password = ?";
        try (
             
             PreparedStatement ps = connection.prepareStatement(sql); 
             ResultSet rs = ps.executeQuery();) {
            while (rs.next()){
                user = new User(
                        rs.getString("username"),
                        rs.getString("password")
                );
            }
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
      String username,password;
      User x;
      while(rs.next()) {
        username = rs.getString("username");  
        password = rs.getString("password");    
        x = new User(username,password);
        listUser.add(x);
      }
      rs.close();
      ps.close();
     }
     catch(SQLException e) {
        e.printStackTrace();
     }
    return(listUser);
  }
    
        public static void main(String[] args) {
        LoginDAO User = new LoginDAO();
        List<User> users = User.getUser();
        users.forEach((st) -> {
            System.out.println(st.toString());
      });
    }
}
