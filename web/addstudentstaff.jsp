<%-- 
    Document   : addstudentstaff
    Created on : 26-Mar-2020, 13:25:32
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
        <title>Add New Staffs/New Students</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Add New Staff / New Studnet
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page"><a href="admin.jsp">Admin</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Add New Staff/ New Student</li>
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

        <section class="uza-contact-area section-padding-80">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <h3>Add New Student</h3>
                        <%
        Connection con = (Connection) application.getAttribute("con");
        Statement stmt = con.createStatement();
        String msg1 = "", msg2 = "";
        if (request.getParameter("student") != null) {
            int id = Integer.parseInt(request.getParameter("student_id"));
            String name = request.getParameter("name");
            int semester = Integer.parseInt(request.getParameter("semester"));
            String branch = request.getParameter("branch");
            int r = stmt.executeUpdate("Insert into Student values ('" + id + "','" + name + "','" + semester + "','" + branch + "','" + 0 + "')");
            if (r != 0) {
                msg1 = "New Student Added Successfully.";
            }
        }
                        %>
                        <form action="" method="post">
                            <input type="number" name="student_id" placeholder="Please enter student_id above 1000 ..." class="form-control"/><br/>
                            <input type="text" name="name" placeholder="Please enter the name" required="required" class="form-control"/><br/>
                            <select name="semester" class="form-control">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                            </select><br/>
                            <input type="text" name="branch" class="form-control" placeholder="Please enter the branch"/><br/>
                            <input type="submit" name="student" value="Add-User" class="btn btn-outline-success"/>
                        </form>
                        <br/>
                        <%
        out.println("<h3 style='color:red;'>" + msg1 + "</h3>");
                        %>
                        <br/>
                    </div>
                    <%

        if (request.getParameter("staff") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String post = request.getParameter("post");
            int r = stmt.executeUpdate("Insert into staff (staff_id,name,post,book_balance) values ('" + id + "','" + name + "','" + post + "','" + 0 + "')");
            if (r != 0) {
                msg2 = "New Staff added Successfully.";
            }
        }
                    %>
                    <div class="col-lg-4"></div>
                    <div class="col-lg-4">
                        <h3>Add New Staff</h3>
                        <form action="" method="post">
                            <input type="number" name="id" placeholder="Please enter the Staff id" class="form-control"/>
                            <br/>
                            <input type="text" name="name" placeholder="Please enter the staff name" class="form-control"/><br/>
                            <input type="text" name="post" placeholder="Please enter the post of staff" class="form-control"/><br/>
                            <input type="submit" name="staff" value="Add-User" class="btn btn-outline-success"/>
                        </form>
                        <br/>
                        <%
        out.println("<h3 style='color:red;'>" + msg2 + "</h3>");
                        %>
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
