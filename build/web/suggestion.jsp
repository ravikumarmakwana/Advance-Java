<%-- 
    Document   : suggestion
    Created on : 26-Mar-2020, 12:27:44
    Author     : Ravikumar Makwana
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<jsp:include page="dbconnect.jsp"/>
<%@include file="header.jsp" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="uza - Model Agency HTML5 Template">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Title -->
        <title>Library Management System</title>

        <!-- Favicon -->
        <link rel="icon" href="./img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Suggestion
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 6</li>
                                    <li class="breadcrumb-item active" aria-current="page">Suggestion</li>
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
        <%
        String msg = "";
        if (request.getParameter("submit") != null) {
            Connection con = (Connection) application.getAttribute("con");
            Statement stmt = con.createStatement();
            String sugg = request.getParameter("sug");
            int r = stmt.executeUpdate("Insert into suggestion (msg) values ('" + sugg + "')");
            if (r != 0) {
                msg = "Thanking for Suggestion ! ! !";
            }
        }
        %>
        <div class="container">
            <h3>Please Write Your Experience And Suggestion . . . </h3>
            <form method="post">
                <textarea class="form-control col-lg-4" name="sug" rows="5" placeholder="Please enter the Experience and Suggestion . . ."></textarea><br/>
                <input type="submit" name="submit" class="btn btn-outline-danger"/>
            </form>
            <br/>
            <%
        out.println("<h3 style:'color:red;'>" + msg + "</h3>");
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