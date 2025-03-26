<%-- 
    Document   : cart
    Created on : Mar 26, 2025, 1:19:35 PM
    Author     : Admin
--%>
<%@page import="dto.CartItem"%>
<%@page import="dao.MovieDAO"%>
<%@page import="dto.Movie"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);
                color: #fff;
                font-family: Arial, sans-serif;
                text-align: center;
                padding: 20px;
            }

            /* Định dạng tiêu đề */
            h2 {
                color: yellow;
                font-size: 24px;
                margin-bottom: 20px;
            }

            /* Bảng */
            table {
                width: 100%;
                border-collapse: collapse;
                background: rgba(0, 0, 0, 0.8);
                box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.2);
                border-radius: 10px;
                overflow: hidden;
            }

            /* Header của bảng */
            thead th {
                background: yellow;
                color: black;
                padding: 10px;
                font-size: 16px;
            }

            /* Ô dữ liệu */
            tbody td {
                padding: 10px;
                border-bottom: 1px solid #ccc;
                font-size: 14px;
            }

            /* Hiệu ứng hover cho hàng */
            tr:hover {
                background: rgba(255, 255, 255, 0.1);
            }

            /* Ảnh trong bảng */
            td img {
                width: 100px;
                border-radius: 5px;
            }

            /* Nút bấm */
            button, input[type="submit"] {
                background: yellow;
                color: black;
                font-weight: bold;
                padding: 8px 12px;
                border: none;
                cursor: pointer;
                border-radius: 5px;
                transition: background 0.3s ease-in-out;
            }

            button:hover, input[type="submit"]:hover {
                background: #ffcc00;
            }

            /* Nút "Back" */
            .back-button {
                background-color: #00BFFF;
                padding: 12px 18px;
            }

            .back-button:hover {
                background-color: #009ACD;
            }

            /* Container chứa nút */
            .button-container {
                display: flex;
                justify-content: center;
                margin-top: 20px;
            }

            /* Input số lượng */
            input[type="number"] {
                width: 50px;
                text-align: center;
                padding: 5px;
                border-radius: 5px;
                border: 1px solid #ddd;
            }

            /* Link */
            a {
                color: yellow;
                text-decoration: none;
                font-weight: bold;
            }

            a:hover {
                color: #ffcc00;
            }
        </style>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>id</th>
                    <th>name</th>
                    <th>quantity</th>
                    <th>price</th>
                    <th>Total</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dto" items="${cartItems}" varStatus="counter">
                    <tr> 
                        <td>${counter.count}</td>
                        <td>${dto.movieID}<input type="hidden" name="movieID" value="${dto.movieID}" /> </td>
                        <td>${dto.movieName}<input type="hidden" name="movieName" value="${dto.movieName}" /> </td>
                        <td>
                            <form action="MainController" method="post" class="d-inline">
                                <input type="hidden" name="action" value="UpdateCart">
                                <input type="hidden" name="movieID" value="${dto.movieID}">
                                <input type="number" name="quantity" value="${dto.quantity}" min="1" class="form-control d-inline-block" style="width: 60px;">
                                <button type="submit" class="btn btn-success btn-sm">Update</button>
                            </form> 
                        </td>
                        <td>45.000<input type="hidden" name="price" value="45" /></td>
                        <td>${dto.quantity*45}</td>
                        <td>
                            <form action="MainController" method="post" class="d-inline">
                                <input type="hidden" name="action" value="RemoveFromCart">
                                <input type="hidden" name="movieID" value="${dto.movieID}">
                                <button type="submit" class="btn btn-danger btn-sm">Remove</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
    <div class="button-container">
        <button type="button" class="form-button back-button" onclick="window.location.href = '<%= request.getContextPath()%>/views/home.jsp'">Trở Về Trang Chủ</button>
    </div>
</body>
</html>
