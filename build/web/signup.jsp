<%-- 
    Document   : signup
    Created on : 23-Jan-2020, 17:02:01
    Author     : Ravikumar Makwana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <div class="breadcrumb-area">
            <div class="container h-100">
                <div class="row h-100 align-items-end">
                    <div class="col-12">
                        <div class="breadcumb--con">
                            <h2 class="title">
                                Sign Up
                            </h2>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Sign Up</li>
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

    <!-- ***** Contact Area Start ***** -->
        <section class="uza-contact-area section-padding-80">
            <div class="container">
                <div class="row justify-content-between">
                    <!-- Contact Form -->
                    <div class="col-12 col-lg-12">
                        <div class="uza-contact-form mb-80">
                            <div class="col-lg-6">
                                <form action="signup.do" method="post">
                                    <div class="form-group">
                                        <input type="text" name="username" size="32" class="form-control mb-30" placeholder="Enter the name">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="password" size="32"class="form-control mb-30" placeholder="Enter the password">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="confirmpassword" size="32" class="form-control mb-30" placeholder="Enter the confirm password" required="required"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="number" name="phoneno" size="32" class="form-control mb-30" placeholder="Enter the phone no">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="email" size="32" class="form-control mb-30" placeholder="Enter the email address">
                                    </div>
                                    <div class="form-group">
                                        <select name="semester" class="form-control mb-30">
                                            <option value="">Select Semester</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="8">9</option>
                                            <option value="8">10</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <select name="branch" class="form-control mb-30">
                                            <option value="">Select Branch</option>
                                            <option value="Computer Engineering">Computer Engineering</option>
                                            <option value="Information Technology">Information Technology</option>
                                            <option value="Mechanical Engineering">Mechanical Engineering</option>
                                            <option value="Chemical Engineering">Chemical Engineering</option>
                                            <option value="Electrical Engineering">Electrical Engineering</option>
                                            <option value="Electronics & Communication">Electronics & Communication</option>
                                            <option value="Bio Technology">Bio Technology</option>
                                            <option value="Nano Technology">Nano Technology</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <span><b>Gender:</b></span>
                                        <input type="radio" name="gender" value="male" id="male" /><label for="male">Male</label>&nbsp;&nbsp;&nbsp;
                                        <input type="radio" name="gender" value="femal" id="femal"/><label for="femal">Femal</label>
                                    </div>
                                    <div class="form-group">
                                        <h4><b>Hobbies:</b></h4>
                                        <input type="checkbox" name="hobbies" value="Sports" id="bi1"/>&nbsp;<label for="bi1">Sports</label>&nbsp;&nbsp;
                                        <input type="checkbox" name="hobbies" value="Dancing" id="bi2"/>&nbsp;<label for="bi2">Dancing</label>&nbsp;&nbsp;
                                        <input type="checkbox" name="hobbies" value="Singing" id="bi3"/>&nbsp;<label for="bi3">Singing</label>&nbsp;&nbsp;
                                        <input type="checkbox" name="hobbies" value="Reading" id="bi4"/>&nbsp;<label for="bi4">Reading</label>&nbsp;&nbsp;
                                        <input type="checkbox" name="hobbies" value="Writing" id="bi5"/>&nbsp;<label for="bi5">Writing</label>&nbsp;&nbsp;
                                        <input type="checkbox" name="hobbies" value="Drawing" id="bi6"/>&nbsp;<label for="bi6">Drawing</label>&nbsp;&nbsp;
                                    </div>
                                    <div class="form-group">
                                        <textarea rows="5" cols="32" name="address" class="form-control mb-30" placeholder="Enter the Permanent address in three lines ........"></textarea>
                                    </div>
                                    <input type="submit" value="Sign Up" name="submit" class="btn btn-primary" style="width:100px;">
                                </form>
                            </div>
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