package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/masterpages/my.jsp");
    _jspx_dependants.add("/masterpages/header.jsp");
    _jspx_dependants.add("/masterpages/slider.jsp");
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
      out.write("       ");
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
      out.write("       <style>\n");
      out.write("           .sec{\n");
      out.write("               background-color: white;\n");
      out.write("               opacity: 1;\n");
      out.write("           }\n");
      out.write("            p{\n");
      out.write("                color: #000033;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("       </style>\n");
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
      out.write("\n");
      out.write("            <!-- Slider div open-->\n");
      out.write("            ");
      out.write(" <div class=\"row slider\">\n");
      out.write("                <div class=\"col-sm-12\" style=\"margin: 0px;padding: 0px;\">\n");
      out.write("                    <!--                    Open for Slider div-->\n");
      out.write("                    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                        <!--                         Indicators -->\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                        <!--                         Wrapper for slides -->\n");
      out.write("                        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <img src=\"slider/spic1.jpg\" alt=\"Chania\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img  src=\"slider/spic2.jpg\" alt=\"Chania\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"slider/spic3.jpg\" alt=\"Flower\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"slider/spic4.jpg\" alt=\"Flower\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"slider/slpic5.png\" alt=\"Flower\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"slider/slpic6.png\" alt=\"Flower\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"slider/spic7.png\" alt=\"Flower\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--                         Left and right controls -->\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                            <span class=\"sr-only\">Next</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!--                    Close for Slider div-->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>");
      out.write(" \n");
      out.write("            <!-- Slider div close-->\n");
      out.write("\n");
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
      out.write("                                <li class=\"active\"><a href=\"index.jsp\" style=\"color:black;font-weight: bold;\"><span class=\"glyphicon glyphicon-home\" style=\"\"></span> &nbsp;&nbsp;Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                                <li><a href=\"aboutus.jsp\" style=\"color:white;font-weight: bold;\"><span class=\"glyphicon glyphicon-info-sign\" style=\"\"></span> &nbsp;&nbsp;About us</a></li>\n");
      out.write("                               \n");
      out.write("                                <li><a href=\"enquiry.jsp\" style=\"color:white;font-weight: bold;\"><span class=\"glyphicon glyphicon-pencil\" style=\"\"></span> &nbsp;&nbsp;Enquiry</a></li>\n");
      out.write("                                <li><a href=\"registration.jsp\" style=\"color:white;font-weight: bold;\"><span class=\"glyphicon glyphicon-registration-mark\" style=\"\"></span> &nbsp;&nbsp;Registration</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\" style=\"color:white;font-weight: bold;\"><span class=\"glyphicon glyphicon-log-in\" style=\"\"></span> &nbsp;&nbsp;Login</a></li>\n");
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
      out.write("            <div class=\"row main\"  style=\"margin-top: -20px;opacity: 1;background-position: relative;background-attachment: fixed;\">\n");
      out.write("                <div class=\"container sec img-responsive\" style=\"background-image: url(images/header.jpg);\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p style=\"font-size:30px;color:white;background-color:black;font-family:bold;\"><b><marquee direction=\"right\" behavior=\"alternate\" scrollamount=10>Welcome to E-Study Zone</marquee></b></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\" style=\"margin-top: -10px;background-size: contain;background-image: url(images/gd_1.png);height: 400px;\">\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\" style=\"background-color: #00ffcc;margin-top: -10px;\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                   <h2 style=\"color: #000033;font-family:Bodoni MT Black;\">We've got what you need!</h2>\n");
      out.write("                    <hr class=\"light\">\n");
      out.write("                    <p class=\"text-faded\"><b style=\"color: white;text-shadow: 2px 2px 2px black;font-size: 18px;\">E-Study has everything you need to get your study up and running in no time! All of the videos and notes on E-Study are open source, free to download, and easy to use. No strings attached!The primary mission of the E-Study Zone is to support faculty in the design, development, and delivery of online and campus-based instruction involving academic technology.</b></p>\n");
      out.write("                    <a href=\"registration.jsp\" class=\"page-scroll btn btn-success btn-xl sr-button\" style=\"box-shadow: 3px 3px 3px black;color: white;font-family: bold;text-shadow: 2px 2px 2px black;\"><b>Get Started!</b></a><br/>\n");
      out.write("                <br/></div>\n");
      out.write("            </div>\n");
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
      out.write("                            <a href=\"https://www.facebook.com/\" target=\"blank\"> <div class='entypo-facebook' style=\"margin-top: -30px;\"></div></a>\n");
      out.write("                            <span>Facebook</span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"https://twitter.com/\" target=\"blank\"><div class='entypo-twitter'></div></a>\n");
      out.write("                            <span>Twitter</span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"https://www.google.co.in/?gfe_rd=cr&ei=zvNbWbz0H-zs8AeFtqHIDw&gws_rd=ssl\" target=\"blank\"><div class='entypo-gplus'></div></a>\n");
      out.write("                            <span>Google+</span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"https://www.linkedin.com/\" target=\"blank\"> <div class='entypo-linkedin'></div></a>\n");
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
