<%-- 
    Document   : header
    Created on : Mar 18, 2025, 11:39:54 AM
    Author     : Admin
--%>

<%@page import="dto.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Header</title>
    <style>
        .body{
            margin-bottom: 50px;
        }
        .navbar {
            display: flex
;
            align-items: center;
            justify-content: space-between;
            /* padding: 0px 0px; */
            background-color: #0b0d19;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            z-index: 1000;
        }

        /* LOGO */
        .logo-img {
            height: 50px;
        }

        /* BUTTONS */
        .btn {
            padding: 10px 15px;
            border: none;
            cursor: pointer;
            font-weight: bold;
            display: flex;
            align-items: center;
            gap: 5px;
            border-radius: 5px;
        }

        .yellow {
            background-color: #FFD700;
            color: black;
        }

        .purple {
            background-color: #6A0DAD;
            color: white;
        }

        /* SEARCH BAR */
        .search-bar {
            display: flex;
            align-items: center;
            background: white;
            border-radius: 20px;
            padding: 5px 10px;
            border: 2px solid black;
        }

        .search-bar input {
            border: none;
            outline: none;
            padding: 5px;
            width: 200px;
        }

        .search-icon {
            width: 20px;
            cursor: pointer;
        }

        /* USER ACTIONS */
        .user-actions {
            display: flex;
            align-items: center;
            gap: 10px;
            color: white;
            background: #0b0d19;
            padding: 30px;
            border-radius: 10px;    
            box-shadow: 0px 4px 10px rgba(0,0,0,0.5);
        }

        .icon {
            width: 20px;
        }

        .flag-icon {
            width: 25px;
        }
        .login-btn {
            display: flex;
            align-items: center;
            font-size: 16px;
            font-weight: bold;
            color: yellow;
            text-decoration: none; /* Bỏ gạch dưới */
        }

        .login-btn .icon {
            width: 20px;
            height: 20px;
            margin-right: 5px;
            filter: invert(100%);
        }
        .user-section {
                display: flex;
                align-items: center;
                gap: 20px;
                color: white;
            }

            .welcome-text {
                /* Màu vàng cho chữ “Xin chào” và tên user */
                color: #FFD700;
                font-size: 16px;
                font-weight: bold;
            }

            .logout-btn {
                /* CSS cho nút Đăng xuất */
                background-color: #ff4b2b;  /* Chọn màu nền tùy ý */
                color: #ffffff;            /* Màu chữ */
                padding: 10px 15px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                font-weight: bold;
                transition: background-color 0.3s;
            }

            .logout-btn:hover {
                background-color: #e33e1f; /* Màu nền khi hover */
            }     
    </style>
</head>
<body>
    <%
        User user = (User) session.getAttribute("user");
    %>
    <header class="navbar">
        <div class="logo">
            <img src="<%= request.getContextPath() %>/image/logoCinestart.png" alt="Logo" class="logo-img">
        </div>

        <nav class="nav-links">
            <button class="btn yellow">
                <img src="ticket-icon.png" alt="Ticket" class="icon">
                ĐẶT VÉ NGAY
            </button>
            <button class="btn purple">
                <img src="popcorn-icon.png" alt="Popcorn" class="icon">
                ĐẶT BẮP NƯỚC
            </button>
        </nav>

        <div class="search-bar">
            <input type="text" placeholder="Tìm phim, rạp">
            <img src="<%= request.getContextPath() %>/image/searchbutton.png" width="400" height="16" alt="Search" class="search-icon">
        </div>
        <div>
            <% if (user==null) { %>
                <div class="user-actions">
                    <a href="${pageContext.request.contextPath}/views/login.jsp" class="login-btn">
                        <img src="<%= request.getContextPath() %>/image/iconuser.jpg" alt="User" class="icon">
                        Đăng nhập
                    </a>
                </div>
            <%}else{ %>
                <div class="user-section">
                    <span class="welcome-text">Xin chào, <span class="user-name">${sessionScope.user.fullName}</span>!</span>
                    <form action="${pageContext.request.contextPath}/MainController" method="post" style="margin: 0;">
                        <input type="hidden" name="action" value="logout"/>
                        <input type="submit" value="Đăng xuất" class="logout-btn"/>
                    </form>
                </div>
            <%}%>
        </div>
    </header>

</body>
</html>
