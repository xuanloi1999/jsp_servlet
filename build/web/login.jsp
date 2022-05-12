<%-- 
    Document   : login
    Created on : Jan 3, 2022, 3:55:54 AM
    Author     : xuanl
--%>

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
            <h3 class="text-whitesmoke">Dang Nhap</h3>
            
            <div class="container-content">
                <form class="margin-t" action="XuLyDangNhap"  method="POST">
                    <div class="form-group" style="margin-bottom: 2px">
                        <input type="text" class="form-control" placeholder="Username" required="" name="username">
                    </div>

                    <div class="form-group" style="margin-bottom: 2px">

                        <input type="password" class="form-control" placeholder="*****" required="" name="password">
                    </div>
                    <button type="submit" class="form-button button-l margin-b">Dang nhap</button>

                    
                   
                    <p class="text-whitesmoke text-center"><small>Do not have an account?</small></p>
                    <a class="text-darkyellow" href="signUp.jsp"><small>Sign Up</small></a>
                </form>

            </div>
        </div>
    </body>
</html>
