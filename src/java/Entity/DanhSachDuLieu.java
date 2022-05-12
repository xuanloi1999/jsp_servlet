/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;

/**
 *
 * @author xuanl
 */
public class DanhSachDuLieu {
    private List<SanPham> dssp;
    private List<DanhMuc> dsdm;
    private SanPham sp;
    private DanhMuc dm;

    public DanhSachDuLieu(List<SanPham> dssp, List<DanhMuc> dsdm, DanhMuc dm) {
        this.dssp = dssp;
        this.dsdm = dsdm;
        this.dm = dm;
    }
    public DanhMuc getDm() {
        return dm;
    }
    public void setDm(DanhMuc dm) {
        this.dm = dm;
    }    
    public DanhSachDuLieu(List<SanPham> dssp, List<DanhMuc> dsdm) {
        this.dssp = dssp;
        this.dsdm = dsdm;
    }
    public DanhSachDuLieu(List<SanPham> dssp, List<DanhMuc> dsdm, SanPham sp) {
        this.dssp = dssp;
        this.dsdm = dsdm;
        this.sp = sp;
    }
    public SanPham getSp() {
        return sp;
    }
    public void setSp(SanPham sp) {
        this.sp = sp;
    }      
    public List<SanPham> getDssp() {
        return dssp;
    }
    public void setDssp(List<SanPham> dssp) {
        this.dssp = dssp;
    }
    public List<DanhMuc> getDsdm() {
        return dsdm;
    }
    public void setDsdm(List<DanhMuc> dsdm) {
        this.dsdm = dsdm;
    }
    
}
