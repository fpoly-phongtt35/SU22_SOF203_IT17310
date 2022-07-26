/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.service;

import b10_structure.model.Account;
import b10_structure.repository.AccountRepository;

/**
 *
 * @author phongtt
 */
public class AuthenticationService {
    
    private final AccountRepository accountRepo;
    public AuthenticationService() {
        accountRepo = new AccountRepository();
    }
    
    public boolean authenticate(String username, String password) {
        // Kiểm tra tài khoản có tồn tại không?
        //  <=> lấy tài khoản theo tên đăng nhập
        Account account = accountRepo.getByUsername(username);
        
        if (account != null) { // Tài khoản tồn tại
            // Kiểm tra password có trùng khớp hay không?
            return account.getPassword().equals(password);
        }
        
        return false; // Không hợp lệ
    }
}
