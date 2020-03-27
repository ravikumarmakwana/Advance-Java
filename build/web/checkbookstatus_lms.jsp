<%-- 
    Document   : checkbookstatus_lms
    Created on : 26-Mar-2020, 11:39:50
    Author     : Ravikumar Makwana
--%>
<jsp:include page="dbconnect.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,lib.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<%@include  file="header.jsp" %>
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
                                User Status
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 6</li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="home_lms.jsp">Library Management System</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">User Status</li>
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
        char c = session.getAttribute("lms").toString().charAt(0);
        ResultSet rs;
        if (c == 's') {
            rs = stmt.executeQuery("Select * from Student where student_id='" + (Integer) session.getAttribute("lmsId") + "'");
            rs.next();
            out.println("<h3 style='font-family:monospace;'>");
            out.println("Name:<span style='color:red;'>" + rs.getString("name") + "</span><br/>");
            out.println("Membership No.:<span style='color:red;'>" + rs.getInt("student_id") + "</span><br/>");
            out.println("Branch:<span style='color:red;'>" + rs.getString("branch") + "</span><br/>");
            out.println("Semester:<span style='color:red;'>" + rs.getInt("semester") + "</span><br/>");
            out.println("Book Balance:<span style='color:red;'>" + rs.getInt("book_balance") + "</span><br/>");
            out.println("</h3>");
        } else {
            rs = stmt.executeQuery("Select * from Staff where staff_id='" + (Integer) session.getAttribute("lmsId") + "'");
            rs.next();
            out.println("<h3 style='font-family:monospace;'>");
            out.println("Name:<span style='color:red;'>" + rs.getString("name") + "</span><br/>");
            out.println("Membership No.:<span style='color:red;'>" + rs.getInt("staff_id") + "</span><br/>");
            out.println("Post:<span style='color:red;'>" + rs.getString("post") + "</span><br/>");
            out.println("Book Balance:<span style='color:red;'>" + rs.getInt("book_balance") + "</span><br/>");
            out.println("</h3>");
        }
        rs = stmt.executeQuery("Select * from status where id=" + (Integer) session.getAttribute("lmsId") + " ");
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
<%@include  file="footer.jsp" %>