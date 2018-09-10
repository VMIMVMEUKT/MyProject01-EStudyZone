/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(name = "uploadpic", urlPatterns = {"/uploadpic"})
public class uploadpic extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet uploadpic</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet uploadpic at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            String userid = request.getParameter("userid").trim();
            Part p = request.getPart("pic");
            String filename = p.getSubmittedFileName();
            InputStream it = p.getInputStream();
            String q = "select * from userfile where userid='" + userid + "'";
            DBManager db = new DBManager();
            ResultSet rs = db.getResult(q);
            out.print(filename);
            if (rs.next() == true) {
                String up = "update userfile  set filename='" + (userid + filename) + "' where userid='" + userid + "' ";
                db.executeNoneQuery(up);
                File uploadpath = new File(request.getRealPath("/userpic"), userid + filename);
                Files.copy(it, uploadpath.toPath());
                response.sendRedirect("studentzone/viewprofile.jsp?s=1");
            } else {
                String save = "insert into userfile values('" + db.getAutoIncrement("fileid", "userfile") + "','" + userid + "','" + (userid + filename) + "')";
                db.executeNoneQuery(save);
                File uploadpath = new File(request.getRealPath("/userpic"), userid + filename);

                Files.copy(it, uploadpath.toPath());
                response.sendRedirect("studentzone/viewprofile.jsp?s=2");

            }

        } catch (Exception e) {
            // response.sendRedirect("studentzone/viewprofile.jsp?err="+e);
            out.print(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
