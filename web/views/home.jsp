<%-- 
    Document   : HomePage
    Created on : Mar 18, 2025, 3:09:07 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                margin-top: 100px;
            }
            .button-container {
                display: flex;
                justify-content: center;
                margin-top: 20px; /* Đẩy xuống thêm một chút */
                position: relative;
                z-index: 10;
            }

            .add-movie-button {
                padding: 10px 20px;
                font-size: 16px;
                font-weight: bold;
                color: white;
                background: linear-gradient(135deg, #FF00FF, #E600E6);
                border: none;
                border-radius: 8px;
                cursor: pointer;
                transition: background 0.3s ease-in-out;
            }

            .add-movie-button:hover {
                background: linear-gradient(135deg, #E600E6, #C400C4);
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="button-container">
            <button class="add-movie-button" onclick="location.href='<%= request.getContextPath() %>/views/admin/addMovie.jsp'">➕ Thêm Phim</button>
        </div>
    </body>
</html>
