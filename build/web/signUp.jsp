<%-- 
    Document   : login
    Created on : Jan 3, 2022, 3:55:54 AM
    Author     : xuanl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/login.css" type="text/css" media="all" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body class="main-bg">
        <div class="login-container text-c animated flipInX">
            <div>
                <h1 class="logo-badge text-whitesmoke"><span class="fa fa-user-circle"></span></h1>
            </div>
            <h3 class="text-whitesmoke">Sign In Template</h3>
            <p class="text-whitesmoke">Sign In</p>
            <div class="container-content">
                <form class="margin-t" action="XuLyDangKy">
                   
                    <div class="form-group" style="margin-bottom: 2px">
                        <input type="text" class="form-control"  placeholder="Ten dang nhap" required="" name="tendangnhap" value="${tk.username}">
                    </div>
                    <div class="form-group" style="margin-bottom: 2px">
                        <div class="form-group" style="margin-bottom: 2px">

                            <input type="password" class="form-control" placeholder="Mat khau" required="" name="matkhau">
                        </div>
                        <div class="form-group" style="margin-bottom: 2px">

                            <input type="password" class="form-control" placeholder="Xac nhan mat khau" required="" name="xnmatkhau">
                        </div>
                        <input type="text" class="form-control" placeholder="Ho ten" required="" name="hoten" value="${tk.hoTen}">
                    </div>
                    <div class="form-group" style="margin-bottom: 2px">
                        <input type="text" class="form-control" placeholder="Email" required="" name="email" value="${tk.email}">
                    </div>
                    
                    <button type="submit" class="form-button button-l margin-b">Dang ky</button>

                    
                    <p class="text-whitesmoke text-center"><small>Do you have an account?</small></p>
                    <a class="text-darkyellow" href="login.jsp"><small>Dang nhap</small></a>
                </form>

            </div>
        </div>
    </body>
</html>
