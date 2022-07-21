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
public class ChuongTrinhTinhTien {
    
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        
        BigDecimal aa = BigDecimal.valueOf(0.1);
        BigDecimal bb = BigDecimal.valueOf(0.2);
        BigDecimal cc = aa.add(bb); // aa + bb;
        aa.divide(bb); // aa / bb
        aa.multiply(bb); // aa * bb
        aa.subtract(bb); // aa - bb
        System.out.println(cc);
    }
}
