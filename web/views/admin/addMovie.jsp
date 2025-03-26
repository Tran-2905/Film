<%-- 
    Document   : addMovie
    Created on : Mar 19, 2025, 5:04:36 PM
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
            }.file-info {
                color: yellow;
                font-size: 0.9em;
                margin-top: 5px;
            }

        </style>
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope.user.role eq 'admin'}">
                <%
                    String id = request.getParameter("id");
                    MovieDAO dao = new MovieDAO();
                    Movie movie = dao.getMovieByID(id); // Chỉ khai báo 1 lần

                    if (movie == null) {
                        movie = new Movie(); // Nếu không tìm thấy phim, tạo đối tượng rỗng
                    }
                    request.setAttribute("movie", movie);
                %>
                <div class="container">
                    welcome, ${movie.id}
                    <form action="${pageContext.request.contextPath}/addMovieController" method="post" enctype="multipart/form-data">
                        <input type="hidden" name="action" value="addMovie">
                        <input type="hidden" name="id" value="${movie.id}"/>
                        <div class="form-group">
                            <label for="name">Tên phim:</label>
                            <input type="text" id="name" name="txtname" value="${movie.name}"required/>
                        </div>
                        <div class="form-group">
                            <label for="actor">Diễn viên:</label>
                            <input type="text" id="actor" name="actor" value="${movie.actor}">
                        </div>
                        <div class="form-group">
                            <label for="category">Thể loại:</label>
                            <input type="text" id="category" name="category" value="${movie.category}"/>
                        </div>
                        <div class="form-group">
                            <label for="time">Thời lượng (phút):</label>
                            <input type="number" id="time" name="time" value="90" min="1" value="${movie.time}"/>
                        </div>
                        <div class="form-group">
                            <label for="language">Ngôn ngữ:</label>
                            <input type="text" id="language" name="language" value="${movie.language}"/>
                        </div>
                        <div class="form-group">
                            <label for="txtImage">Book Cover Image:</label>
                            <input type="hidden" id="txtImage" name="txtImage" value="${movie.image}"/>
                            <div class="upload-container">
                                <div class="file-upload-wrapper">
                                    <button type="button" class="file-upload-button">Choose an Image</button>
                                    <input type="file" id="imageUpload" class="file-upload-input" accept="image/*"/>
                                </div>
                                <div class="file-info" id="fileInfo">No file selected</div>
                                <div class="progress-bar-container" id="progressContainer">
                                    <div class="progress-bar" id="progressBar"></div>
                                </div>
                            </div>
                            <c:if test="${not empty requestScope.txtImage_error}">
                                <div class="error-message">${requestScope.txtImage_error}</div>
                            </c:if>
                            <div class="image-preview" id="imagePreview">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="description">Mô tả:</label>
                            <textarea id="description" name="description"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="isShowing">Đang chiếu:</label>
                            <input type="checkbox" id="isShowing" name="isShowing">
                        </div>
                        <div class="button-container">
                            <input type="submit" id="sub"class="form-button">
                        </div>
                        <%
                            String Error = (String) request.getAttribute("ERROR");
                            if (Error != null) {
                        %>
                        <p class="message"><%=Error.equals("null") ? "" : Error%></p>
                        <%}%>
                        <%
                            String message = (String) request.getAttribute("message");
                            if (message != null) {
                        %>
                        <p class="message"><%=message.equals("null") ? "" : message%></p>
                        <%}%>

                    </form>
                    <div class="button-container">
                        <button type="button" class="form-button back-button" onclick="window.location.href = '<%= request.getContextPath()%>/views/home.jsp'">Trở Về Trang Chủ</button>
                    </div>
                </div>
            </c:when>
            <c:otherwise>
                <script>
                    alert("You are not admin! Redirecting to login page.");
                    window.location.href = "login.jsp";
                </script>
            </c:otherwise>
        </c:choose>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script>
                            $(document).ready(function () {
                                // Hiển thị tên file khi chọn file
                                $('#imageUpload').change(function () {
                                    const file = this.files[0];
                                    if (file) {
                                        // Kiểm tra xem file có phải là hình ảnh không
                                        if (!file.type.match('image.*')) {
                                            alert('Please select an image file (JPEG, PNG, GIF, etc.)');
                                            this.value = '';
                                            $('#fileInfo').text('No file selected');
                                            return;
                                        }

                                        // Hiển thị tên file và kích thước
                                        const fileSize = (file.size / 1024).toFixed(2) + ' KB';
                                        $('#fileInfo').text(file.name + ' (' + fileSize + ')');

                                        // Hiển thị thanh tiến trình và bắt đầu chuyển đổi sang Base64
                                        $('#progressContainer').show();

                                        // Thiết lập FileReader để đọc file và chuyển đổi sang Base64
                                        const reader = new FileReader();

                                        reader.onprogress = function (event) {
                                            if (event.lengthComputable) {
                                                const percentLoaded = Math.round((event.loaded / event.total) * 100);
                                                $('#progressBar').css('width', percentLoaded + '%');
                                            }
                                        };

                                        reader.onload = function (e) {
                                            // Hoàn thành tiến trình
                                            $('#progressBar').css('width', '100%');

                                            // Lưu trữ dữ liệu Base64 vào input ẩn
                                            const base64String = e.target.result;
                                            $('#txtImage').val(base64String);

                                            // Hiển thị hình ảnh xem trước
                                            $('#imagePreview').html('<img src="' + base64String + '" alt="Preview">');

                                            // Ẩn thanh tiến trình sau 1 giây
                                            setTimeout(function () {
                                                $('#progressContainer').hide();
                                                $('#progressBar').css('width', '0%');
                                            }, 1000);
                                        };

                                        reader.onerror = function () {
                                            alert('Error reading the file. Please try again.');
                                            $('#progressContainer').hide();
                                            $('#progressBar').css('width', '0%');
                                            $('#fileInfo').text('No file selected');
                                        };

                                        // Bắt đầu đọc file và chuyển đổi sang Base64
                                        reader.readAsDataURL(file);
                                    } else {
                                        $('#fileInfo').text('No file selected');
                                    }
                                });

                                // Xử lý nút Reset
                                $('#resetBtn').click(function () {
                                    $('#imagePreview').empty();
                                    $('#fileInfo').text('No file selected');
                                    $('#txtImage').val('');
                                    $('#progressContainer').hide();
                                    $('#progressBar').css('width', '0%');
                                });

                                // Để chọn lại file đã tải lên trước đó (nếu có)
                                const existingImageSrc = $('#imagePreview img').attr('src');
                                if (existingImageSrc) {
                                    $('#txtImage').val(existingImageSrc);
                                }
                            });
        </script>
    </body>
</html>