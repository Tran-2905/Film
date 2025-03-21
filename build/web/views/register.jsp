<%-- 
    Document   : Register
    Created on : Mar 18, 2025, 3:05:14 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page</title>
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

            .register-form {
                background: rgba(0, 0, 0, 0.8);
                padding: 30px;
                border-radius: 10px;
                box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
                text-align: center;
                width: 350px;
            }

            .register-form h2 {
                color: #ffffff;
                margin-bottom: 20px;
            }

            .Form-register {
                text-align: left;
                margin-bottom: 15px;
            }

            .Form-register label {
                font-weight: bold;
                color: #e1bee7;
            }

            .Form-register input {
                width: 100%;
                padding: 10px;
                margin-top: 5px;
                border: 1px solid #ba68c8;  /* Viền tím nhạt */
                border-radius: 5px;
                outline: none;
                background: white;  /* Nền trắng */
                color: black;  /* Chữ màu đen */
                font-size: 16px;
            }

            .Form-register input::placeholder {
                color: #666; /* Placeholder màu xám */
            }
            button[type="submit"] {
                width: 100%;
                padding: 10px;
                background-color: #d500f9;
                border: none;
                border-radius: 5px;
                color: white;
                font-size: 16px;
                cursor: pointer;
                transition: background 0.3s ease;
                margin-top: 10px;
            }

            button[type="submit"]:hover {
                background-color: #aa00ff;
            }

            /* Nút Đăng nhập */
            .login-text {
                color: #e1bee7;
                font-size: 14px;
                margin-top: 10px;
            }

            .login-btn {
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

            .login-btn:hover {
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
        <div class="register-form">
        <h2>Đăng ký</h2>
        <form action="${pageContext.request.contextPath}/MainController" method="post">
            <input type="hidden" name="action" value="register">

            <div class="Form-register">
                <label for="UserName">User Name:</label>
                <input type="text" name="txtUser" id="UserName" required>
            </div>

            <div class="Form-register">
                <label for="fullName">Full Name:</label>
                <input type="text" name="txtFullName" id="fullName" required>
            </div>

            <div class="Form-register">
                <label for="email">Email:</label>
                <input type="text" name="txtEmail" id="email" required>
            </div>

            <div class="Form-register">
                <label for="password">Password:</label>
                <input type="password" name="txtPassword" id="password" required>
            </div>

            <div class="Form-register">
                <label for="passwordAgain">Password Again:</label>
                <input type="password" name="txtPasswordAgain" id="passwordAgain" required>
            </div>

            <button type="submit">Đăng ký</button>
            <%
                String message = request.getAttribute("message")+""; 
            %>
            <p class="message"><%=message.equals("null") ? "" : message%></p>
        </form>

        <p class="login-text">Đã có tài khoản?</p>
        <a href="login.jsp" class="login-btn">Đăng nhập</a>
    </div>
    </body>
</html>
