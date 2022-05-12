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
                            <li class="nav-item">
                                <a class="nav-link" href="QuanLySanPham">Quan Ly San Pham</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="LayDuLieu">Quan Ly Nguoi Dung</a>
                            </li>
                           
                            <li class="nav-item">
                                <a class="nav-link" href="XuLyCart"><i class="fas fa-shopping-cart"></i> <span style="height: 5; width: 5; border-radius: 50%; background-color:#FFEB3B; ">${soluong}</span> Gio hang  </a>
                            </li>
                            <c:if test="${sessionScope.taikhoan == null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="login.jsp">Dang Nhap</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.taikhoan!=null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="XuLyDangXuat">Dang Xuat</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.taikhoan!=null}">
                                <li class="nav-item">
                                    <a class="nav-link">Xin chao,   ${taikhoan.hoTen} </a>
                                </li>
                            </c:if>
                        </ul>
                        <form class="d-flex">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
        <div >
            <div class="row">
                <c:forEach items="${dsdl.dsdm}" var="dm">
                    <div class="col-1" style="height: 30px; background-color:#f8f9fa;margin-top: 5px; margin-left: 2px; margin-bottom: 10px; text-align:  center; border-radius: 5px;"><a style="text-decoration: none" href="SanPhamTheoDanhMuc?pid=${dm.ma}">${dm.ten}</a></div>
                </c:forEach>
            </div>
        </div>
        <div class="container">
            <form action="XuLyThemSanPham">
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Ten</label>
                    <input type="text"   class="form-control" name="ten" id="exampleInputPassword1">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Gia</label>
                    <input type="text" class="form-control" name="gia" id="exampleInputPassword1">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Hinh</label>
                    <input type="text"  class="form-control" id="exampleInputEmail1" name="hinh" aria-describedby="emailHelp">

                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Chi tiet</label>
                    <input type="text"  class="form-control" id="exampleInputEmail1" name="chitiet" aria-describedby="emailHelp">

                </div>
                    <select name="madanhmuc" class="form-select" aria-label="Default select example">
                    <option selected>Chon danh muc</option>
                    <c:forEach items="${dsdl.dsdm}" var = "dm">
                    <option value="${dm.ma}">${dm.ten}</option>
                    </c:forEach>
                </select>
                <button type="submit" class="btn btn-primary">Them</button>

            </form>
    </body>
</html>
