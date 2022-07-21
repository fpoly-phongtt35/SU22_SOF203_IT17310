/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1_oop;

import java.math.BigDecimal;

/**
 *
 * @author phongtt
 */
public class ChuongTrinh {
    
    public static void main(String[] args) {
        MayTinh mayTinhCu = new MayTinh();
        mayTinhCu.setTen("Máy tính cũ");
        mayTinhCu.setMau("Đen");
        mayTinhCu.setGia(BigDecimal.valueOf(10000));
    }
}
