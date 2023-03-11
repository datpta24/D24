/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import db.DBContext;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PaperDAO extends DBContext{
    public ArrayList<Paper> getPapers() {
        ArrayList<Paper> papers = new ArrayList<>();
        try {
            String sql = "SELECT * FROM [dbo].[Paper]";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                papers.add(new Paper(rs.getInt("pid"), rs.getString("title"), Date.valueOf(rs.getString("published_date")), rs.getBoolean("open_access")));
            }
        } catch (SQLException e) {
        }
        return papers;
    }
    
    public static void main(String[] args) {
        System.out.println(new PaperDAO().getPapers());
    }
    
}
