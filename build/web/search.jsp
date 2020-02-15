<%-- 
    Document   : search
    Created on : 15-Feb-2020, 11:47:25
    Author     : Ravikumar Makwana
--%>

<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page errorPage="errorpage.jsp"
import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Data</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Search Data
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 3</li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="product_jdbc.jsp">JDBC Operations</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Search Data</li>
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
                <form action="" method="post">
                    <h3>Search by . . .</h3>
                    <select name="searchby" class="form-control col-lg-5">
                        <option value="pname">Product name</option>
                        <option value="pdesc">Product description</option>
                        <option value="stock">Product stock</option>
                        <option value="price">Product price</option>
                    </select><br/>
                    <input type="text" name="searchvalue" class="form-control col-lg-5" placeholder="enter the search value"/><br/>
                    <input type="submit" name="search" value="Search" class="btn btn-info"/>
                </form>
                <br/>
                <br/>
                <%
                if(request.getParameter("search")!=null)
                {
                    String searchby=request.getParameter("searchby");
                    String searchvalue=request.getParameter("searchvalue");
                    Connection con=(Connection)application.getAttribute("con");
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("Select * from products_jdbc where "+searchby+" like '%"+searchvalue+"%'");
                if(!rs.next())
                {
                    %>
                    <h3>No Such Items Found ! ! !</h3>
                    <%
                }else{
                %>
                <table class="table">
                    <tr>
                        <th>Sr. No</th>
                        <th>Product Name</th>
                        <th>Product Description</th>
                        <th>Stock</th>
                        <th>Price</th>
                    </tr>
                    <%
                    int c=1;
                    do{
                    %>
                    <tr>
                        <td><%= c++%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td>
                        <td><%= rs.getInt(4)%></td>
                        <td><%= rs.getFloat(5)%></td>
                    </tr>
                    <%}while(rs.next());%>
                </table>
                <%}}%>
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