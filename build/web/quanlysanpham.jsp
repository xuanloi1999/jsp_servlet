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

        <div>
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
                                <a class="nav-link active" aria-current="page" href="LayDuLieu">Trang chu</a>
                            </li>
                            <c:if test="${sessionScope.taikhoan.quyen == 1}">
                            <li class="nav-item">
                                <a class="nav-link" href="QuanLySanPham">Quan Ly San Pham</a>
                            </li>
                            
                            <li class="nav-item">
                                <a class="nav-link" href="LayDuLieu">Quan Ly Danh Muc</a>
                            </li>
                            </c:if>
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
            <a class="btn btn-primary " href="LayDuLieu?pid=themsanpham" role="button">Them san pham</a>
            <div class="row">

                <c:forEach items="${dsdl.dssp}" var="sp">
                    <div class="col-6 col-md-4">
                        <div class="card" style="width: 18rem;">
                            <img src="${sp.hinh}" class="card-img-top" alt="${sp.ten}">
                            <div class="card-body">
                                <h5 class="card-title">${sp.ten}</h5>
                                <p>${sp.chiTiet.substring(0,10)}...<a href="ChiTietSanPham?pid=${sp.ma}">Xem chi tiet</a></p>
                                <a href="XuLySua?pid=${sp.ma}" class="btn btn-primary">Sua</a>
                                <a href="XuLyXoa?pid=${sp.ma}" class="btn btn-primary">Xoa</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
            <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                    <c:if test="${currentPage != 1}">
                        
                        <a class="page-link" href="PhanTrangServlet?page=${currentPage - 1}" >Previous</a>
                    </c:if>
                    <c:forEach begin="1" end="${noOfPages}" var="i">
                        <c:choose>
                            <c:when test="${currentPage eq i}">
                                <li class="page-item"><a class="page-link" href="PhanTrangServlet?page=${i}">${i}</a></li>
                                </c:when>
                                <c:otherwise>
                                <li class="page-item"><a class="page-link" href="PhanTrangServlet?page=${i}">${i}</a></li>

                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:if test="${currentPage lt noOfPages}">
                        <li class="page-item">
                        <a class="page-link" href="PhanTrangServlet?page=${currentPage + 1}">Next</a>
                    </li>
                    </c:if>
                   
                </ul>
            </nav>
        </div>
    </body>
</html>
