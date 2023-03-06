package dao;

import dto.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leducphi
 */
public class ProductDAO extends DBContext {

    public Product getProductByID(int pid) {
        Product p = null;
        try {
            String sql = "select * from Product where product.id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                p = new Product(id, name, price, quantity);
            }

        } catch (SQLException e) {
        }
        return p;
    }

    public ArrayList<Product> getProductByName(String pname) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product where product.name like '%" + pname + "%'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                Product p = new Product(id, name, price, quantity);
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public ArrayList<Product> getProducts() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                Product p = new Product(id, name, price, quantity);
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public int updateProduct(int id, Product p) {
        int result = 0;
        try {
            String sql = "update Product  set name = ?, price = ?, quantity = ? where id = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getQuantity());
            ps.setInt(4, id);

            result = ps.executeUpdate();
        } catch (SQLException e) {
        }

        if (result != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void deleteProduct(int id) {
        try {
            String sql = "delete Product where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
        public void addProduct(Product p) {
        try {
            String sql = "insert into Product(id, name, price, quantity) values (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantity());
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public static void main(String[] args) {
        Product p = new Product( 6, "Vsmart 5", 100, 1000);
        
        new ProductDAO().addProduct(p);
        
        System.out.println(new ProductDAO().getProducts().toString());
    }
}