/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.DBUtils;
import dto.CartItem;
import dto.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class OrderDAO {
    public void placeOrder(String userID, double totalAmount, HttpSession session) throws Exception {
    String orderID = "ORD" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);
    String insertOrderSQL = "INSERT INTO tblOrders (orderID, userID, orderDate, totalAmount) VALUES (?, ?, ?, ?)";
    String insertOrderDetailSQL = "INSERT INTO tblOrderDetails (orderID, MovieID, quantity, price) VALUES (?, ?, ?, ?)";

    List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");

    if (cartItems == null || cartItems.isEmpty()) {
        throw new Exception("Cart is empty. Cannot place order.");
    }

    try (Connection conn = DBUtils.getConnection()) {
        conn.setAutoCommit(false);

        try (PreparedStatement orderStmt = conn.prepareStatement(insertOrderSQL)) {
            orderStmt.setString(1, orderID);
            orderStmt.setString(2, userID);
            orderStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            orderStmt.setDouble(4, totalAmount);
            orderStmt.executeUpdate();
        }

        try (PreparedStatement detailStmt = conn.prepareStatement(insertOrderDetailSQL)) {
            for (CartItem item : cartItems) {
                detailStmt.setString(1, orderID);
                detailStmt.setString(2, item.getMovieID());
                detailStmt.setInt(3, item.getQuantity());
                detailStmt.setDouble(4, item.getPrice());
                detailStmt.addBatch();
            }
            detailStmt.executeBatch();
        }

        conn.commit();
        System.out.println("Order placed successfully: " + orderID);
    }
}


    public List<Order> getAllOrders() throws Exception {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM tblOrders";
        try (Connection conn = DBUtils.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Order order = new Order();
                order.setOrderID(rs.getString("orderID"));
                order.setUserID(rs.getString("userID"));
                order.setOrderDate(rs.getDate("orderDate"));
                order.setTotalAmount(rs.getDouble("totalAmount"));
                orders.add(order);
            }
        }
        return orders;
    }
}
