/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.CartDAO;
import dao.OrderDAO;
import dto.CartItem;
import dto.Order;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        OrderDAO orderDAO = new OrderDAO();
        CartDAO cartDAO = new CartDAO();

        try {
            if ("PlaceOrder".equals(action)) {
                // Xử lý khi đặt đơn hàng
                User user = (User) session.getAttribute("user");
                String userID = user.getUserName();
                List<CartItem> cartItems = cartDAO.getCartItems(session); // Lấy giỏ hàng từ session
                String totalAmountStr = request.getParameter("totalAmount");
                if (totalAmountStr == null || totalAmountStr.isEmpty()) {
                    request.setAttribute("ERROR", "Total amount is missing.");
                    request.getRequestDispatcher("views/cart.jsp").forward(request, response);
                    return;
                }

                double totalAmount = Double.parseDouble(totalAmountStr);

                if (cartItems == null || cartItems.isEmpty()) {
                    request.setAttribute("ERROR", "Your cart is empty.");
                    request.getRequestDispatcher("views/cart.jsp").forward(request, response);
                    return;
                }
                if (userID == null) {
                    response.sendRedirect("views/login.jsp");
                    return;
                }
                // Lưu đơn hàng vào database
                orderDAO.placeOrder(userID, totalAmount, session);

                // Lưu giỏ hàng để hiển thị trên trang xác nhận
                session.setAttribute("lastOrder", cartItems);

                // Xóa giỏ hàng khỏi session
                session.removeAttribute("cartItems");

                response.sendRedirect("views/orderConfirmation.jsp");

            } else if ("ViewOrders".equals(action)) {
                // Kiểm tra xem người dùng có quyền admin không
                String role = (String) session.getAttribute("role");

                // Nếu không phải admin, chuyển hướng đến trang error hoặc trang khác
                if (role == null || !role.equals("admin")) {
                    response.sendRedirect("views/home.jsp");
                    return;
                }

                // Lấy tất cả đơn hàng từ database cho admin
                List<Order> orders = orderDAO.getAllOrders();
                request.setAttribute("orders", orders);
                request.getRequestDispatcher("/views/admin/viewOrders.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("ERROR", "Failed to process order.");
            request.getRequestDispatcher("views/cart.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
    }

}
