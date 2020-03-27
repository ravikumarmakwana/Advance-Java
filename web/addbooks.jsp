<%-- 
    Document   : addbooks
    Created on : 26-Mar-2020, 12:49:31
    Author     : Ravikumar Makwana
--%>

<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page errorPage="errorpage.jsp" import="java.sql.*"%>
<jsp:include page="dbconnect.jsp"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Books</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Add New Books
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="admin.jsp">Admin</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Add New Books</li>
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
        <%!
        String msg;
        %>
        <%
        if (request.getParameter("submit") != null) {

            Connection con = (Connection) application.getAttribute("con");
            Statement stmt = con.createStatement();
            int r = stmt.executeUpdate("Insert into books (title,author,stock) values ('" + request.getParameter("title") + "','" + request.getParameter("author") + "','" + Integer.parseInt(request.getParameter("stock")) + "')");
            if (r != 0) {
                msg = "Book Add Successfully ! ! !";
            }
        }
        %>
        <section class="uza-contact-area section-padding-80">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <form action="" method="post">
                            <input type="text" name="title" required="required" placeholder="Please enter the book title" class="form-control mb-30"/>
                            <input type="text" name="author" required="required" placeholder="Please enter the book author" class="form-control mb-30"/>
                            <input type="number" name="stock" required="required" placeholder="Please enter the book stock" class="form-control mb-30"/>
                            <input type="submit" name="submit" class="btn btn-outline-info"/>
                        </form>
                        <br/>
                        <h3 style="color:red;"><%
        if (request.getParameter("submit") != null) {
            out.println(msg);
        }
                        %></h3>
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