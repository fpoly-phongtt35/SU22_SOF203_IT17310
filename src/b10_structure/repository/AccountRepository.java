/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.repository;

import b10_structure.model.Account;

/**
 *
 * @author phongtt
 */
public class AccountRepository {
    
    private Account[] accounts = new Account[] {
        new Account("phongtt35", "123456"),
        new Account("admin", "9999")
    };
    
    public Account getByUsername(String username) {
        // Duyệt danh sách tài khoản
        for(Account account : accounts) {
            // Kiểm tra tên tài khoản có trùng với tên muốn tìm
            if (account.getUsername().equalsIgnoreCase(username)) {
                // Nếu trùng thì trả về Tài khoản
                return account;
            }
        }
        
        // Không tìm thấy
        return null;
        
    }
}
