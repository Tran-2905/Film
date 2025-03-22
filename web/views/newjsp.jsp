<%-- 
    Document   : newjsp
    Created on : Mar 23, 2025, 12:24:21 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách phim</title>
    <link rel="stylesheet" href="css/style.css">
    <style>
        * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    background: linear-gradient(to right, #0b0d19, #241a48);
    color: white;
    text-align: center;
    padding-top: 80px; /* Để không bị header che */
}

.container {
    width: 90%;
    margin: auto;
}

h2 {
    font-size: 26px;
    margin-bottom: 20px;
    color: #FFD700;
}

/* Danh sách phim */
.movie-list {
    display: flex;
    justify-content: center;
    gap: 15px;
    flex-wrap: wrap;
}

/* Mỗi phim */
.movie {
    background: #1c1b29;
    border-radius: 10px;
    padding: 15px;
    width: 250px;
    text-align: center;
    transition: transform 0.3s ease-in-out;
    box-shadow: 0 4px 8px rgba(255, 255, 255, 0.1);
}

.movie:hover {
    transform: scale(1.05);
}

.movie img {
    width: 100%;
    height: 370px;
    border-radius: 10px;
    object-fit: cover;
}

.movie h3 {
    font-size: 18px;
    margin-top: 10px;
    color: #FFD700;
}

.movie p {
    font-size: 14px;
    margin: 5px 0;
    color: #ecf0f1;
}

/* Nút đặt vé */
.btn {
    background: #FFD700;
    color: black;
    border: none;
    padding: 10px 15px;
    border-radius: 5px;
    font-size: 16px;
    font-weight: bold;
    cursor: pointer;
    margin-top: 10px;
    transition: background 0.3s;
}

.btn:hover {
    background: #d4ac0d;
}
    </style>
</head>
<body>

    <div class="container">
        <h2>Phim đang chiếu</h2>
        <div class="movie-list">
            <div class="movie">
                <img src="image/movie1.jpg" alt="Phim 1">
                <h3>QUỶ NHẬP TRÀNG (T18)</h3>
                <p>Thể loại: Kinh dị</p>
                <p>Thời gian: 120 phút</p>
                <button class="btn">ĐẶT VÉ</button>
            </div>

            <div class="movie">
                <img src="image/movie2.jpg" alt="Phim 2">
                <h3>SÁT THỦ VÔ CÙNG CỰC HÀI (T16)</h3>
                <p>Thể loại: Hài, hành động</p>
                <p>Thời gian: 100 phút</p>
                <button class="btn">ĐẶT VÉ</button>
            </div>

            <div class="movie">
                <img src="image/movie3.jpg" alt="Phim 3">
                <h3>NHÀ GIA TIÊN (T18)</h3>
                <p>Thể loại: Kinh dị, tâm lý</p>
                <p>Thời gian: 110 phút</p>
                <button class="btn">ĐẶT VÉ</button>
            </div>

            <div class="movie">
                <img src="image/movie4.jpg" alt="Phim 4">
                <h3>NGHI LỄ TRỤC QUỶ (T18)</h3>
                <p>Thể loại: Kinh dị</p>
                <p>Thời gian: 90 phút</p>
                <button class="btn">ĐẶT VÉ</button>
            </div>
        </div>
    </div>

</body>
</html>