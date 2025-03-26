<%-- 
    Document   : booking
    Created on : Mar 26, 2025, 1:40:13 PM
    Author     : Admin
--%>

<%@page import="dao.MovieDAO"%>
<%@page import="dto.Movie"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
                margin: 0;
                padding: 0;
            }
            .container {
                width: 80%;
                margin: auto;
                display: flex;
                align-items: center;
                justify-content: center;
                gap: 20px;
                padding: 20px;
                padding-top: 150px; 
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
            header {
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                background: #000;
                color: white;
                padding: 15px;
                text-align: center;
                z-index: 1000; 
            }
        </style>
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope.user.role eq 'user'}">
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
                            String mimeType = "image/jpeg"; // Mặc định là JPEG

                            // Nếu chuỗi đã chứa "data:image/png;base64," hoặc "data:image/jpeg;base64,", không cần thêm lại
                            if (base64Image.startsWith("data:image")) {
                                mimeType = base64Image.substring(5, base64Image.indexOf(";"));
                                base64Image = base64Image.substring(base64Image.indexOf(",") + 1); // Loại bỏ tiền tố
                            } else {
                                // Kiểm tra nếu Base64 bắt đầu bằng PNG
                                if (base64Image.startsWith("iVBORw0KGgo")) {
                                    mimeType = "image/png";
                                }
                            }
                    %>
                    <div class="poster">
                        <img src="data:<%= mimeType%>;base64,<%= base64Image%>" alt="<%= movie.getName()%>">
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
                        <p><strong>Tên phim:</strong> <%= movie.getName()%></p>
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
            </c:when>
            <c:otherwise>
                <script>
                    alert("You are not User! Redirecting to login page.");
                    window.location.href = "login.jsp";
                </script>
            </c:otherwise>
        </c:choose>
    </body>
</html>
