<%-- 
    Document   : buyersinformation
    Created on : 29-Jan-2020, 21:24:17
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Information</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Cart-Items
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 2</li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="cartitems.jsp">Cart-Items</a></li>
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
            <div class="row justify-content-between">
                <!-- Contact Form -->
                <div class="col-12 col-lg-12">
                    <div class="uza-contact-form mb-80">
                        <div class="col-lg-6">
                            <form action="finalstep.jsp" method="get">
                                <textarea rows="5" class="form-control mb-30" required="required" placeholder="Please enter your home address ..."></textarea>
                                <input type="number" name="pincode" required="required" placeholder="Please Enter the your Pin code . . ." class="form-control mb-30"/>
                                Please enter the you convent time to recive product .
                                <input type="time" name="time" required="required"/><br/><br/>
                                <h4>Payment methods:</h4>
                                <input type="radio" name="payment" value="COD" id="cod"/><label for="cod">COD (Cash On Delivery)</label><br/><br/>
                                <input type="radio" name="payment" value="Debit" id="debet"/><label for="debrt">Debit Card (<font color="red" size="2">This Service is not available</font>)</label><br/><br/>
                                <input type="radio" name="payment" value="Credit" id="credit"/><label for="credit">Credit Card (<font color="red" size="2">This Service is not available</font>)</label><br/><br/>
                                <br/>
                                <input type="submit" value="Buy" name="operation" class="btn btn-success" style="width:100px;"/>
                            </form>
                        </div>
                    </div>
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