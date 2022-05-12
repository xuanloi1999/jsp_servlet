/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Blob;

/**
 *
 * @author xuanl
 */
public class SanPham {
    //Sản phẩm(mã, tên, giá, hình, chi tiết, mã danh mục)
    private String ma;
    private String ten;
    private String gia;
    private String hinh;
    private String chiTiet;
    private String maDanhMuc;
    private int soLuong;

    public SanPham() {
    }
    public SanPham(String ma, String ten, String gia, String hinh, String chiTiet, String maDanhMuc) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.chiTiet = chiTiet;
        this.maDanhMuc = maDanhMuc;
        this.soLuong = 1;
    }
    public SanPham(String ten, String gia, String hinh, String chiTiet, String maDanhMuc) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.chiTiet = chiTiet;
        this.maDanhMuc = maDanhMuc;
        this.soLuong = 1;
    }
    public SanPham(String ma, String ten, String gia, String hinh, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
    public String getGia() {
        return gia;
    }
    public void setGia(String gia) {
        this.gia = gia;
    }
    public String getHinh() {
        return hinh;
    }
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    public String getChiTiet() {
        return chiTiet;
    }
    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    public String getMaDanhMuc() {
        return maDanhMuc;
    }
    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    

    @Override
    public String toString() {
        return "SanPham{" + "ma=" + ma + ", ten=" + ten + ", "+ ", maDanhMuc=" + maDanhMuc + '}';
    }
    
}
