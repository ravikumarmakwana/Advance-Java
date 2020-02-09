<%-- 
    Document   : nooftextfield
    Created on : 25-Jan-2020, 19:11:02
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                No Of Text-Field
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Assignment 2</li>
                                    <li class="breadcrumb-item active" aria-current="page">No Of Text-Field</li>
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
                <form action="" method="">
            <input type="number" name="no" required="required" placeholder="Enter the number of text field . . ." class="form-control mb-30"/><br/>
            <input type="submit" name="submit" class="btn btn-info btn-block" /><br/><br/>
            <br/>
        </form>
        <%
            if(request.getParameter("submit")!=null)
            {
                int n=Integer.parseInt(request.getParameter("no"));
                for(int i=0;i<n;i++)
                {
                    out.println("<input class='form-control mb-30' type='text' placeholder='Text field "+ (i+1) +" '><br/>");
                }
            }
        %>
            </div>
    </body>
</html>
<%@include file="footer.jsp" %>