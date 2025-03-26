<%-- 
    Document   : orderConfirmation
    Created on : Mar 26, 2025, 10:05:58 PM
    Author     : Admin
--%>

<%@page import="dto.CartItem"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h2>
                Order Confirmation
            </h2>
            <p class="text-center">Thank you for your order! Here is your order summary.</p>
            <table class="table table-bordered text-center">
                <thead style="background-color: #C6565C; color: white;">
                    <tr>
                        <th>Food Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<CartItem> lastOrder = (List<CartItem>) session.getAttribute("lastOrder");
                        double totalAmount = 0.0;

                        if (lastOrder != null && !lastOrder.isEmpty()) {
                            for (CartItem item : lastOrder) {
                                double total = item.getPrice() * item.getQuantity();
                                totalAmount += total;
                    %>
                    <tr>
                        <td><%= item.getMovieName()%></td>
                        <td><%= item.getQuantity()%></td>
                        <td>$<%= item.getPrice()%></td>
                        <td>$<%= total%></td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="4" class="text-danger">Your order is empty.</td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <h3 class="text-right">Total Amount: <span class="text-success">$<%= totalAmount%></span></h3>
            <p class="text-center">Your order has been successfully placed. You will receive a confirmation email shortly.</p>

            <div class="text-center mt-4">
                <a href="${pageContext.request.contextPath}/MainController" class="btn btn-secondary">
                    Back to Home
                </a>
            </div>
        </div>
    </body>
</html>
