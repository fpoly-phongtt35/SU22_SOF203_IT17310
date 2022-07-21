/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class HappyBee {
    public static void main(String[] args) {
        // Tạo ds sinh viên
        SinhVien[] dssv = new SinhVien[] {
          new SinhVien("A", true, true, 37.0, true),
          new SinhVien("B", false, true, 37.0, false),
          new SinhVien("C", true, false, 38.0, false)
        };
        
        // Tạo cửa kiểm tra
        CuaKiemTra ckt = new CuaKiemTraVe();
        ckt.setCuaTiepTheo(new CuaKiemTraYTe());
        
        for(SinhVien sv : dssv) {
            String ketQua = ckt.kiemTra(sv);
            System.out.println(sv.getTen() + " " + ketQua);
        }
    }
}
