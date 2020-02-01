package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class errorpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("   \n");
      out.write("   ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"uza - Model Agency HTML5 Template\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <!-- Core Stylesheet -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- ***** Top Search Area Start ***** -->\r\n");
      out.write("    <div class=\"top-search-area\">\r\n");
      out.write("        <!-- Search Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"searchModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <!-- Close Button -->\r\n");
      out.write("                        <button type=\"button\" class=\"btn close-btn\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("                        <!-- Form -->\r\n");
      out.write("                        <form action=\"index.html\" method=\"post\">\r\n");
      out.write("                            <input type=\"search\" name=\"top-search-bar\" class=\"form-control\" placeholder=\"Search and hit enter...\">\r\n");
      out.write("                            <button type=\"submit\">Search</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ***** Top Search Area End ***** -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ***** Header Area Start ***** -->\r\n");
      out.write("    <header class=\"header-area\">\r\n");
      out.write("        <!-- Main Header Start -->\r\n");
      out.write("        <div class=\"main-header-area\">\r\n");
      out.write("            <div class=\"classy-nav-container breakpoint-off\">\r\n");
      out.write("                <!-- Classy Menu -->\r\n");
      out.write("                <nav class=\"classy-navbar justify-content-between\" id=\"uzaNav\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Logo -->\r\n");
      out.write("                    <h2>Advance Java</h2>\r\n");
      out.write("                    <!-- Navbar Toggler -->\r\n");
      out.write("                        <div class=\"classy-navbar-toggler\">\r\n");
      out.write("                        <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Menu -->\r\n");
      out.write("                    <div class=\"classy-menu\">\r\n");
      out.write("                        <!-- Menu Close Button -->\r\n");
      out.write("                        <div class=\"classycloseIcon\">\r\n");
      out.write("                            <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Start -->\r\n");
      out.write("                        <div class=\"classynav\">\r\n");
      out.write("                            <ul id=\"nav\">\r\n");
      out.write("                                <li class=\"current-item\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Assignments</a>\r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 1</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"login.jsp\">Practical 1</a></li>\r\n");
      out.write("                                                <li><a href=\"numberofvisitors.do\">Practical 2</a></li>\r\n");
      out.write("                                                <li><a href=\"numbertable.html\">Practical 3</a></li>\r\n");
      out.write("                                                <li><a href=\"signup.jsp\">Practical 4</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 2</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"calculator.jsp\">Practical 1</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"productlist.jsp\">Practical 5</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 3</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 4</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 5</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 6</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 7</a>\r\n");
      out.write("                                        \t<ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Assignment 8</a>\r\n");
      out.write("                                            <ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"signup.jsp\">Sign Up</a></li>\r\n");
      out.write("                                <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Nav End -->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- ***** Header Area End ***** -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ******* All JS Files ******* -->\r\n");
      out.write("    <!-- jQuery js -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Popper js -->\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap js -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- All js -->\r\n");
      out.write("    <script src=\"js/uza.bundle.js\"></script>\r\n");
      out.write("    <!-- Active js -->\r\n");
      out.write("    <script src=\"js/default-assets/active.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Error Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"breadcrumb-area\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-end\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"breadcumb--con\">\n");
      out.write("                            <h2 class=\"title\">\n");
      out.write("                                Calculator\n");
      out.write("                            </h2>\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\n");
      out.write("                                <ol class=\"breadcrumb\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Assignment 2</li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Calculator</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("      <h1>Error Ocured ....</h1>\n");
      out.write("      <h3>The Exception is .... ");
      out.print( exception );
      out.write("</h3>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"uza - Model Agency HTML5 Template\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/core-img/favicon.ico\">\r\n");
      out.write("    <!-- Core Stylesheet -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Preloader -->\r\n");
      out.write("    <div id=\"preloader\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"cssload-loader\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- ***** Footer Area Start ***** -->\r\n");
      out.write("    <footer class=\"footer-area section-padding-80-0\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-between\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Footer Widget -->\r\n");
      out.write("                <div class=\"col-12 col-sm-6 col-lg-3\">\r\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\r\n");
      out.write("                        <!-- Widget Title -->\r\n");
      out.write("                        <h4 class=\"widget-title\">Contact Us</h4>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Footer Content -->\r\n");
      out.write("                        <div class=\"footer-content mb-15\">\r\n");
      out.write("                            <h3>63545 08988</h3>\r\n");
      out.write("                            <p>18ravi2000@gmail.com</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Footer Widget -->\r\n");
      out.write("                <div class=\"col-12 col-sm-6 col-lg-3\">\r\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\r\n");
      out.write("                        <!-- Widget Title -->\r\n");
      out.write("                        <h4 class=\"widget-title\">Quick Link</h4>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav -->\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <ul class=\"our-link\">\r\n");
      out.write("                                <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                                <li><a href=\"login.jsp\">Contact Us</a></li>\r\n");
      out.write("                                <li><a href=\"signup.jsp\">Forum Registeration</a></li>      \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Footer Widget -->\r\n");
      out.write("                <div class=\"col-12 col-sm-6 col-lg-3\">\r\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\r\n");
      out.write("                        <!-- Widget Title -->\r\n");
      out.write("                        <h4 class=\"widget-title\">About Us</h4>\r\n");
      out.write("                        <p>This website contains my advance java assignments.</p>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Copywrite Text -->\r\n");
      out.write("                        <div class=\"copywrite-text mb-30\">\r\n");
      out.write("                            <p>&copy; Copyright 2020 <a href=\"#\">Ravikumar</a>.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"row\" style=\"margin-bottom: 30px;\">\r\n");
      out.write("                \r\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This Website is made with by Ravikumar Makwana</a>\r\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ***** Footer Area End ***** -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ******* All JS Files ******* -->\r\n");
      out.write("    <!-- jQuery js -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Popper js -->\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap js -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- All js -->\r\n");
      out.write("    <script src=\"js/uza.bundle.js\"></script>\r\n");
      out.write("    <!-- Active js -->\r\n");
      out.write("    <script src=\"js/default-assets/active.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
