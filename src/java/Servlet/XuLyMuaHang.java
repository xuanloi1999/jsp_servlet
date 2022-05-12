/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.DanhMucDao;
import Dao.SanPhamDao;
import Entity.DanhMuc;
import Entity.DanhSachDuLieu;
import Entity.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xuanl
 */
@WebServlet(name = "XuLyMuaHang", urlPatterns = {"/XuLyMuaHang"})
public class XuLyMuaHang extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        Cookie[] cookies = request.getCookies();
        
        String temp = request.getParameter("pid");

        if ("themsanpham".equals(temp)) {
            DanhMucDao dmd = new DanhMucDao();
            List<DanhMuc> dsdm = dmd.getTatCaDanhMuc();
            SanPhamDao spd = new SanPhamDao();
            List<SanPham> dssp = spd.getTatCaSanPham();
            DanhSachDuLieu dsdl = new DanhSachDuLieu(dssp, dsdm);
            request.setAttribute("dsdl", dsdl);
            request.getServletContext().getRequestDispatcher("/themsanpham.jsp").forward(request, response);
        } else if ("themdanhmuc".equals(temp)) {
            DanhMucDao dmd = new DanhMucDao();
            List<DanhMuc> dsdm = dmd.getTatCaDanhMuc();
            SanPhamDao spd = new SanPhamDao();
            List<SanPham> dssp = spd.getTatCaSanPham();
            DanhSachDuLieu dsdl = new DanhSachDuLieu(dssp, dsdm);
            request.setAttribute("dsdl", dsdl);
            request.getServletContext().getRequestDispatcher("/themdanhmuc.jsp").forward(request, response);

        } else {
            int page = 1;
            int recordsPerPage = 5;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }

            SanPhamDao spd = new SanPhamDao();
            List<SanPham> dssp = spd.getTatCaSanPham((page - 1) * recordsPerPage,
                    recordsPerPage);
            int noOfRecords = spd.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            DanhMucDao dmd = new DanhMucDao();
            List<DanhMuc> dsdm = dmd.getTatCaDanhMuc();

            DanhSachDuLieu dsdl = new DanhSachDuLieu(dssp, dsdm);
            request.setAttribute("dsdl", dsdl);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            //request.setAttribute("dssp", dssp);
            for (Cookie cooky : cookies) {
            cooky.setMaxAge(0);
            response.addCookie(cooky);
        }
            request.getRequestDispatcher("home.jsp").forward(request, response);
            
        }
        

        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(XuLyMuaHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(XuLyMuaHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
