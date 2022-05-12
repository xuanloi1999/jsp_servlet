/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author xuanl
 */
public class QuanLySanPhamEntity {
    private ArrayList<SanPham> dssp;

    public QuanLySanPhamEntity() {
        dssp = new ArrayList<SanPham>();
    }
    public QuanLySanPhamEntity(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }
    public ArrayList<SanPham> getDssp() {
        return dssp;
    }
    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }
    public void addSanPham(SanPham sanPham) {
        boolean kq = false;
        for (SanPham sanPham1 : dssp) {
            if (sanPham1.getMa().equals(sanPham.getMa())){
                sanPham1.setSoLuong(sanPham1.getSoLuong()+sanPham.getSoLuong());
                kq= true;
                break;
            }
        }
        if (kq == false){
            dssp.add(sanPham);
        }
        
    }
    public int soLuong() {
        int count = 0;
        for (SanPham sanPham : dssp) {
            count+=sanPham.getSoLuong();
        }
        return count;
    }
    @Override
    public String toString() {
        String str = "";
        for (SanPham sanPham : dssp) {
            str+=sanPham.getMa()+"#"+sanPham.getSoLuong()+"/";
        }
        return str;
    }
    
}
