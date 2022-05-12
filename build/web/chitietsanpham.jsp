<%-- 
    Document   : home
    Created on : Jan 4, 2022, 11:04:00 AM
    Author     : xuanl
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
        

    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <img src="img/logo.png" alt="" width="100" height="100">
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <c:forEach items="${dsdl.dsdm}" var="dm">
                                <li class="nav-item">
                                    <a class="nav-link" href="#">${dm.ten}</a>
                                </li>
                            </c:forEach>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><i class="fas fa-shopping-cart"></i> <span style="height: 5; width: 5; border-radius: 50%; background-color:#FFEB3B; ">3</span> Gio hang  </a>
                            </li>
                            <c:if test="${sessionScope.taikhoan == null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="login.jsp">Dang Nhap</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.taikhoan!=null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="XuLyDangXuatDangXuat">Dang Xuat</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.taikhoan!=null}">
                                <li class="nav-item">
                                    <a class="nav-link">Xin chao,   ${taikhoan.hoTen} </a>
                                </li>
                            </c:if>
                        </ul>
                        <form class="d-flex" action="XuLyTimKiem">
                                <input class="form-control me-2" type="search" name="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit" >Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
        <div class="container">
            <div class="row">
                <div class="card mb-3">
                    <img src="${dsdl.sp.hinh}"  class="card-img-top" alt="${dsdl.sp.ten}" style="height: 500; width: 50%">
                    <div class="card-body">
                        <h5 class="card-title">${dsdl.sp.ten}</h5>
                        <p class="card-text">${dsdl.sp.chiTiet}</p>
                        <a href="#" class="btn btn-primary">Them vao gio hang</a>
                    </div>
                </div>

            </div>
        </div>
        <div class="container">
            <p>San pham tuong tu<br></p>
            <div class="row">
                <c:forEach items="${dsdl.dssp}" var="sp">
                    <div class="col-6 col-md-4">

                        <div class="card" style="width: 18rem;">
                            <img src="${sp.hinh}"class="card-img-top" alt="${sp.ten}">
                            <div class="card-body">
                                <h5 class="card-title">${sp.ten}</h5>
                                <p class="card-text">${sp.chiTiet.substring(0,80)}...<a href="ChiTietSanPham?pid=${sp.ma}">Xem chi tiet</a></p>
                                <a href="#" class="btn btn-primary">Them vao gio hang</a>
                            </div>
                        </div>

                    </div>
                </c:forEach>

            </div>
    </body>
    <footer class="py-5">
    <div class="row">
      <div class="col-2">
        <h5>Section</h5>
        <ul class="nav flex-column">
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>
        </ul>
      </div>

      <div class="col-2">
        <h5>Section</h5>
        <ul class="nav flex-column">
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>
        </ul>
      </div>

      <div class="col-2">
        <h5>Section</h5>
        <ul class="nav flex-column">
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>
          <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>
        </ul>
      </div>

      <div class="col-4 offset-1">
        <form>
          <h5>Subscribe to our newsletter</h5>
          <p>Monthly digest of whats new and exciting from us.</p>
          <div class="d-flex w-100 gap-2">
            <label for="newsletter1" class="visually-hidden">Email address</label>
            <input id="newsletter1" type="text" class="form-control" placeholder="Email address">
            <button class="btn btn-primary" type="button">Subscribe</button>
          </div>
        </form>
      </div>
    </div>

    <div class="d-flex justify-content-between py-4 my-4 border-top">
      <p>© 2021 Company, Inc. All rights reserved.</p>
      <ul class="list-unstyled d-flex">
          <i class="fab fa-facebook" style="margin-left: 5px"></i>
       <i class="fab fa-instagram" style="margin-left: 5px"></i>
       <i class="fab fa-youtube" style="margin-left: 5px"></i>
       </ul>
    </div>
  </footer>
</body>
</html>
