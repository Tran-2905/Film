<%-- 
    Document   : booking
    Created on : Mar 26, 2025, 1:40:13 PM
    Author     : Admin
--%>

<%@page import="dao.MovieDAO"%>
<%@page import="dto.Movie"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Đặt Vé</title>
        <style>
            body {
                background: #0f0c29;
                color: white;
                font-family: Arial, sans-serif;
                text-align: center;
            }
            .container {
                width: 80%;
                margin: auto;
                display: flex;
                align-items: center;
                justify-content: center;
                gap: 20px;
                padding: 20px;
            }
            .poster img {
                width: 300px;
                border-radius: 10px;
            }
            .details {
                text-align: left;
                max-width: 500px;
            }
            .btn {
                background: yellow;
                color: black;
                font-weight: bold;
                padding: 10px;
                border: none;
                cursor: pointer;
                border-radius: 5px;
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%
            String id = request.getParameter("movieId");
            MovieDAO movieDAO = new MovieDAO();
            Movie movie = movieDAO.getMovieByID(id);
        %>
        <div class="container">
            <%
                String base64Image = movie.getImage();
                if (base64Image != null && !base64Image.isEmpty()) {
                    // Kiểm tra nếu base64Image đã có "data:image/jpeg;base64," thì loại bỏ nó
                    if (base64Image.startsWith("data:image")) {
                        base64Image = base64Image.substring(base64Image.indexOf(",") + 1);
                    }
            %>
            <div class="poster">
                <img src="data:image/jpeg;base64,<%= base64Image%>" alt="<%= movie.getName()%>">
            </div>
            <%
            } else {
            %>
            <p>Không có ảnh</p>
            <%
                }
            %>
            <div class="details">
                <h2><%= movie.getName()%></h2>
                <p><strong>Thể loại:</strong> <%= movie.getCategory()%></p>
                <p><strong>Thời lượng:</strong> <%= movie.getTime()%> phút</p>
                <p><strong>Mô tả:</strong> <%= movie.getDescription()%></p>

                <form action="${pageContext.request.contextPath}/MainController" method="post">
                    <input type="hidden" name="action" value="AddToCart">
                    <input type="hidden" name="movieID" value="<%= movie.getId()%>">
                    <label for="quantity">Số lượng vé:</label>
                    <input type="number" name="quantity" id="quantity" min="1" required>
                    <button type="submit" class="btn">Đặt vé</button>
                </form>
            </div>
        </div>
    </body>
</html>
