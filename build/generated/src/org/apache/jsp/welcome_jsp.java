package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/masterpages/my.jsp");
    _jspx_dependants.add("/masterpages/header.jsp");
    _jspx_dependants.add("/masterpages/menu.jsp");
    _jspx_dependants.add("/masterpages/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
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
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid outer\">\n");
      out.write("            <!-- Header div open-->\n");
      out.write("            ");
      out.write(" <div class=\"row header\">\n");
      out.write("                <div class=\"col-sm-3 logo\">\n");
      out.write("                    <img src=\"images/elogo.png\" height=\"100\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 title text-center\"><br>\n");
      out.write("                   <span id=\"spt\"><b><span style=\"color:blue;\">E</span>-<span style=\"color:red;\">S</span><span style=\"color:orange;\">t</span><span style=\"color:blue;\">u</span><span style=\"color:green;\">d</span><span style=\"color:red;\">y </span><span style=\"color:white;opacity: 0.8;\">Zone</span></b>\n");
      out.write("                    </span> <span style=\"font-size:23px;color: white;opacity: 0.55;\"><b>Knowledge @ your doorsteps</b></span>\n");
      out.write("               </div>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("            <!-- Header div close-->\n");
      out.write("            <!-- Menu div open-->\n");
      out.write("            ");
      out.write("   <div class=\"row menu\">\n");
      out.write("                <nav class=\"navbar navbar-default\">\n");
      out.write("                    <div class=\"container-fluid\" style=\"background-color: black;\">\n");
      out.write("                        <!--                         Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a href=\"#\" class=\"navbar-brand\" style=\"color:white;font-weight: bold;\">Menu</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--                         Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav \">\n");
      out.write("                                <li class=\"active\"><a href=\"index.jsp\" style=\"color:black;font-weight: bold;\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                                <li><a href=\"aboutus.jsp\" style=\"color:white;font-weight: bold;\">About us</a></li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                        <li><a href=\"#\">View Record</a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"enquiry.jsp\" style=\"color:white;font-weight: bold;\">Enquiry</a></li>\n");
      out.write("                                <li><a href=\"registration.jsp\" style=\"color:white;font-weight: bold;\">Registration</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\" style=\"color:white;font-weight: bold;\">Login</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div> <!-- /.navbar-collapse -->\n");
      out.write("                    </div> <!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>");
      out.write(" \n");
      out.write("            <!-- Menu div close-->\n");
      out.write("\n");
      out.write("            <!-- Main div open-->\n");
      out.write("            <div class=\"row main\"  style=\"margin-top: -20px;\">\n");
      out.write("                <div class=\"container sec\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p style=\"font-size:30px;color:white;background-color:black;font-family:bold;\"><b><marquee direction=\"right\" behavior=\"alternate\" scrollamount=10>Welcome to E-Study Zone</marquee></b></p>\n");
      out.write("                    </div>\n");
      out.write("                    <center><img src=\"images/gd.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("                        <img src=\"images/st.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("                        <img src=\"images/d.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("                        <img src=\"images/ff.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;<br/>\n");
      out.write("                        <br/><img src=\"images/res.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("                        <img src=\"images/up.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("                        <img src=\"images/att.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("                        <img src=\"images/ml.png\" class=\"img-thumbnail shake-me\" alt=\"Group Discussion\" width=\"250\" height=\"250\" style=\"cursor: pointer;\"/> &nbsp;&nbsp;\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <br/><br/></center>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Main div close-->\n");
      out.write("\n");
      out.write("            <!-- Footer div open-->\n");
      out.write("\n");
      out.write("            ");
      out.write(" <div class=\"row\" style=\"background-color: black;\">\n");
      out.write("                <br/> <center><span style=\"font-size: 25px;font-weight:bold;color: white;\"> &nbsp;&nbsp;&nbsp;&nbsp;Social</span></center>\n");
      out.write("                <section>\n");
      out.write("                    <ul id='services'>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <div class='entypo-facebook' style=\"margin-top: -30px;\"></div>\n");
      out.write("                            <span>Facebook</span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class='entypo-twitter'></div>\n");
      out.write("                            <span>Twitter</span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class='entypo-gplus'></div>\n");
      out.write("                            <span>Google+</span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class='entypo-linkedin'></div>\n");
      out.write("                            <span>LinkedIn</span>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row footer\" style=\"padding-top: 3%;margin-top: -30px;text-align: center;\">\n");
      out.write("                <span style=\"color: white;font-size: 20px;\">Developed by : Vivek Singh , #Mobile : +919140729954<br>Email : vivekmmmut16@gmail.com</span>\n");
      out.write("            </div>");
      out.write(" \n");
      out.write("            <!-- Footer div close-->\n");
      out.write("        </div>\n");
      out.write("\n");
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
