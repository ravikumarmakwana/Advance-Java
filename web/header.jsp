<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="uza - Model Agency HTML5 Template">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Core Stylesheet -->
    <link rel="stylesheet" href="style.css">

</head>
<body>
    <!-- ***** Top Search Area Start ***** -->
    <div class="top-search-area">
        <!-- Search Modal -->
        <div class="modal fade" id="searchModal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <!-- Close Button -->
                        <button type="button" class="btn close-btn" data-dismiss="modal"><i class="fa fa-times"></i></button>
                        <!-- Form -->
                        <form action="index.html" method="post">
                            <input type="search" name="top-search-bar" class="form-control" placeholder="Search and hit enter...">
                            <button type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ***** Top Search Area End ***** -->

    <!-- ***** Header Area Start ***** -->
    <header class="header-area">
        <!-- Main Header Start -->
        <div class="main-header-area">
            <div class="classy-nav-container breakpoint-off">
                <!-- Classy Menu -->
                <nav class="classy-navbar justify-content-between" id="uzaNav">

                    <!-- Logo -->
                    <h2>Advance Java</h2>
                    <!-- Navbar Toggler -->
                        <div class="classy-navbar-toggler">
                        <span class="navbarToggler"><span></span><span></span><span></span></span>
                    </div>

                    <!-- Menu -->
                    <div class="classy-menu">
                        <!-- Menu Close Button -->
                        <div class="classycloseIcon">
                            <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                        </div>

                        <!-- Nav Start -->
                        <div class="classynav">
                            <ul id="nav">
                                <li><a href="index.jsp">Home</a></li>
                                <li><a href="about.jsp">About</a></li>
                                <li><a href="#">Assignments</a>
                                    <ul class="dropdown">
                                        <li><a href="#">Assignment 1</a>
                                        	<ul class="dropdown">
                                                <li><a href="login.jsp">Login-Controller</a></li>
                                                <li><a href="numberofvisitors.do">Count Visitors</a></li>
                                                <li><a href="numbertable.html">Multiplication Table</a></li>
                                                <li><a href="signup.jsp">Sign Up</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Assignment 2</a>
                                        	<ul class="dropdown">
                                                <li><a href="calculator.jsp">Calculator</a></li>
                                                <li><a href="login2.jsp">Dynamic Login</a></li>
                                                <li><a href="celesiustofahrenheit.jsp">Celesius-Fahrenheit</a></li>
                                                <li><a href="nooftextfield.jsp">Text-Field Generate</a></li>
                                                <li><a href="productlist.jsp">E-Commerce</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Assignment 3</a>
                                        	<ul class="dropdown">
                                                <li><a href="signup.jsp">Sign Up With JDBC</a></li>
                                                <li><a href="product_jdbc.jsp">JDBC Operations</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Assignment 4</a>
                                        	<ul class="dropdown">
                                                <li><a href="productlist.jsp">E-Commerce 2.0</a></li>
                                                </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li><a href="signup.jsp">Sign Up</a></li>
                                <li><a href="login.jsp">Login</a></li>
                                <li><a href="admin.jsp" class="btn btn-outline-info" style="color:black;">Admin</a></li>
                                <li><a><h2 class="btn btn-danger" style="border-radius:100%;">
                                    <%
                                       if (session.getAttribute("login") != null){
                                           out.println(session.getAttribute("login").toString().charAt(0));
                                       }else{
                                        out.println("#");}
                                    %>
                                </h2></a></li>
                            </ul>
                        </div>
                        <!-- Nav End -->
                    </div>
                </nav>
            </div>
        </div>
    </header>
</body>
<!-- ******* All JS Files ******* -->
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
</html>