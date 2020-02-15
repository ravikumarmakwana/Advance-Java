<%-- 
    Document   : celesiustofahrenheit
    Created on : 25-Jan-2020, 18:36:19
    Author     : Ravikumar Makwana
--%>
<%!    double f;
%>
<%
        String conversion = "";
        if (request.getParameter("convert") != null) {
            double c = Double.parseDouble(request.getParameter("c"));
            f = (c * (9 / 5)) + 32;

            conversion = "Celcius " + c + " convert into fahrenheit " + f + "<br/>";
            if (application.getAttribute("history") != null) {
                conversion += application.getAttribute("history");
            }
            application.setAttribute("history", conversion);
            out.println(conversion);
            response.sendRedirect("celesiustofahrenheit.jsp");
        }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include  file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Celesius To Fahrenheit</title>
    </head>
    <body>

        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Celesius To Fahrenheit
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 2</li>
                                    <li class="breadcrumb-item active" aria-current="page">Celesius To Fahrenheit</li>
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
             <div class="col-12 col-lg-4">
            <form action="" method="get">
            <input type="number" name="c" placeholder="enter the temperature in celcius " class="form-control mb-30" required="required">
            <input type="submit" value="Convert" name="convert" class="btn uza-btn btn-2"/><br/><br/><br/>
            <input type="number" disabled="disabled" name="f" value=<%= f%> class="form-control mb-30"><br/>
            </form>
            <%
        if (application.getAttribute("history") != null) {
            out.println(application.getAttribute("history").toString());
        }
        %>
        </div>
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