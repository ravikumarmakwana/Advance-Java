<%-- 
    Document   : index
    Created on : 15-Jan-2020, 18:44:53
    Author     : Ravikumar Makwana
--%>
<%@include file="usersession.jsp"%>
<%@page contentType="text/html" errorPage="errorpage.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp"%>
<!DOCTYPE html>
   <html lang="en">
       <head>
           <title>Advance Java</title>
       </head>
       <body>
    <!-- ***** Welcome Area Start ***** -->
    <section class="welcome-area">
           <!-- Single Welcome Slide -->
            <div class="single-welcome-slide">
                <!-- Background Curve -->
                <div class="background-curve">
                    <img src="./img/core-img/curve-1.png" alt="">
                </div>
                <!-- Welcome Content -->
                <div class="welcome-content h-100">
                    <div class="container h-100">
                        <div class="row h-100 align-items-center">
                            <!-- Welcome Text -->
                            <div class="col-12 col-md-6">
                                <div class="welcome-text">
                                    <h2>Ravikumar Makwana</h2>
                                    <h3>Enrollment No. 170470107030</h3>
                                </div>
                            </div>
                            <!-- Welcome Thumbnail -->
                            <div class="col-12 col-md-6">
                                <div class="welcome-thumbnail">
                                    <img src="img/main2.jpeg" height="200" style="border-radius: 20% 20% 0px 0px"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </section>
   <!-- ***** Welcome Area End ***** -->

   <section>
       <div class="container col-lg-8" align="justify">
           <h1 style="font-family:monospace;color:teal;">Sitemap of My Website</h1>
           <div class="row">
               <div class="col-lg-3" >
                   <h3>Assignment 1</h3>
               </div>
               <div class="col-lg-5">
                   <a href="login.jsp">Login Controller</a><br>
                   <a href="numberofvisitors.do">Count No of Visitors</a><br>
                   <a href="numbertable.html">Generate Multiplication Table</a><br>
                   <a href="signup.jsp">Sign Up Page</a>
               </div>
           </div>
           <hr style="color:teal;border:2px solid teal;" />
           <div class="row">
               <div class="col-lg-3" >
                   <h3>Assignment 2</h3>
               </div>
               <div class="col-lg-5">
                   <a href="calculator.jsp">Calculator</a><br>
                   <a href="login2.jsp">Dynamic Login Controller</a><br>
                   <a href="celesiustofahrenheit.jsp">Celesius To Fahrenheit Conversion</a><br>
                   <a href="nooftextfield.jsp">No Of Text-Field Generate</a><br/>
                   <a href="productlist.jsp">E-Commerce Web Application</a>
               </div>
           </div>
           <hr style="color:teal;border:2px solid teal;" />
           <div class="row">
               <div class="col-lg-3" >
                   <h3>Assignment 3</h3>
               </div>
               <div class="col-lg-5">
                   <a href="signup.jsp">Sign Up With JDBC</a><br>
                   <a href="product_jdbc.jsp">JDBC Operations</a><br>
              </div>
           </div>
           <hr style="color:teal;border:2px solid teal;" />
           <div class="row">
               <div class="col-lg-3" >
                   <h3>Assignment 4</h3>
               </div>
               <div class="col-lg-5">
                   <a href="productlist.jsp">Advance E-Commerce Web Application</a><br>
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
<%@include file="footer.jsp"%>