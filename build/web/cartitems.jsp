<%-- 
    Document   : cattitems
    Created on : 24-Jan-2020, 20:00:54
    Author     : Ravikumar Makwana
--%>
<%@page import="com.vvp.*" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include file="header.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Items</title>
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
                                    <li class="breadcrumb-item active" aria-current="page"><a href="productlist.jsp">Product-List</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Cart-Items</li>
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
             <div>
                <%

            HashMap <Integer,Products> products=(HashMap <Integer,Products>)application.getAttribute("products");
            HashMap <Integer,Integer> cartItems=(HashMap <Integer,Integer>)session.getAttribute("cart");
            int c=1;
            double grandTotal=0;
            if(cartItems!=null){
                    if(cartItems.size()!=0){
                    out.println("<table border='1' class='table'>");
                    out.println("<tr align='center'>");
                    out.println("<th>Sr No.</th>");
                    out.println("<th>Name of Products</th>");
                    out.println("<th>Quantity</th>");
                    out.println("<th>Price</th>");
                    out.println("<th>Remove</th>");
                    out.println("<th>Buy</th>");
                    out.println("</tr>");
                for(Integer i: cartItems.keySet())
                {
                    Products p=products.get(i);
                    grandTotal+= p.getPrice() * cartItems.get(i);
                    out.println("<tr align='center'><td>"+(c++)+"</td><td>"+p.getPname()+"</td><td>"+cartItems.get(i)+"</td><td>"+p.getPrice()+"</td>");
                    out.println("<td><form action='finalstep.jsp' method='get'> <input type='hidden' name='pid' value='"+ p.getPid() +"'> <input type='submit' value='Remove' class='btn btn-danger' name='operation'/></form> </td><td> <form action='buyersinformation.jsp'> <input type='hidden' name='pid' value='"+ p.getPid() +"'> <input type='submit' class='btn btn-success' value='Buy' name='operation'/></form></td></tr>");
                }
                out.println("</table>");
                out.println("<h3>Grand Total :: "+grandTotal+" Rs.</h3>");
                    }
                    else
                        out.println("Your Cart is Empty ! ! !");
            }
            else
            {
                out.println("Your Cart is Empty ! ! !");
            }

        %>
            </div>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>