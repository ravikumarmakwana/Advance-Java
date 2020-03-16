<%-- 
    Document   : cattitems
    Created on : 24-Jan-2020, 20:00:54
    Author     : Ravikumar Makwana
--%>
<%@page import="java.util.*,java.sql.*" %>
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
        <jsp:include page="dbconnect.jsp"/>
        <div class="container">
             <div>
                <%
            HashMap <Integer,Integer> cartItems=(HashMap <Integer,Integer>)session.getAttribute("cart");
            Connection con = (Connection)application.getAttribute("con");
            Statement stmt = con.createStatement();
            String msg="";
             if(request.getParameter("pid")!=null)
            {
                int row=stmt.executeUpdate("delete from cart where pid='"+Integer.parseInt(request.getParameter("pid"))+"' and userid='"+(Integer)session.getAttribute("loginID")+"' ");
                if(row!=0)
                    msg="Product is Remove from cart ! ! !";
                cartItems.remove(Integer.parseInt(request.getParameter("pid")));
                session.setAttribute("cart", cartItems);
            }
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
                    out.println("</tr>");
                for(Integer i: cartItems.keySet())
                {
                    ResultSet rs = stmt.executeQuery("Select * from products where pid='"+i+"'");
                    rs.next();
                    grandTotal+=cartItems.get(i)*rs.getDouble("price");
                    out.println("<tr align='center'><td>"+(c++)+"</td><td>"+rs.getString("pname")+"</td><td>"+cartItems.get(i)+"</td><td>"+rs.getDouble("price")+"</td>");
                    %>
                    <td><a class='btn btn-outline-danger' href='cartitems.jsp?pid=<%= i %>'>Remove</a></td></tr>
                <%}
                out.println("</table>");
                out.println("<h3>Grand Total :: "+grandTotal+" Rs.</h3>");
                %>
                <a href="buyersinformation.jsp"><h3 class='btn btn-outline-primary' style="width:150px;">Buy All</h3></a>
                <%}
                else
                    out.println("<p style='color:teal; font-size:30px;'>Your Cart is Empty ! ! !</p>");
            }
            else
            {
                out.println("<p style='color:teal; font-size:30px;'>Your Cart is Empty ! ! !</p>");
            }
           if(msg.length()!=0)
                out.println("<p style='color:teal; font-size:30px;'>"+msg+"</p>");
        %>
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