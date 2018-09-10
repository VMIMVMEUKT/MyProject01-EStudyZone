package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DBManager;

public final class viewlogininfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminzone/admin_masterpages/headermenu.jsp");
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
      response.setContentType("text/html");
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
      out.write("\n");

if(session.getAttribute("aid")==null)
{
response.sendRedirect("../login.jsp");
}
else
{

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            [class*=\"entypo-\"]:before {\n");
      out.write("                font-family: 'entypo', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            p{\n");
      out.write("                color: #000033;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\".del\").click(function() {\n");
      out.write("\n");
      out.write("                    var id = $(this).parent().parent().children().find(\".mid\").text();\n");
      out.write("                    var status = confirm(\"You want to delete this Record?\")\n");
      out.write("                    if (status == true)\n");
      out.write("                    {\n");
      out.write("                        window.location.href = \"admin_code/delregcode.jsp?rid=\" + id;\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid outer\">\n");
      out.write("            ");
      out.write("<!-- Header div open-->\n");
      out.write("            <div class=\"row header\">\n");
      out.write("                <div class=\"col-sm-3 logo\">\n");
      out.write("                    <img src=\"../images/elogo.png\" height=\"100\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 title text-center\"><br>\n");
      out.write("                    <span id=\"spt\"><b><span style=\"color:blue;\">E</span>-<span style=\"color:red;\">S</span><span style=\"color:orange;\">t</span><span style=\"color:blue;\">u</span><span style=\"color:green;\">d</span><span style=\"color:red;\">y </span><span style=\"color:white;opacity: 0.8;\">Zone</span></b>\n");
      out.write("                    </span> <span style=\"font-size:23px;color: white;opacity: 0.55;\"><b>Knowledge @ your doorsteps</b></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Header div close-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Menu div open-->\n");
      out.write("            <div class=\"row menu\">\n");
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
      out.write("                                <li class=\"active\"><a href=\"adminwelcome.jsp\" style=\"color:black;font-weight: bold;\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                                <li><a href=\"uploadmaterial.jsp\" style=\"color:white;font-weight: bold;\">Upload Material</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"ManageStudent.jsp\" style=\"color:white;font-weight: bold;\">Manage Student</a></li>\n");
      out.write("                                <li><a href=\"ManageLogin.jsp\" style=\"color:white;font-weight: bold;\">Manage Login</a></li>\n");
      out.write("                                <li><a href=\"ManageEnquiry.jsp\" style=\"color:white;font-weight: bold;\">Manage Enquiry</a></li>\n");
      out.write("                                <li><a href=\"ManageLeave.jsp\" style=\"color:white;font-weight: bold;\">Manage Leave</a></li>\n");
      out.write("                                <li><a href=\"logout.jsp\" style=\"color:white;font-weight: bold;\"><span style=\"color: red;font-size: 14pt;font-weight:bold;\" class=\"glyphicon glyphicon-off\"></span></a></li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"glyphicon glyphicon-cog fa-spin\" style=\"font-size:20px;color: #006600;\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"viewprofile.jsp\">Profile</a></li>\n");
      out.write("                                        <li><a href=\"changapassword.jsp\">Change Password</a></li>\n");
      out.write("                                        <li><a href=\"#\">View Record</a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul style=\"margin-top: 10px;margin-left: 80%;\"><li><a style=\"color: white;font-size: 15pt;\">Shubham Singh</a></li></ul>\n");
      out.write("                        </div> <!-- /.navbar-collapse -->\n");
      out.write("                    </div> <!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("            <!-- Menu div close-->");
      out.write("\n");
      out.write("            <!-- Main div open-->\n");
      out.write("            <div class=\"row main\"  style=\"margin-top:-20px;background-image: url(studentimages/bg.jpg);background-repeat: no-repeat;background-size: cover;\">\n");
      out.write("                <div class=\"cols-sm-12 h3 text-center\"> <a href=\"ManageLogin.jsp\"><span style=\"color: navy;font-weight: bold;\" class=\"glyphicon glyphicon-hand-left\"></span></a>Login Date Time</div>\n");
      out.write("               \n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <table class=\"table table-bordered table-hover\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>User ID</th>\n");
      out.write("                            <th colspan=\"2\">");
      out.print(request.getParameter("uid") );
      out.write("</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Sr.No.</th>\n");
      out.write("                            <th>Login Date</th>\n");
      out.write("                            <th>Login Time</th>\n");
      out.write("                        </tr> \n");
      out.write("                        ");

                            int n = 1;
                            String q = "select * from logininfo where userid='"+request.getParameter("uid")+"'";
                            ResultSet rs = new DBManager().getResult(q);
                            while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(n);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("logindate"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("logintime"));
      out.write("</td>\n");
      out.write("                            ");

                            n++; }
                            
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Main div close-->\n");
      out.write("        <!-- Footer div open-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row footer\" style=\"padding-top: 3%;margin-top: -30px;text-align: center;\">\n");
      out.write("            <span style=\"color: white;font-size: 20px;\">Developed by : Vivek Singh , #Mobile : +919140729954<br>Email : vivekmmmut16@gmail.com</span>\n");
      out.write("        </div> \n");
      out.write("        <!-- Footer div close-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

}

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
