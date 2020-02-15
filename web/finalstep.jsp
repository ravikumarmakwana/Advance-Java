<%-- 
    Document   : finalstep
    Created on : 30-Jan-2020, 05:52:54
    Author     : Ravikumar Makwana
--%>
<%@page import="java.util.*" %>
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

         <div class="container">

        <%

            HashMap <Integer,Products> products=(HashMap <Integer,Products>)application.getAttribute("products");
            HashMap <Integer,Integer> cartItems=(HashMap <Integer,Integer>)session.getAttribute("cart");
            String op=request.getParameter("operation");
            int pid=Integer.parseInt(request.getParameter("pid"));
            if(op.equals("Buy"))
            {
                Products p=products.get(pid);
                int stock=p.getStock(),q=cartItems.get(pid);
                stock-=q;
                out.println("<font size='5' face='candara'>");
                out.println("Product : "+p.getPname()+"<br/>");
                out.println("Quantity : "+q+"<br/>");
                out.println("Payment method : COD <br/>");
                out.println("Total Payment : "+p.getPrice()*q+" Rs.<br/>");
                out.println("Thank you for Shopping !!!");
                out.println("</font>");
                p.setStock(stock);
                cartItems.remove(pid);
                application.setAttribute("products", products);
                session.setAttribute("cart", cartItems);
            }
            else if(op.equals("Remove"))
            {
                out.println("<font size='5' face='candara'>");
                out.println("Items remove form cart");
                out.println("</font>");
                cartItems.remove(pid);
                session.setAttribute("cart", cartItems);      
            }
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