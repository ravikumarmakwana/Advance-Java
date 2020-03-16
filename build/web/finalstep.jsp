<%-- 
    Document   : finalstep
    Created on : 30-Jan-2020, 05:52:54
    Author     : Ravikumar Makwana
--%>
<%@page import="java.util.*,java.sql.*,com.vvp.Products" contentType="text/html" pageEncoding="UTF-8"%>
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

        <style>
             td,th{
                 text-align:center;
                 vertical-align:center;
             }
         </style>
        <div class="container">
            <%
                Connection con = (Connection) application.getAttribute("con");
        Statement stmt = con.createStatement();
        int userId = (Integer) session.getAttribute("loginID");
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        Double total = 0.0;
        out.println("<table border='1' class='table'>");
        out.println("<tr><th>Product Name</th><th>Quantity</th><th>Price</th></tr>");
        for (Integer i : cartItems.keySet()) {
            ResultSet rs = stmt.executeQuery("Select * from  products where pid=" + i + "");
            rs.next();
            int stock = rs.getInt("stock");
            String pname = rs.getString("pname");
            Double price = rs.getDouble("price");
            stock -= cartItems.get(i);
            out.println("<tr>");
            out.println("<td>" + pname + "</td><td>" + cartItems.get(i) + "</td><td>");
            if (stock >= 0) {
                int r = stmt.executeUpdate("update products set stock=" + stock + " where pid=" + i + "");
                out.println("<span style='color:blue;'>RS. "+price * cartItems.get(i)+"</span>");
                total += price * cartItems.get(i);
            } else {
                out.println("<span style='color:red;'>Not Available</span>");
            }
            out.println("</td></tr>");
        }
        out.println("</table>");
        int r = stmt.executeUpdate("delete from cart where userid=" + userId + "");
        out.println("<h2 style='color:green;'>Total Payment :: Rs. "+total+"</h2>");
        out.println("<h3 style='color:teal;'>Cash On Delivery</h3>");
        out.println("<h4 style='color:teal;'>Order arriving in Two Days.</h4>");
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