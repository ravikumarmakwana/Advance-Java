<%-- 
    Document   : finalstep
    Created on : 30-Jan-2020, 05:52:54
    Author     : Ravikumar Makwana
--%>
<%@page import="java.util.*,java.sql.*" %>
<%@page import="com.vvp.Products" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final Step</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Final Steps
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item active" aria-current="page"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 2</li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="productlist.jsp">Products page</a></li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="cartitems.jsp">Cart-Items</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Final Step</li>
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

        <jsp:include page="dbconnect.jsp"/>
        <div class="container">
            <%
        Connection con = (Connection) application.getAttribute("con");
        Statement stmt = con.createStatement();
        int userId = (Integer) session.getAttribute("loginID");
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        for (Integer i : cartItems.keySet()) {
            int r = stmt.executeUpdate("update products set stock=stock-" + cartItems.get(i) + " where pid=" + i + "");
        }
        int r = stmt.executeUpdate("delete from cart where userid=" + userId + "");
        out.println("<font size='5' face='candara'>");
        String pay=request.getParameter("pay");
        out.println("Total Payment :: "+pay+"<br/>");
        out.println("Cash On Delivery<br/>");
        out.println("Order arriving in Two Days.");
        out.println("<h3 style='color:teal;'>Thank you for Shopping !!!</h3>");
        out.println("</font>");
        session.setAttribute("cart", "");
            %>
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