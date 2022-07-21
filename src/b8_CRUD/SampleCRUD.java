/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_CRUD;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phongtt
 */
public class SampleCRUD {
    
    public static void main(String[] args) throws SQLException {
        //add();
        update("IT17310 PS", 5012);
        List<Product> products = read();
        for(Product product : products) {
            System.out.println(product);
        }
    }
    
    private static Integer update(String newName, Integer id) throws SQLException {
        Connection connection = DBContext.getConnection();
        
        String sql = "UPDATE Product SET ProductName = ? "
                + " WHERE ProductId = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, newName);
        ps.setInt(2, id);
        
        int affectedRows = ps.executeUpdate();
        
        ps.close();
        connection.close();
        
        return affectedRows;
    }
    
    private static Integer add() throws SQLException {
        Connection connection = DBContext.getConnection();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO Product "
                + "VALUES('IT17310', 9999999, 39)";
        
        int affectedRows = statement.executeUpdate(sql);
        
        statement.close();
        connection.close();
        
        return affectedRows;
    }
    
    private static List<Product> read() throws SQLException {
        List<Product> products = new ArrayList();
        
        Connection connection = DBContext.getConnection();
        String sql = "SELECT ProductId, ProductName, "
                + "Price, Quantity FROM Product";
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        while(rs.next()) {
            Integer id = rs.getInt("ProductId");
            String name = rs.getString("ProductName");
            BigDecimal price = rs.getBigDecimal("Price");
            Integer quantity = rs.getInt("Quantity");
            
            Product product = new Product();
            product.setId(id);product.setName(name);
            product.setPrice(price);product.setQuantity(quantity);
            
            products.add(product);
        }
        
        rs.close(); stm.close(); connection.close();
        
        return products;
    }
}
