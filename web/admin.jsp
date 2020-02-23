<%-- 
    Document   : admin
    Created on : 20-Feb-2020, 13:23:43
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Admin Panel
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Admin Panel</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Background Curve -->
            <div class="breadcrumb-bg-curve">
                <img src="./img/core-img/curve-5.png" alt="">
            </div>
        </div>
        <!-- ***** Breadcrumb Area End ***** -->
        <div class="container">
            <div class="row">
                
                <div class="col-lg-8">
                    <br/><br/><br/><br/>
                    <a href="insertadmin.jsp" class="btn btn-info col-lg-5">Insert</a><br/><br/><br/><br/>
                    <a href="displayadmin.jsp" class="btn btn-info col-lg-5">Display</a><br/><br/><br/><br/>
                </div>

                <div class="col-lg-4">
                    <img class="col-lg-8" src="img/admin.jpg" style="border-radius: 100%"/><br/>
                    <br/>
                    <h2 style="color:teal;">Ravikumar Makwana</h2>
                    <h4 style="color:silver;">18ravi2000@gmail.com</h4>
                    <h4 style="color:silver;">63505 08988</h4>
                </div>
            </div>
        </div>
        <!-- jQuery js -->
        <script src="js/jquery.min.js"></script>
        <!-- Popper js -->
        <script src="js/popper.min.js"></script>
        <!-- Bootstrap js -->
        <script src="js/bootstrap.min.js"></script>
        <!-- All js -->
        <script src="js/uza.bundle.js"></script>
        <!-- Active js -->
        <script src="js/default-assets/active.js"></script>

    </body>
</html>
<%@include file="footer.jsp" %>