<%-- 
    Document   : insertadmin
    Created on : 23-Feb-2020, 12:32:23
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
        <title>Insert Data</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Insert Data
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="admin.jsp">Admin</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Insert Data</li>
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
        <jsp:include page="dbconnect.jsp"/>
        <%
        String msg="";
        if(request.getParameter("insert")!=null){
        String pname=request.getParameter("pname");
        String pdesc=request.getParameter("pdesc");
        int stock=Integer.parseInt(request.getParameter("stock"));
        float price=Float.parseFloat(request.getParameter("price"));
        String image=request.getParameter("image");
        Connection con=(Connection)application.getAttribute("con");
        Statement stmt=con.createStatement();
        int row=stmt.executeUpdate("Insert into products (pid,pname,pdesc,stock,price,image) values (NULL,'"+pname+"','"+pdesc+"','"+stock+"','"+price+"','"+image+"')");
        
        msg=row+" are affaceted .";
        }
        %>
        <section class="uza-contact-area section-padding-80">
            <div class="container">
                <form action="" method="post">
                    <input type="text" name="pname" class="form-control col-lg-5" placeholder="Please Enter the product name"/><br/>
                    <textarea name="pdesc" class="form-control col-lg-5" placeholder="Please Enter the product description" rows="5"/></textarea><br/>
                    <input type="number" name="stock" class="form-control col-lg-5" placeholder="Please Enter the product stock"/><br/>
                    <input type="number" name="price" class="form-control col-lg-5" placeholder="Please Enter the product price"/><br/>
                    <input type="file" name="image" class="form-control col-lg-5"/><br/>
                    <input type="submit" name="insert" class="btn btn-info col-lg-2"/>
                </form>
                <br/>
                <p style="color:teal;font-size:30px;"><%= msg%></p>
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