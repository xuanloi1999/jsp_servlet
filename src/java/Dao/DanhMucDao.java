/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.DanhMuc;
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
public class DanhMucDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<DanhMuc> getTatCaDanhMuc() {
        List<DanhMuc> list = new ArrayList<DanhMuc>();
        String query = "select * from category";
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DanhMuc(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public DanhMuc getProductById(String ma) throws SQLException {
        String query = "SELECT * from `category` WHERE `madanhmuc` = ? ";
        DanhMuc dm = new DanhMuc();
        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                dm = new DanhMuc(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)    
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dm;
    }
    public void AddDanhMuc(DanhMuc dm) throws SQLException {
        String query = "INSERT INTO `category` (`madanhmuc`, `tendanhmuc`, `ghichu`) VALUES (NULL, ?, ?);";

        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);

            ps.setString(1, dm.getTen());
            ps.setString(2, dm.getGhiChu());
            
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void EditDanhMuc(DanhMuc dm) throws SQLException {
        String query = "UPDATE `category` SET `tendanhmuc` = ?, `ghichu` = ? WHERE `category`.`madanhmuc` = ? ";

        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);

            ps.setString(1, dm.getTen());
            ps.setString(2, dm.getGhiChu());
            ps.setString(3, dm.getMa());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void deleteDanhMuc(String id) throws SQLException {
        String query = "DELETE FROM `category` WHERE `category`.`madanhmuc` = ?";

        try {
            conn = new DBConnect().getConnection();//mo ket noi DB
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws Exception {
        DanhMucDao dmd = new DanhMucDao();
        dmd.AddDanhMuc(new DanhMuc( "77", "7"));
        
    }
}
