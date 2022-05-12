/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.SanPham;
import Entity.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xuanl
 */
public class SanPhamDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<SanPham> getTatCaSanPham() {
        List<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from shoe_products";
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SanPham(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<SanPham> getTatCaSanPhamTheoDanhMuc(String maDanhMuc) {
        List<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from shoe_products where madanhmuc= ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, maDanhMuc);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SanPham(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public SanPham getProductById(String ma) throws SQLException {
        String query = "SELECT * from `shoe_products` WHERE `id` = ? ";
        SanPham tk = new SanPham();
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                tk = new SanPham(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
    public List<SanPham> getProductByString(String ma) throws SQLException {
        String query = "SELECT * from `shoe_products` WHERE `id` like ? or  `tengiay` like ? or`giagiay` like ? or `chitiet` like ? or `madanhmuc` like ? ";
         List<SanPham> list = new ArrayList<SanPham>();
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            String str = "%" + ma + "%";
            ps.setString(1, str);
            ps.setString(2, str);
            ps.setString(3, str);
            ps.setString(4, str);
            ps.setString(5, str);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SanPham(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void AddSanPham(SanPham sp) throws SQLException {
        String query = "INSERT INTO `shoe_products` (`id`, `tengiay`, `giagiay`, `hinh`, `chitiet`, `madanhmuc`) VALUES (NULL, ? ,?,?,?,?);";

        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            //ps.setString(1, sp.getMa());
            ps.setString(1, sp.getTen());
            ps.setString(2, sp.getGia());
            ps.setString(3, sp.getHinh());
            ps.setString(4, sp.getChiTiet());
            ps.setString(5, sp.getMaDanhMuc());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void editSanPham(SanPham sp) throws SQLException {
        String query = "UPDATE `shoe_products` SET `tengiay` = ?, `giagiay` = ?, `hinh` = ?,  `chitiet` = ?, `madanhmuc` = ? Where `id` = ? ";

        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);

            ps.setString(1, sp.getTen());
            ps.setString(2, sp.getGia());
            ps.setString(3, sp.getHinh());
            ps.setString(4, sp.getChiTiet());
            ps.setInt(5, Integer.parseInt(sp.getMaDanhMuc()));
            ps.setString(6, sp.getMa());
            
            System.out.println(ps.executeUpdate());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void deleteSanPham(String id) throws SQLException {
        String query = "DELETE FROM `shoe_products` WHERE `shoe_products`.`id` = ?";

        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public List<SanPham> getTatCaSanPham(int start, int page) {
        List<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from shoe_products limit ? , ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setInt(1, (start));
            ps.setInt(2, page);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SanPham(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public int getNoOfRecords() {
        //To change body of generated methods, choose Tools | Templates.
        int kq = 0;
        String query = "select count(*) from shoe_products";
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            rs.next();
            kq = rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public static void main(String[] args) throws SQLException {
        SanPhamDao spd = new SanPhamDao();
        System.out.println(spd.getProductByString("Flywire cables"));
        spd.editSanPham(new SanPham("28", "888","888" , "888", "888", "2"));
    }
}
