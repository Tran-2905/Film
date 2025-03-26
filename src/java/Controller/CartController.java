/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.CartDAO;
import dao.MovieDAO;
import dto.CartItem;
import dto.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CartController", urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
////    @Override
////    protected void doGet(HttpServletRequest request, HttpServletResponse response)
////            throws ServletException, IOException {
////        MovieDAO movieDAO = new MovieDAO();
////        String movieId = (String) request.getAttribute("movieId");
////        String quantity1 = request.getParameter("quantity");
////        if (quantity1 == null || !quantity1.matches("\\d+")) {
////            request.setAttribute("ERROR", "Invalid quantity");
////            request.getRequestDispatcher("views/booking.jsp").forward(request, response);
////            return;
////        }
////        int quantity = Integer.parseInt(quantity1);
////        Movie movie = new Movie();
////        movie = movieDAO.getMovieByID(movieId);
////        CartItem cartItem = new CartItem(movieId, movie.getName(), quantity, 45 );
////        
////    }
//
//    
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        CartDAO cartDAO = new CartDAO();

        try {
            System.out.println("[DEBUG] Retrieving cart items... Session ID: " + session.getId());

            List<CartItem> cartItems = cartDAO.getCartItems(session);
            if (cartItems == null) {
                System.out.println("[ERROR] Cart items are null!");
            } else {
                System.out.println("[DEBUG] Cart items retrieved: " + cartItems.size());
            }
            request.setAttribute("cartItems", cartItems);
            request.getRequestDispatcher("views/cart.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[ERROR] Exception in retrieving cart items: " + e.getMessage());
            request.setAttribute("ERROR", "Failed to retrieve cart items.");
            request.getRequestDispatcher("views/booking.jsp").forward(request, response);
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        CartDAO cartDAO = new CartDAO();

        try {
            if ("AddToCart".equals(action)) {
                String movieID = request.getParameter("movieID");
                if (movieID == null || movieID.trim().isEmpty()) {
                    System.out.println("[ERROR] movieID is null or empty");
                    request.setAttribute("ERROR", "Invalid movie ID.");
                    request.getRequestDispatcher("views/booking.jsp").forward(request, response);
                }
                int quantity = Integer.parseInt(request.getParameter("quantity"));
                System.out.println("[DEBUG] Adding to cart: " + movieID + " (Qty: " + quantity + ")");
                cartDAO.addToCart(session, movieID, quantity);
                response.sendRedirect("MainController?action=ViewCart");
            } else if ("UpdateCart".equals(action)) {
                String movieID = request.getParameter("movieID");
                int quantity = Integer.parseInt(request.getParameter("quantity"));

                System.out.println("[DEBUG] Updating cart item: " + movieID + " (New Qty: " + quantity + ")");
                cartDAO.updateCart(session, movieID, quantity);
                response.sendRedirect("MainController?action=ViewCart");

            } else if ("RemoveFromCart".equals(action)) {
                String movieID = request.getParameter("movieID");

                System.out.println("[DEBUG] Removing from cart: " + movieID);
                cartDAO.removeFromCart(session, movieID);
                response.sendRedirect("MainController?action=ViewCart");

            } else {
                System.out.println("[ERROR] Invalid cart action: " + action);
                request.setAttribute("ERROR", "Invalid cart action.");
                request.getRequestDispatcher("views/booking.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("ERROR", "Failed to process cart action.");
            request.getRequestDispatcher("views/booking.jsp").forward(request, response);
        }
    }

}
