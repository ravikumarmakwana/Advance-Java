<%-- 
    Document   : issuebook
    Created on : 20-Mar-2020, 21:56:59
    Author     : Ravikumar Makwana
--%>

<%@include file="header.jsp" %>
<jsp:include page="dbconnect.jsp" />
<%@page contentType="text/html" import="java.sql.*" errorPage="errorpage.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Library Management System</title>
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
                                    <li class="breadcrumb-item active" aria-current="page"><a href="lms.jsp">Library Management System</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Issue Book</li>
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

                <div class="row">
                    <div class="col-lg-4">
                        <form action="" method="post">
                            <h2>Search By...</h2>
                            <select name="searchby" class="form-control mb-30">
                                <option value="title">Title</option>
                                <option value="author">Author</option>
                            </select>
                            <input type="text" name="search" placeholder="Enter the value. . ." class="form-control mb-30"/>
                            <input type="submit" name="submit" class="btn btn-outline-info btn-block"/>
                        </form>
                    </div>
                    <div class="col-lg-8">
                        <div class="row">

<%
Connection con=(Connection)application.getAttribute("con");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from books");
while(rs.next())
{int id=rs.getInt("id");
String title=rs.getString("title");
String author=rs.getString("author");
int stock=rs.getInt("stock");%>

                    <div class="col-12 col-lg-4">
                        <div class="single-blog-post bg-img mb-80">
                        <div class="post-content" align="left">
                        <div>
                        <p><b>Title:</b><%= title %></p>
                        <p><b>Author:</b><%=author%></p>
                                <p><b>Stock:</b><%=stock%></p>
                                <form action="" method="post">
                                    <input type="hidden" value="<%=id%>" name="id"/>
                                    <input type="submit" class="btn btn-primary" value="Add To Cart" name="addtocart"/>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                
<%
}
%>
                        </div>
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