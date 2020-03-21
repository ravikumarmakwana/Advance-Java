<%-- 
    Document   : lms
    Created on : 20-Mar-2020, 21:11:26
    Author     : Ravikumar Makwana
--%>

<%@include file="header.jsp" %>
<%@page contentType="text/html" errorPage="errorpage.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Library Management System</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Library Management System
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Library Management System</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Background Curve -->
            <div class="breadcrumb-bg-curve">
                <img src="./img/core-img/curve-1.png" alt="">
            </div>
        </div>
        <!-- ***** Breadcrumb Area End ***** -->
        <!-- ***** Contact Area Start ***** -->
        <section class="uza-contact-area section-padding-80">
            <div class="container">
                <div class="row">
                    <!-- Contact Form -->
                    <div class="col-lg-4">
                        <h1><a href="issuebook.jsp" class="btn btn-outline-danger btn-block">Issue Book</a></h1><br/><br/>
                        <h1><a href="returnbook.jsp" class="btn btn-outline-danger btn-block">Return Book</a></h1><br/><br/>
                        <h1><a href="librarycardinfo.jsp" class="btn btn-outline-danger btn-block">Check Library Card bal</a></h1><br/><br/>
                    </div>
                    <div class="col-lg-8">
                        <img src="img/lms.jpg" alt="demo" style="border-radius:100%;" />
                    </div>
                </div>
            </div>
        </section>

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