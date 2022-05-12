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
public class TaiKhoan {
    //Tài khoản(username, mật khẩu, họ tên, email, quyền)
    private String username;
    private String matKhau;
    private String hoTen;
    private String email;
    private int quyen;

    public TaiKhoan() {
    }
    public TaiKhoan(String username, String matKhau, String hoTen, String email, int quyen) {
        this.username = username;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.email = email;
        this.quyen = quyen;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMatKhau() {
        return matKhau;
    }
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getQuyen() {
        return quyen;
    }
    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }
    @Override
    public String toString() {
        return "TaiKhoan{" + "username=" + username + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", email=" + email + ", quyen=" + quyen + '}';
    }
    
   
}
