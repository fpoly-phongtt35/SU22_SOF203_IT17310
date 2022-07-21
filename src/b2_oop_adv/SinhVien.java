/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class SinhVien {
    
    private String ten;
    private Boolean coVe;
    private Boolean coChatKichThich;
    private Double thanNhiet;
    private Boolean coVuKhi;

    public SinhVien() {
    }

    public SinhVien(String ten, Boolean coVe, Boolean coChatKichThich, Double thanNhiet, Boolean coVuKhi) {
        this.ten = ten;
        this.coVe = coVe;
        this.coChatKichThich = coChatKichThich;
        this.thanNhiet = thanNhiet;
        this.coVuKhi = coVuKhi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Boolean getCoVe() {
        return coVe;
    }

    public void setCoVe(Boolean coVe) {
        this.coVe = coVe;
    }

    public Boolean getCoChatKichThich() {
        return coChatKichThich;
    }

    public void setCoChatKichThich(Boolean coChatKichThich) {
        this.coChatKichThich = coChatKichThich;
    }

    public Double getThanNhiet() {
        return thanNhiet;
    }

    public void setThanNhiet(Double thanNhiet) {
        this.thanNhiet = thanNhiet;
    }

    public Boolean getCoVuKhi() {
        return coVuKhi;
    }

    public void setCoVuKhi(Boolean coVuKhi) {
        this.coVuKhi = coVuKhi;
    }
    
    
}
