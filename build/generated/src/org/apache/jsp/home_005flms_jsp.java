package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_005flms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

    if(session.getAttribute("lms")==null)
        response.sendRedirect("login_lms.jsp");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"uza - Model Agency HTML5 Template\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Title -->\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"./img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Core Stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"breadcrumb-area\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-end\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"breadcumb--con\">\n");
      out.write("                            <h2 class=\"title\">\n");
      out.write("                                Library Management System\n");
      out.write("                            </h2>\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\n");
      out.write("                                <ol class=\"breadcrumb\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Assignment 6</li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Library Management System</li>\n");
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
      out.write("\n");
      out.write("       <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("\n");
      out.write("                <!-- About Thumbnail -->\n");
      out.write("                <div class=\"col-12 col-md-6\">\n");
      out.write("                    <div class=\"about-us-thumbnail mb-80\">\n");
      out.write("                        <img src=\"img/core-img/quote.png\" style=\"height:50px;width:50px;\"/>\n");
      out.write("                        <h1 style=\"font-family:monospace;color:teal;\">Library are Sacred Time Machine Where Knowledge flow and Magic is eternal.\n");
      out.write("                        </h1>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- About Us Content -->\n");
      out.write("                <div class=\"col-12 col-md-6\">\n");
      out.write("                    <div class=\"about-us-content mb-80\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h2>Our Services</h2>\n");
      out.write("                            <a href=\"issuebook_lms.jsp\" class=\"btn btn-outline-danger\">Issue Book</a><br/><br/>\n");
      out.write("                            <a href=\"returnbook_lms.jsp\" class=\"btn btn-outline-danger\">Return Book</a><br/><br/>\n");
      out.write("                            <a href=\"checkbookstatus_lms.jsp\" class=\"btn btn-outline-danger\">Check Book Status</a><br/><br/>\n");
      out.write("                            <a href=\"\" class=\"btn btn-outline-danger\">Suggestion</a><br/><br/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <!-- jQuery js -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Popper js -->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap js -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- All js -->\n");
      out.write("        <script src=\"js/uza.bundle.js\"></script>\n");
      out.write("        <!-- Active js -->\n");
      out.write("        <script src=\"js/default-assets/active.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
