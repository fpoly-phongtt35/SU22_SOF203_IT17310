/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class HoiVien extends Khach {
    
    @Override
    public void thucHien() {
        super.thucHien(); // Gọi hàm thực hiện của class Khach
        
        System.out.println("Mua hàng");
    }
}
