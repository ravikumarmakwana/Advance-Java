<%-- 
    Document   : issuebook_lms
    Created on : 25-Mar-2020, 15:04:02
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" import="java.sql.*,lib.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="dbconnect.jsp"/>
<%@include file="header.jsp" %>
<!DOCTYPE html>
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
                                Issue Book
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 6</li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="home_lms.jsp">Library Management System</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Issue Book</li>
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
            <h3>Search Book..</h3>
            <div>
                <form action="" method="post">
                    <select name="searchby" class="form-control col-lg-4">
                        <option value="author">Author</option>
                        <option value="title">Book Title</option>
                    </select>
                    <br/>
                    <input type="text" name="searchvalue" class="form-control col-lg-4" placeholder="Enter the seaech keyword"/>
                    <br/>
                    <input type="submit" name="search" class="btn btn-outline-success"/>
                </form>
                <br/>
            </div>
            <%
        if (request.getParameter("search") != null) {
            String col = request.getParameter("searchby");
            String value = request.getParameter("searchvalue");
            Connection con = (Connection) application.getAttribute("con");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from books where " + col + " like '%" + value + "%'");
            %>

            <table class="table" border="1">
                <tr>
                    <th>Isbn No</th>
                    <th>Title of Book</th>
                    <th>Author Of Book</th>
                    <th>Stock</th>
                </tr>
                <%
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("isbn_no") + "</td>");
                    out.println("<td>" + rs.getString("title") + "</td>");
                    out.println("<td>" + rs.getString("author") + "</td>");
                    out.println("<td>" + rs.getInt("stock") + "<br/>" + "</td>");
                    out.println("</tr>");
                }
                %>
            </table>
            <%
        }
            %>
            <h3>Issue Book . . .</h3>
            <form action="" method="post">
                <input type="number" name="isbnno" class="form-control col-lg-4" placeholder="Please enter the ISBN No."/><br/>
                <input type="submit" name="submit" class="btn btn-outline-info"/><br/>
            </form>
            <%
        if (request.getParameter("submit") != null) {
            int isbnno = Integer.parseInt(request.getParameter("isbnno"));
            String msg = DAO.issueBook(isbnno, session.getAttribute("lms").toString().charAt(0));
            out.println("<br/>");
            out.println("<h3 style='color:red;'>" + msg + "</h3>");
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