/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Utils.PasswordUtils;
import dao.UserDAO;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "RegisterController", urlPatterns = {"/RegisterController"})
public class RegisterController extends HttpServlet {

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
        String url = "views/register.jsp";
        UserDAO userDAO = new UserDAO();
        String txtUser = (String) request.getParameter("txtUser");
        String txtFullName = (String) request.getParameter("txtFullName");
        String txtEmail = (String) request.getParameter("txtEmail");
        String txtPassword = (String) request.getParameter("txtPassword");
        String txtPasswordAgain = (String) request.getParameter("txtPasswordAgain");

        boolean hasError = false;

        // Validate userID
        if (txtUser == null || txtUser.trim().length() < 3) {
            request.setAttribute("message", "User ID must be at least 3 characters long");
            hasError = true;
        }

        if (txtFullName == null || txtFullName.trim().isEmpty()) {
            request.setAttribute("message", "Full Name is required");
            hasError = true;
        }

        if (txtEmail == null || !isValidEmail(txtEmail)) {
            request.setAttribute("message", "Please enter a valid email address");
            hasError = true;
        }

        if (txtPassword == null || txtPassword.length() < 6) {
            request.setAttribute("message", "Password must be at least 6 characters long");
            hasError = true;
        }
        if (!txtPassword.equals(txtPasswordAgain)) {
            request.setAttribute("message", "password do not match");
            hasError = true;
        }
        if (!userDAO.differenceUserName(txtUser)) {
            request.setAttribute("message", "username is existed");
            hasError = true;
        }
        if (hasError) {
            request.setAttribute("message", "password do not match");
            request.getRequestDispatcher("views/register.jsp").forward(request, response);
        } else {
            String Strpassword = PasswordUtils.hashPassword(txtPassword);
            User user = new User(txtUser, txtFullName, txtEmail, Strpassword);
            userDAO.create(user);
            request.getRequestDispatcher("views/login.jsp").forward(request, response);
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

    private boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
