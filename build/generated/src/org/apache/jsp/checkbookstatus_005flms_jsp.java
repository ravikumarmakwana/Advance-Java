package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import lib.*;

public final class checkbookstatus_005flms_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dbconnect.jsp", out, false);
      out.write("\n");
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
      out.write("                                User Status\n");
      out.write("                            </h2>\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\n");
      out.write("                                <ol class=\"breadcrumb\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Assignment 6</li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\"><a href=\"home_lms.jsp\">Library Management System</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">User Status</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Background Curve -->\n");
      out.write("            <div class=\"breadcrumb-bg-curve\">\n");
      out.write("                <img src=\"./img/core-img/curve-5.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ***** Breadcrumb Area End ***** -->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

        Connection con = (Connection) application.getAttribute("con");
        Statement stmt = con.createStatement();
        char c=session.getAttribute("lms").toString().charAt(0);
        ResultSet rs;
        if(c=='s')
        {
            rs=stmt.executeQuery("Select * from Student where student_id='"+(Integer)session.getAttribute("lmsId")+"'");
            rs.next();
            out.println("<h3>");
            out.println("Name:<span style='color:teal;'>"+rs.getString("name")+"</span>");
            out.println("Membership No.:<span style='color:teal;'>"+rs.getInt("student_id")+"</span>");
            out.println("Branch:<span style='color:teal;'>"+rs.getString("branch")+"</span>");
            out.println("Semester:<span style='color:teal;'>"+rs.getInt("semester")+"</span>");
            out.println("Book Balance:<span style='color:teal;'>"+rs.getInt("book_balance")+"</span>");
            out.println("</h3>");
        }
        else
        {
            rs=stmt.executeQuery("Select * from Staff where staff_id='"+(Integer)session.getAttribute("lmsId")+"'");
            rs.next();
            out.println("<h3>");
            out.println("Name:<span style='color:teal;'>"+rs.getString("name")+"</span>");
            out.println("Membership No.:<span style='color:teal;'>"+rs.getInt("staff_id")+"</span>");
            out.println("Post:<span style='color:teal;'>"+rs.getString("post")+"</span>");
            out.println("Book Balance:<span style='color:teal;'>"+rs.getInt("book_balance")+"</span>");
            out.println("</h3>");
        }
        rs = stmt.executeQuery("Select * from status where id=" + (Integer) session.getAttribute("lmsId") + " ");
        
      out.write("\n");
      out.write("            <table class=\"table\" border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>ISBN No.</th>\n");
      out.write("                    <th>Title</th>\n");
      out.write("                    <th>Author</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("book_id") + "</td>");
            out.println("<td>" + rs.getString("title") + "</td>");
            out.println("<td>" + rs.getString("author") + "</td>");
            out.println("</tr>");
        }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
