/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraVe extends CuaKiemTra {

    @Override
    public String kiemTra(SinhVien sv) {
        if (sv.getCoVe()) { // Nếu mang vé
            if (cuaTiepTheo != null) { // Nếu còn cửa tiếp
                return cuaTiepTheo.kiemTra(sv); // kiểm tra tiếp
            } else { // Không còn cửa đằng sau
                return "Được vào!";
            }
        } else {
            return "Không mang vé!";
        }
    }
    
}
