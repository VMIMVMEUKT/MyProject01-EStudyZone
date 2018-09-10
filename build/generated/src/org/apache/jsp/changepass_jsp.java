package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/masterpages/my.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("  <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/quake.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            [class*=\"entypo-\"]:before {\n");
      out.write("                font-family: 'entypo', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("           \n");
      out.write("        </style>");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(studentzone/studentimages/bg.jpg);background-repeat: no-repeat;background-size: cover;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\" style=\"margin-top: 15%;\">\n");
      out.write("            <form action=\"generalcode/chanagepasscode.jsp\" method=\"post\">\n");
      out.write("                <span style=\"font-size: 22px;font-family: bold;color: #99ff33;margin-top: 15%;\">Enter New Password </span><input type=\"password\" name=\"pass\" class=\"form-control btn-lg\"/><br>\n");
      out.write("                <span style=\"font-size: 22px;font-family: bold;color: #99ff33;\"> Confirm Password </span> <input type=\"password\" name=\"cpass\" class=\"form-control btn-lg\" style=\"margin-top: 1%;\"/><br>\n");
      out.write("                <input type=\"submit\" value=\"Change Password\" class=\"form-control btn-success btn-lg\" style=\"margin-top: 1%;height: 40px;font-size: 20px;font-family: bold;color: black;\"/>\n");
      out.write("                <a href=\"login.jsp\"><span style=\"font-size: 20px;font-family: bold;color: #99ff33;\">Goto login page</span></a>\n");
      out.write("            </form>\n");
      out.write("                 </div>\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
