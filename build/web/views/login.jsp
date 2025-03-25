<%-- 
    Document   : login
    Created on : Mar 18, 2025, 11:26:29 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: linear-gradient(to bottom, #4a148c, #7b1fa2); 
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }

            .login-container {
                background: rgba(0, 0, 0, 0.8);
                padding: 30px;
                border-radius: 10px;
                box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
                text-align: center;
                width: 350px;
            }

            .form-title {
                color: #ffffff;
                margin-bottom: 20px;
            }

            .form-group {
                text-align: left;
                margin-bottom: 15px;
            }

            .form-group label {
                font-weight: bold;
                color: #e1bee7;
            }

            .form-group input {
                width: 100%;
                padding: 10px;
                margin-top: 5px;
                border: 1px solid #ba68c8;
                border-radius: 5px;
                outline: none;
                background: #6a1b9a;
                color: white;
            }

            .submit-btn {
                width: 100%;
                padding: 10px;
                background-color: #d500f9;
                border: none;
                border-radius: 5px;
                color: white;
                font-size: 16px;
                cursor: pointer;
                transition: background 0.3s ease;
                margin-bottom: 10px;
            }

            .submit-btn:hover {
                background-color: #aa00ff;
            }

            /* Nút Đăng ký (Màu tím nhạt hơn) */
            .register-text {
                color: #e1bee7;
                font-size: 14px;
                margin: 10px 0;
            }

            .register-btn {
                display: inline-block;
                padding: 10px;
                width: 100%;
                text-align: center;
                background-color: #8e24aa; /* Tím nhạt hơn */
                color: white;
                font-weight: bold;
                border-radius: 5px;
                text-decoration: none;
                transition: background 0.3s ease;
            }

            .register-btn:hover {
                background-color: #ab47bc; /* Tím sáng hơn khi hover */
            }

            /* Hiển thị thông báo */
            .message {
                color: #ffcc00;
                font-size: 14px;
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="login-container">
            <div class="login-form">
                <h2 class="form-title">Đăng nhập</h2>
                <form action="${pageContext.request.contextPath}/MainController" method="post">
                    <input type="hidden" name="action" value="login" />

                    <div class="form-group">
                        <label for="userId">Tên đăng nhập</label>
                        <input type="text" id="userId" name="txtUser" required />
                    </div>

                    <div class="form-group">
                        <label for="password">Mật khẩu</label>
                        <input type="password" id="password" name="txtPassword" required />
                    </div>

                    <button type="submit" class="submit-btn">Đăng nhập</button>

                    <%
                        String message = (String) request.getAttribute("message"); 
                        if (message != null) {
                    %>
                    <p class="message"><%=message.equals("null") ? "" : message%></p>
                    <%}%>
                </form>

                <p class="register-text">Chưa có tài khoản?</p>
                <a href="<%= request.getContextPath() %>/views/register.jsp" class="register-btn">Đăng ký</a>
            </div>
        </div>
    </body>
</html>
