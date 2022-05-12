/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.SanPhamDao;
import Entity.QuanLySanPhamEntity;
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
@WebServlet(name = "XuLyCart", urlPatterns = {"/XuLyCart"})
public class XuLyCart extends HttpServlet {

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

        SanPhamDao spd = new SanPhamDao();
        List<SanPham> dssp = new ArrayList<SanPham>();
        for (Cookie cookie : cookies) {
            if ("sanphamgiohang".equals(cookie.getName())) {
                String[] txt = cookie.getValue().split("/");
                for (String string : txt) {
                    String[] str = string.split("#");
                    SanPham sp = spd.getProductById(str[0]);
                    sp.setSoLuong(Integer.parseInt(str[1]));
                    dssp.add(sp);
                }
                break;
            }
        }
        int sum = 0;
        int count =0;
        for (SanPham sanPham : dssp) {
            count += sanPham.getSoLuong();
            sum += sanPham.getSoLuong()*Integer.parseInt(sanPham.getGia());
        }
        request.setAttribute("items", dssp.size());
        request.setAttribute("sum", sum);
        request.setAttribute("soluong", count);
        //dssp.add(new SanPham("111", "111", "111", "111", 10));
        request.setAttribute("dssp", dssp);
        request.getRequestDispatcher("cart.jsp").forward(request, response);

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
            Logger.getLogger(XuLyCart.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(XuLyCart.class.getName()).log(Level.SEVERE, null, ex);
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
