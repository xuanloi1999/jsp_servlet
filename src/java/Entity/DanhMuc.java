/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author xuanl
 */
public class DanhMuc {
    //Danh mục(mã, tên, ghi chú)
    private String ma;
    private String ten;
    private String ghiChu;
    
    public DanhMuc() {
    }
    public DanhMuc(String ten, String ghiChu) {
        this.ten = ten;
        this.ghiChu = ghiChu;
    }   
    public DanhMuc(String ma, String ten, String ghiChu) {
        this.ma = ma;
        this.ten = ten;
        this.ghiChu = ghiChu;
    }
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    @Override
    public String toString() {
        return "DanhMuc{" + "ma=" + ma + ", ten=" + ten + ", ghiChu=" + ghiChu + '}';
    }
    
    
}
