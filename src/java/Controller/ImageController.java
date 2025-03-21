/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.MovieDAO;
import dto.Movie;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ImageController", urlPatterns = {"/ImageController"})
public class ImageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String movieId = request.getParameter("id");
            MovieDAO movieDAO = new MovieDAO();
            List<Movie> movies = movieDAO.getAllMovies();

            for (Movie movie : movies) {
                if (movie.getId().equals(movieId)) {
                    byte[] imageData = movie.getImage();

                    if (imageData != null) {
                        response.setContentType("image/jpeg");
                        OutputStream outputStream = response.getOutputStream();
                        outputStream.write(imageData);
                        outputStream.close();
                    }
                    return;
                }
            }
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
