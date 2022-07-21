/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7_JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author phongtt
 */
public class SampleQuery {
    
    public static void main(String[] args) throws SQLException {
        
        // 1. Lấy kết nối đến CSDL
        Connection connection = DBContext.getConnection();
        
        // 2. Viết câu truy vấn
        String query = "SELECT object_id, name FROM sys.objects";
        Statement statement = connection.createStatement();
        
        // 3. Thực hiện truy vấn và lấy kết quả
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()) {
            String firstCol = rs.getString(1); // lấy theo vị trí cột
            String nameCol = rs.getString("name"); // lấy theo tên cột
            System.out.println(firstCol + " " + nameCol);
        }
    }
}
