package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"errorpage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"uza - Model Agency HTML5 Template\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- Core Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- ***** Top Search Area Start ***** -->\n");
      out.write("    <div class=\"top-search-area\">\n");
      out.write("        <!-- Search Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"searchModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <!-- Close Button -->\n");
      out.write("                        <button type=\"button\" class=\"btn close-btn\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                        <!-- Form -->\n");
      out.write("                        <form action=\"index.html\" method=\"post\">\n");
      out.write("                            <input type=\"search\" name=\"top-search-bar\" class=\"form-control\" placeholder=\"Search and hit enter...\">\n");
      out.write("                            <button type=\"submit\">Search</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ***** Top Search Area End ***** -->\n");
      out.write("\n");
      out.write("    <!-- ***** Header Area Start ***** -->\n");
      out.write("    <header class=\"header-area\">\n");
      out.write("        <!-- Main Header Start -->\n");
      out.write("        <div class=\"main-header-area\">\n");
      out.write("            <div class=\"classy-nav-container breakpoint-off\">\n");
      out.write("                <!-- Classy Menu -->\n");
      out.write("                <nav class=\"classy-navbar justify-content-between\" id=\"uzaNav\">\n");
      out.write("\n");
      out.write("                    <!-- Logo -->\n");
      out.write("                    <h2>Advance Java</h2>\n");
      out.write("                    <!-- Navbar Toggler -->\n");
      out.write("                        <div class=\"classy-navbar-toggler\">\n");
      out.write("                        <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Menu -->\n");
      out.write("                    <div class=\"classy-menu\">\n");
      out.write("                        <!-- Menu Close Button -->\n");
      out.write("                        <div class=\"classycloseIcon\">\n");
      out.write("                            <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Nav Start -->\n");
      out.write("                        <div class=\"classynav\">\n");
      out.write("                            <ul id=\"nav\">\n");
      out.write("                                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">Assignments</a>\n");
      out.write("                                    <ul class=\"dropdown\">\n");
      out.write("                                        <li><a href=\"#\">Assignment 1</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"login.jsp\">Login-Controller</a></li>\n");
      out.write("                                                <li><a href=\"numberofvisitors.do\">Count Visitors</a></li>\n");
      out.write("                                                <li><a href=\"numbertable.html\">Multiplication Table</a></li>\n");
      out.write("                                                <li><a href=\"signup.jsp\">Sign Up</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 2</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"calculator.jsp\">Calculator</a></li>\n");
      out.write("                                                <li><a href=\"login2.jsp\">Dynamic Login</a></li>\n");
      out.write("                                                <li><a href=\"celesiustofahrenheit.jsp\">Celesius-Fahrenheit</a></li>\n");
      out.write("                                                <li><a href=\"nooftextfield.jsp\">Text-Field Generate</a></li>\n");
      out.write("                                                <li><a href=\"productlist.jsp\">E-Commerce</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 3</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"signup.jsp\">Sign Up With JDBC</a></li>\n");
      out.write("                                                <li><a href=\"product_jdbc.jsp\">JDBC Operations</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 4</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 5</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 6</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 7</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 8</a>\n");
      out.write("                                            <ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"signup.jsp\">Sign Up</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                                <li><a href=\"admin.jsp\" class=\"btn btn-outline-info\" style=\"color:black;\">Admin</a></li>\n");
      out.write("                                <li><a><h2 class=\"btn btn-danger\" style=\"border-radius:100%;\">\n");
      out.write("                                    ");

                                       if (session.getAttribute("login") != null){
                                           out.println(session.getAttribute("login").toString().charAt(0));
                                       }else{
                                        out.println("#");}
                                    
      out.write("\n");
      out.write("                                </h2></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Nav End -->\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("</body>\n");
      out.write("<!-- ******* All JS Files ******* -->\n");
      out.write("    <!-- jQuery js -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- All js -->\n");
      out.write("    <script src=\"js/uza.bundle.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/default-assets/active.js\"></script>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Display Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"breadcrumb-area\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-end\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"breadcumb--con\">\n");
      out.write("                            <h2 class=\"title\">\n");
      out.write("                                Display Data\n");
      out.write("                            </h2>\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\n");
      out.write("                                <ol class=\"breadcrumb\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Assignment 3</li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\"><a href=\"product_jdbc.jsp\">JDBC Operations</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Display Data</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Background Curve -->\n");
      out.write("            <div class=\"breadcrumb-bg-curve\">\n");
      out.write("                <img src=\"./img/core-img/curve-1.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ***** Breadcrumb Area End ***** -->\n");
      out.write("        <!-- ***** Contact Area Start ***** -->\n");
      out.write("\n");
      out.write("        <section class=\"uza-contact-area section-padding-80\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Sr. no</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Product Description</th>\n");
      out.write("                <th>Stock</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dbconnect.jsp", out, false);
      out.write("\n");
      out.write("        ");

        String msg="";
        Connection con=(Connection)application.getAttribute("con");
        Statement stmt=con.createStatement();
        
      out.write("\n");
      out.write("        ");

        if(request.getParameter("pid")!=null)
        {
            int pid=Integer.parseInt(request.getParameter("pid"));
            int row=stmt.executeUpdate("delete from products_jdbc where pid='"+pid+"'");
            msg=row+" Items are Deleted ";
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

        int c=1;
        ResultSet rs=stmt.executeQuery("Select * from products_jdbc");
        while(rs.next())
        {
        
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( c++);
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getFloat(5));
      out.write("</td>\n");
      out.write("                <td><a href=\"update.jsp?pid=");
      out.print(rs.getInt(1));
      out.write("\" class=\"btn btn-info\">Update</a></td>\n");
      out.write("                <td><a href=\"display.jsp?pid=");
      out.print(rs.getInt(1));
      out.write("\" class=\"btn btn-info\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <p style=\"font-size:30px;\" >");
      out.print( msg);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- jQuery js -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- All js -->\n");
      out.write("    <script src=\"js/uza.bundle.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/default-assets/active.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"uza - Model Agency HTML5 Template\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"icon\" href=\"./img/core-img/favicon.ico\">\n");
      out.write("    <!-- Core Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"cssload-loader\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ***** Footer Area Start ***** -->\n");
      out.write("    <footer class=\"footer-area section-padding-80-0\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-between\">\n");
      out.write("\n");
      out.write("                <!-- Single Footer Widget -->\n");
      out.write("                <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\n");
      out.write("                        <!-- Widget Title -->\n");
      out.write("                        <h4 class=\"widget-title\">Contact Us</h4>\n");
      out.write("\n");
      out.write("                        <!-- Footer Content -->\n");
      out.write("                        <div class=\"footer-content mb-15\">\n");
      out.write("                            <h3>63545 08988</h3>\n");
      out.write("                            <p>18ravi2000@gmail.com</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Single Footer Widget -->\n");
      out.write("                <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\n");
      out.write("                        <!-- Widget Title -->\n");
      out.write("                        <h4 class=\"widget-title\">Quick Link</h4>\n");
      out.write("\n");
      out.write("                        <!-- Nav -->\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"our-link\">\n");
      out.write("                                <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\">Contact Us</a></li>\n");
      out.write("                                <li><a href=\"signup.jsp\">Forum Registeration</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Single Footer Widget -->\n");
      out.write("                <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\n");
      out.write("                        <!-- Widget Title -->\n");
      out.write("                        <h4 class=\"widget-title\">About Us</h4>\n");
      out.write("                        <p>This website contains my advance java assignments.</p>\n");
      out.write("\n");
      out.write("                        <!-- Copywrite Text -->\n");
      out.write("                        <div class=\"copywrite-text mb-30\">\n");
      out.write("                            <p>&copy; Copyright 2020 <a href=\"#\">Ravikumar</a>.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write(" <div class=\"row\" style=\"margin-bottom: 30px;\">\n");
      out.write("\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This Website is made with by Ravikumar Makwana</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- ***** Footer Area End ***** -->\n");
      out.write("\n");
      out.write("    <!-- ******* All JS Files ******* -->\n");
      out.write("    <!-- jQuery js -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- All js -->\n");
      out.write("    <script src=\"js/uza.bundle.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/default-assets/active.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
