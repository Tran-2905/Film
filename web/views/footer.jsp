<%-- 
    Document   : footer
    Created on : Mar 26, 2025, 4:55:38 PM
    Author     : Admin
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<footer>
    <div class="footer-container">
        <div class="footer-column">
            <h3>TÀI KHOẢN</h3>
            <ul>
                <li><a href="#">Đăng nhập</a></li>
                <li><a href="#">Đăng ký</a></li>
                <li><a href="#">Membership</a></li>
            </ul>
        </div>
        <div class="footer-column">
            <h3>THUÊ SỰ KIỆN</h3>
            <ul>
                <li><a href="#">Thuê rạp</a></li>
                <li><a href="#">Các loại hình cho thuê khác</a></li>
            </ul>
        </div>
        <div class="footer-column">
            <h3>DỊCH VỤ KHÁC</h3>
            <ul>
                <li><a href="#">Nhà hàng</a></li>
                <li><a href="#">Kidzone</a></li>
                <li><a href="#">Bowling</a></li>
                <li><a href="#">Billiards</a></li>
            </ul>
        </div>
        <div class="footer-column">
            <h3>HỆ THỐNG RẠP</h3>
            <ul>
                <li><a href="#">Tất cả hệ thống rạp</a></li>
                <li><a href="#">Cinestar Quốc Thanh (TP.HCM)</a></li>
                <li><a href="#">Cinestar Hai Bà Trưng (TP.HCM)</a></li>
            </ul>
        </div>
    </div>
</footer>

<style>
    footer {
        background: #0B0B14; /* Đổi nền thành màu đen giống header */
        padding: 20px 0;
        color: white;
        text-align: center;
    }

    .footer-container {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        gap: 40px;
    }

    .footer-column {
        min-width: 200px;
        text-align: left;
    }

    .footer-column h3 {
        font-size: 18px;
        font-weight: bold;
        text-transform: uppercase;
        margin-bottom: 10px;
        color: #FFD700; /* Màu vàng giống nút "Đăng nhập" */
    }

    .footer-column ul {
        list-style: none;
        padding: 0;
    }

    .footer-column ul li {
        margin-bottom: 8px;
    }

    .footer-column ul li a {
        text-decoration: none;
        color: white;
        font-size: 14px;
        transition: color 0.3s;
    }

    .footer-column ul li a:hover {
        color: #FFD700; /* Đổi sang màu vàng khi hover giống header */
    }
    footer {
        position: fixed;
        bottom: 0;
        left: 0;
        width: 100%;
        background: #0B0B14; /* Màu nền đen giống header */
        color: white;
        text-align: center;
        padding: 15px 0;
        font-size: 14px;
    }

    .footer-container {
        display: flex;
        justify-content: center;
        gap: 40px;
        flex-wrap: wrap;
    }

    .footer-column {
        min-width: 200px;
        text-align: left;
    }

    .footer-column h3 {
        font-size: 16px;
        font-weight: bold;
        text-transform: uppercase;
        color: #FFD700; /* Màu vàng giống header */
    }

    .footer-column ul {
        list-style: none;
        padding: 0;
    }

    .footer-column ul li a {
        text-decoration: none;
        color: white;
        transition: color 0.3s;
    }

    .footer-column ul li a:hover {
        color: #FFD700; /* Màu vàng khi hover */
    }
</style>