/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraYTe extends CuaKiemTra {

    @Override
    public String kiemTra(SinhVien sv) {
        Double thanNhiet = sv.getThanNhiet();
        if (thanNhiet > 36.5 && thanNhiet < 37.5) { 
            if (cuaTiepTheo != null) { // Nếu còn cửa tiếp
                return cuaTiepTheo.kiemTra(sv); // kiểm tra tiếp
            } else { // Không còn cửa đằng sau
                return "Được vào!";
            }
        } else {
            return "Thân nhiệt không phù hợp!";
        }
    }
    
}
