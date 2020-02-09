package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
