/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xuanl
 */
public class TaiKhoanDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<TaiKhoan> getTatCaTaiKhoan() {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        String query = "select * from account";
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TaiKhoan(rs.getString(1),
                        rs.getString(4),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(5)
                        
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public TaiKhoan taiKhoanCanTim(String username){
        String query = "SELECT * FROM `account` WHERE `tendangnhap` LIKE ?";
        TaiKhoan tk = new TaiKhoan();
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                tk = new TaiKhoan(rs.getString(1),
                        rs.getString(4),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(5)
                        
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    } 
    public boolean taoTaiKhoan(String username, String matKhau, String hoTen, String email, int quyen) throws Exception {
        boolean kq = false;
        if (taiKhoanCanTim(username).getUsername()== null) {
            String query = "INSERT INTO `account` (`tendangnhap`, `hoTen`, `email`, `password`, `quyen`) VALUES (? , ?, ?, ?, ?);";
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, hoTen);
            ps.setString(3, email);
            ps.setString(4, matKhau);
            ps.setInt(5, quyen);
            
            ps.executeUpdate();
            kq =  true;
        }
        return kq;

    }
    public static void main(String[] args) throws Exception {
        TaiKhoanDao spd = new TaiKhoanDao();
          System.out.println(spd.getTatCaTaiKhoan().toString());
        //System.out.println(spd.taiKhoanCanTim("xuanloi1999"));
        //spd.taoTaiKhoan("3", "1", "1", "1", 0);
    }
}

