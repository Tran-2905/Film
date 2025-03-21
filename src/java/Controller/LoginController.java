/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Utils.AuthUtils;
import dao.UserDAO;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userName = request.getParameter("txtUser");
        String password = request.getParameter("txtPassword");
        UserDAO userDAO = new UserDAO();
        boolean checkLogin = userDAO.isValidLogin(userName, password);
        if (checkLogin) {
            User user = userDAO.readbyID(userName);
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                request.getRequestDispatcher("views/home.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "User not found. Please try again.");
                request.getRequestDispatcher("views/login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "Invalid username or password");
            request.getRequestDispatcher("views/login.jsp").forward(request, response);
        }
    }
}
