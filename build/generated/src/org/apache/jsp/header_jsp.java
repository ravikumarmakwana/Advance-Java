package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
      out.write("\n");
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
      out.write("                                <li class=\"current-item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">Assignments</a>\n");
      out.write("                                    <ul class=\"dropdown\">\n");
      out.write("                                        <li><a href=\"#\">Assignment 1</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"login.jsp\">Practical 1</a></li>\n");
      out.write("                                                <li><a href=\"numberofvisitors.do\">Practical 2</a></li>\n");
      out.write("                                                <li><a href=\"numbertable.html\">Practical 3</a></li>\n");
      out.write("                                                <li><a href=\"signup.jsp\">Practical 4</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 2</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"productlist.jsp\">Practical 1</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Assignment 3</a>\n");
      out.write("                                        \t<ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
      out.write("                                                <li><a href=\"#\">- Dropdown Item</a></li>\n");
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
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Nav End -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- ***** Header Area End ***** -->\n");
      out.write("\n");
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
