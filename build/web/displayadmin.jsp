<%-- 
    Document   : displayadmin
    Created on : 23-Feb-2020, 12:44:29
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
        <title>Display Data</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Display Data
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="admin.jsp">Admin</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Display Data</li>
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
         <style>
             td{
                 text-align:center;
                 vertical-align:center;
             }
         </style>
        <table class="table">
            <tr>
                <th>Sr. no</th>
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Stock</th>
                <th>Price</th>
                <th>Products</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
        <jsp:include page="dbconnect.jsp"/>
        <%
        Connection con=(Connection)application.getAttribute("con");
        Statement stmt=con.createStatement();
        %>
        <%
        if(request.getParameter("pid")!=null)
        {
            int pid=Integer.parseInt(request.getParameter("pid"));
            int row=stmt.executeUpdate("delete from products where pid='"+pid+"'");
            out.println("<script>");
            out.println("alert('"+row+" are Deleted .')");
            out.println("</script>");
        }
        %>

        <%
        int c=1;
        ResultSet rs=stmt.executeQuery("Select * from products");
        while(rs.next())
        {
            String img="img/"+rs.getString(6);
        %>
            <tr>
                <td><%= c++%></td>
                <td><%= rs.getString(2)%></td>
                <td><%= rs.getString(3)%></td>
                <td><%= rs.getInt(4)%></td>
                <td><%= rs.getFloat(5)%></td>
                <td><img src="<%= img %>" width="300px" /></td>
                <td><a href="updateadmin.jsp?pid=<%=rs.getInt(1)%>" class="btn btn-info">Update</a></td>
                <td><a href="displayadmin.jsp?pid=<%=rs.getInt(1)%>" class="btn btn-info">Delete</a></td>
            </tr>
        <%
        }
        %>
        </table>
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