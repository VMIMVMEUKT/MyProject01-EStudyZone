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
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(name = "upmaterial", urlPatterns = {"/upmaterial"})
public class upmaterial extends HttpServlet {

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
            out.println("<title>Servlet upmaterial</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet upmaterial at " + request.getContextPath() + "</h1>");
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
        try {
            String subject=request.getParameter("subject").trim();
            Part p = request.getPart("uploadm");
            String filename = p.getSubmittedFileName();
            InputStream it = p.getInputStream();
            String userid = request.getParameter("userid").trim();
            DBManager db = new DBManager();
            int id = db.getAutoIncrement("stupid", "studentupload");
            String q = "insert into studentupload values('" + id + "','" + userid + "','" + (id + filename) + "','" + db.getCurrentDate() + "','" + db.getCuurentTime() + "','student','"+subject+"')";
            if (db.executeNoneQuery(q) == true) {
                File up = new File(request.getRealPath("/studentUpMaterial"), id + filename);
                Files.copy(it, up.toPath());
                response.sendRedirect("studentzone/uploadstudentmaterial.jsp?s=1");

            } else {
                response.sendRedirect("studentzone/uploadstudentmaterial.jsp?er=2");

            }

        } catch (Exception e) {
            response.sendRedirect("studentzone/uploadstudentmaterial.jsp?er=3");

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
