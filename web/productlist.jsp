<%-- 
    Document   : productlist
    Created on : 16-Jan-2020, 18:10:53
    Author     : Ravikumar Makwana
--%>
<%@page import="com.vvp.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*"%>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="uza - Model Agency HTML5 Template">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Title -->
        <title>E-Commerce</title>

        <!-- Favicon -->
        <link rel="icon" href="./img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <%
        if (application.getAttribute("products") == null) {
            Products p1 = new Products("Redmi Note 8", 10, 20000, 1);
            Products p2 = new Products("Redmi 8A", 10, 15000, 2);
            Products p3 = new Products("Redmi Note 7", 10, 10000, 3);
            HashMap<Integer, Products> products = new HashMap<Integer, Products>();
            products.put(1, p1);
            products.put(2, p2);
            products.put(3, p3);
            application.setAttribute("products", products);
        }
        %>

        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                E-Commerce
                            </h2>
                            <p align="right">
                                <%!    int count = 0;
                                %>
                                <%
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        if (cartItems != null) {
            count = 0;
            for (int i : cartItems.keySet()) {
                count += cartItems.get(i);
            }
        }

                                %>
                                <a href="cartitems.jsp"> Cart : <%= count%></a>
                            </p>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 2</li>
                                    <li class="breadcrumb-item active" aria-current="page">E-Commerce</li>
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
        <jsp:include page="dbconnect.jsp"/>
        <div class="container">
            <div class="row">
                <%
        Connection con = (Connection) application.getAttribute("con");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from products");
        while (rs.next()) {
            String img = "img/" + rs.getString(6);
                %>
                <!-- Single Blog Post -->
                <div class="col-12 col-lg-4">
                    <div class="single-blog-post bg-img mb-80" align="center">
                        <img src="<%= img%>" width="400px"/>
                        <!-- Post Content -->
                        <div class="post-content" align="left">
                            <%= rs.getString("pdesc")%><br/>
                            Price : <%= rs.getFloat("price")%><br/>
                            Stock : <%= rs.getInt("stock")%><br/><br/>
                            <div align="center">
                                <form action="productlist.do" method="get">
                                    <input type="hidden" value="1" name="pid"/>
                                    Quantity:<input type="number" value="1" name="q"/><br/><br/>
                                    <input type="submit" class="btn btn-primary" value="Add To Cart" name="addtocart"/>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <% }%>
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
