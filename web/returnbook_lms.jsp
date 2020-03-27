<%-- 
    Document   : returnbook_lms
    Created on : 25-Mar-2020, 22:03:11
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,lib.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<%
        String msg = "";
        if (request.getParameter("submit") != null) {
            int isbnno = Integer.parseInt(request.getParameter("isbnno"));
            char c = session.getAttribute("lms").toString().charAt(0);
            msg = DAO.returnBook(isbnno, c);
        }%>
<%@include file="header.jsp"  %>
<jsp:include page="dbconnect.jsp"/>
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
                                Return Book
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 6</li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="home_lms.jsp">Library Management System</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Return Book</li>
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
            <%
        Connection con = (Connection) application.getAttribute("con");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from status where id=" + (Integer) session.getAttribute("lmsId") + " ");
            %>
            <table class="table" border="1">
                <tr>
                    <th>ISBN No.</th>
                    <th>Title</th>
                    <th>Author</th>
                </tr>
                <%
        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("book_id") + "</td>");
            out.println("<td>" + rs.getString("title") + "</td>");
            out.println("<td>" + rs.getString("author") + "</td>");
            out.println("</tr>");
        }
                %>
            </table>
            <br/><br/>
            <form action="" method="post">
                <input type="number" name="isbnno" class="form-control col-lg-4" placeholder="Please enter the Isbn No."/>
                <br/>
                <input type="submit" name="submit" class="btn btn-outline-primary col-2"/>
            </form>
            <%
        out.println("<h3 style='color:red;'>" + msg + "</h3>");
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