/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.MovieDAO;
import dto.Movie;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Admin
 */
@WebServlet(name = "addMovieController", urlPatterns = {"/addMovieController"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024, // 1MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50 // 50MB
)
public class addMovieController extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String name = request.getParameter("txtname");
            if (name == null || name.trim().isEmpty()) {
                request.setAttribute("ERROR", "name cannot be empty");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            String actor = request.getParameter("actor");
            if (actor == null || actor.trim().isEmpty()) {
                request.setAttribute("ERROR", "actor cannot be empty");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            String category = request.getParameter("category");
            if (category == null || category.trim().isEmpty()) {
                request.setAttribute("ERROR", "category cannot be empty");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            String time = request.getParameter("time");
            if (time == null || !time.matches("\\d+")) {
                request.setAttribute("ERROR", "Invalid time");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            int time1 = Integer.parseInt(time);
            String language = request.getParameter("language");
            if (language == null || language.trim().isEmpty()) {
                request.setAttribute("ERROR", "language cannot be empty");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            String description = request.getParameter("description");
            if (description == null || description.trim().isEmpty()) {
                request.setAttribute("ERROR", "description cannot be empty");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            boolean isShowing = request.getParameter("isShowing") != null;
            String image = request.getParameter("txtImage");
            if (image == null || image.trim().isEmpty()) {
                request.setAttribute("ERROR", "image cannot be empty");
                request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
                return;
            }
            String id = request.getParameter("id");
            System.out.println("is ID " + id);
            MovieDAO movieDAO = new MovieDAO();
            if (id != null && !id.isEmpty() && movieDAO.isMovieExists(id)) {
                boolean updateSuccess = movieDAO.updateMovie(id, name, actor, category, time1, language, image, description, isShowing);
                request.setAttribute("message", updateSuccess ? "Update movie successful" : "Update movie failed");
            } else {
                boolean addSuccess = movieDAO.addMovie(name, actor, category, time1, language, image, description, isShowing);
                request.setAttribute("message", addSuccess ? "Add movie successful" : "Add movie failed");
            }
            request.getRequestDispatcher("views/admin/addMovie.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(addMovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addMovieController.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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
