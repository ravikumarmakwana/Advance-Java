<%-- 
    Document   : login
    Created on : 23-Jan-2020, 16:59:07
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include file="header.html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login User</title>
    </head>
    <body>
        <div class="breadcrumb-area">
        <div class="container h-100">
            <div class="row h-100 align-items-end">
                <div class="col-12">
                    <div class="breadcumb--con">
                        <h2 class="title">
                        Login
                        </h2>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Login</li>
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

    <!-- ***** Contact Area Start ***** -->
    <section class="uza-contact-area section-padding-80">
        <div class="container">
            <div class="row justify-content-between">
                <!-- Contact Form -->
                <div class="col-12 col-lg-12">
                    <div class="uza-contact-form mb-80">
                        <div class="col-lg-6">
                            <form action="login.do" method="get">
                            <div class="form-group">
                                <input type="text" name="username" size="32" class="form-control mb-30" placeholder="Enter the name">
                            </div>
                            <div class="form-group">
                                <input type="password" name="password" size="32" class="form-control mb-30" placeholder="Enter the password">
                                <input type="submit" value="Login" class="btn btn-primary" style="width:100px;">
                            </div>
                           </form>
                        </div>
                    </div>
                </div>
              </div>
            </div>
    </section>
    </body>
</html>
<%@include file="footer.html" %>
