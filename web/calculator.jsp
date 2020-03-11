<%-- 
    Document   : calculator
    Created on : 23-Jan-2020, 17:48:17
    Author     : Ravikumar Makwana
--%>

<%@include file="header.jsp" %>
<%@page contentType="text/html" errorPage="errorpage.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Calculator
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 2</li>
                                    <li class="breadcrumb-item active" aria-current="page">Calculator</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
            <%!
            double result;

      public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double sub(double n1, double n2) {
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        return n1 / n2;
    }
            %>
            <%
        result=0;
        if (request.getParameter("op") != null) {
            result=0;
            double n1 = Double.parseDouble(request.getParameter("no1"));
            double n2 = Double.parseDouble(request.getParameter("no2"));
            char c = request.getParameter("op").charAt(0);
            switch (c) {
                case '+':
                    result = add(n1, n2);
                    break;

                case '-':
                    result = sub(n1, n2);
                    break;

                case '*':
                    result = mul(n1, n2);
                    break;

                case '/':
                    result=div(n1, n2);
                    break;
            }
        }
            %>

            <!-- Background Curve -->
            <div class="breadcrumb-bg-curve">
                <img src="./img/core-img/curve-3.png" alt="">
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
                                <form action="" method="get">
                                    <div class="form-group">
                                        <input type="text" name="no1" class="form-control mb-30" placeholder="Enter the first number"/><br/>
                                        <input type="text" name="no2" class="form-control mb-30" placeholder="Enter thr second number"/><br/>
                                        <input type="submit" name="op" value="+" class="btn btn-info" style="width:50px;"/>&nbsp;&nbsp;&nbsp;
                                        <input type="submit" name="op" value="-" class="btn btn-info" style="width:50px;"/>&nbsp;&nbsp;&nbsp;
                                        <input type="submit" name="op" value="*" class="btn btn-info" style="width:50px;"/>&nbsp;&nbsp;&nbsp;
                                        <input type="submit" name="op" value="/" class="btn btn-info" style="width:50px;"/>&nbsp;&nbsp;&nbsp;<br/><br/><br/>
                                        <input type="text" name="result" value=<%= result%> class="form-control"  placeholder="Result :" disabled="disabled"/>
                                           </div>
                                </form>
                            </div>
                        </div>
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