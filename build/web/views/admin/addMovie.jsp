<%-- 
    Document   : addMovie
    Created on : Mar 19, 2025, 5:04:36 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Movie</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #6A0DAD, #9F2BFF);
            margin: 0;
            padding: 20px;
            color: #fff;
        }
        .container {
            width: 500px;
            margin: 0 auto;
            background: #1E1B29;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0,0,0,0.5);
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="number"],
        textarea {
            width: 100%;
            padding: 8px;
            border-radius: 4px;
            border: none;
            outline: none;
        }
        input[type="file"] {
            color: #000;
        }
        .button-container {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }
        .form-button {
            width: 100%;
            padding: 10px;
            background-color: #FF00FF;
            border: none;
            border-radius: 5px;
            font-weight: bold;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }
        .form-button:hover {
            background-color: #E600E6;
        }
        .back-button {
            background-color: #00BFFF;
        }
        .back-button:hover {
            background-color: #009ACD;
        }
        .preview {
            margin-top: 10px;
            max-width: 100%;
            max-height: 300px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Thêm Phim</h2>
        <!-- 
            Để upload file, cần method="post" và enctype="multipart/form-data"
        -->
        <form action="<%= request.getContextPath() %>/MainController" method="post" enctype="multipart/form-data">
            <input type="hidden" name="action" value="addMovie">
            <div class="form-group">
                <label for="name">Tên phim:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="actor">Diễn viên:</label>
                <input type="text" id="actor" name="actor">
            </div>
            <div class="form-group">
                <label for="category">Thể loại:</label>
                <input type="text" id="category" name="category">
            </div>
            <div class="form-group">
                <label for="time">Thời lượng (phút):</label>
                <input type="number" id="time" name="time">
            </div>
            <div class="form-group">
                <label for="language">Ngôn ngữ:</label>
                <input type="text" id="language" name="language">
            </div>
            <div class="form-group">
                <label for="image">Tên file ảnh (tuỳ chọn):</label>
                <input type="text" id="image" name="image">
            </div>
            <div class="form-group">
                <label for="imageFile">Chọn ảnh từ máy tính:</label>
                <input type="file" id="imageFile" name="imageFile" accept="image/*" onchange="previewFile(event)">
            </div>
            <div class="form-group">
                <label for="imageURL">Hoặc nhập đường dẫn ảnh:</label>
                <input type="text" id="imageFile" name="imageFile" placeholder="Nhập URL ảnh" onchange="previewURL()">
            </div>
            <div class="form-group">
                <img id="imgPreview" class="preview" src="#" alt="Xem trước ảnh" style="display: none;">
            </div>
            <div class="form-group">
                <label for="description">Mô tả:</label>
                <textarea id="description" name="description"></textarea>
            </div>
            <div class="form-group">
                <label for="isShowing">Đang chiếu:</label>
                <input type="checkbox" id="isShowing" name="isShowing">
            </div>
            <%
                String message = (String) request.getAttribute("message"); 
                 if (message != null) {
            %>
            <p class="message"><%=message.equals("null") ? "" : message%></p>
            <%}%>
            <div class="button-container">
                <input type="submit" class="form-button">
            </div>
            <div class="button-container">
                <button type="button" class="form-button back-button" onclick="window.location.href='<%= request.getContextPath() %>/views/home.jsp'">Trở Về Trang Chủ</button>
            </div>
        </form>
            
    </div>
    
    <script>
        // Xem trước file upload từ máy
        function previewFile(event) {
            const input = event.target;
            const preview = document.getElementById('imgPreview');
            if (input.files && input.files[0]) {
                const reader = new FileReader();
                reader.onload = function(e) {
                    preview.src = e.target.result;
                    preview.style.display = 'block';
                }
                reader.readAsDataURL(input.files[0]);
            }
        }
        
        // Xem trước ảnh theo đường dẫn URL được nhập
        function previewURL() {
            const urlInput = document.getElementById('imageURL');
            const preview = document.getElementById('imgPreview');
            const url = urlInput.value.trim();
            if (url) {
                preview.src = url;
                preview.style.display = 'block';
            } else {
                preview.src = "#";
                preview.style.display = 'none';
            }
        }
        let base64Image = "";

    function convertImageToBase64() {
        var file = document.getElementById("imageFile").files[0];
        var reader = new FileReader();
        
        reader.onloadend = function () {
            base64Image = reader.result.split(",")[1]; // Lấy phần Base64 của ảnh
            document.getElementById("imagePreview").src = reader.result;
            document.getElementById("imagePreview").style.display = 'block';
        };

        if (file) {
            reader.readAsDataURL(file);
        }
    }
    </script>
</body>
</html>