/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.MovieDAO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
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
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("name");
            String actor = request.getParameter("actor");
            String category = request.getParameter("category");
            int time = Integer.parseInt(request.getParameter("time"));
            String language = request.getParameter("language");
            String description = request.getParameter("description");
            boolean isShowing = request.getParameter("isShowing") != null;

            // Xử lý file ảnh
            InputStream inputStream = null;
            Part filePart = request.getPart("imageFile");
            if (filePart != null && filePart.getSize() > 0) {
                inputStream = filePart.getInputStream();
            }

            // Gọi DAO để thêm phim
            MovieDAO movieDAO = new MovieDAO();
            boolean success = movieDAO.addMovie(name, actor, category, time, language, inputStream, filePart.getSize(), description, isShowing);

            if (success) {
                request.setAttribute("message", "add movie successful");
            } else {
                request.setAttribute("message", "add movie fail");
            }
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
        String name = request.getParameter("name");
        String actor = request.getParameter("actor");
        String category = request.getParameter("category");
        int time = Integer.parseInt(request.getParameter("time"));
        String language = request.getParameter("language");
        String description = request.getParameter("description");
        boolean isShowing = request.getParameter("isShowing") != null;

        // Xử lý file ảnh
        InputStream inputStream = null;
        Part filePart = request.getPart("image");
        if (filePart != null && filePart.getSize() > 0) {
            inputStream = filePart.getInputStream();
        }

        // Gọi DAO để thêm phim
        MovieDAO movieDAO = new MovieDAO();
        boolean success = movieDAO.addMovie(name, actor, category, time, language, inputStream, filePart.getSize(), description, isShowing);

        if (success) {
            response.sendRedirect("showingMovies.jsp"); // Chuyển hướng nếu thành công
        } else {
            response.getWriter().println("Thêm phim thất bại.");
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
