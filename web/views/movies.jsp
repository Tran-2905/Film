<%-- 
    Document   : movies
    Created on : Mar 19, 2025, 2:28:11 PM
    Author     : Admin
--%>

<%@page import="dto.Movie"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Danh sách phim</title>
        <style>
            body {
    background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);
    color: #fff;
    font-family: Arial, sans-serif;
    text-align: center;
}

.section-title {
    color: yellow;
    font-size: 24px;
    margin: 20px 0;
    font-weight: bold;
}

.movie-container {
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
}

.movie {
    background: rgba(0, 0, 0, 0.8);
    padding: 15px;
    border-radius: 10px;
    text-align: center;
    box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.2);
    transition: transform 0.3s;
    width: 220px;
}

.movie:hover {
    transform: scale(1.05);
}

.movie-img img {
    width: 100%;
    border-radius: 10px;
}

.movie-title {
    color: yellow;
    font-size: 18px;
    margin-top: 10px;
    font-weight: bold;
}

.movie-description {
    font-size: 14px;
    margin-top: 5px;
}

.btn-ticket {
    background: yellow;
    color: black;
    font-weight: bold;
    padding: 10px;
    border: none;
    cursor: pointer;
    border-radius: 5px;
    margin-top: 10px;
}

.btn-ticket:hover {
    background: #ffcc00;
}

.movie-slider {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 20px;
}

.prev-btn, .next-btn {
    background: yellow;
    border: none;
    padding: 10px;
    font-size: 18px;
    cursor: pointer;
    border-radius: 50%;
}

.prev-btn:hover, .next-btn:hover {
    background: #ffcc00;
}
        </style>
    </head>
    <body>
        <h2 class="section-title">PHIM ĐANG CHIẾU</h2>
    <div class="movie-slider">
        <button class="prev-btn">&#10094;</button>
        <div class="movie-container">
            <%
                List<Movie> movies = (List<Movie>) request.getAttribute("movies");
                if (movies != null && !movies.isEmpty()) {
                    for (Movie movie : movies) {
            %>
                        <div class="movie">
                            <div class="movie-img">
                                <img src="<%= movie.getImage() %>" alt="<%= movie.getName() %>">
                            </div>
                            <h3 class="movie-title"><%= movie.getName() %></h3>
                            <p class="movie-description">Thể loại: <%= movie.getCategory() %></p>
                            <p class="movie-description">Thời gian: <%= movie.getTime() %> phút</p>
                            <button class="btn-ticket">ĐẶT VÉ</button>
                        </div>
            <%
                    }
                } else {
            %>
                <p>Không có phim nào.</p>
            <%
                }
            %>
        </div>
        <button class="next-btn">&#10095;</button>
    </div>

        <script>
            const movieList = document.querySelector('.movie-list');
            const prevBtn = document.querySelector('.prev-btn');
            const nextBtn = document.querySelector('.next-btn');

            let index = 0;
            const moviesPerSlide = 4; // Số phim trượt một lần
            const totalMovies = document.querySelectorAll('.movie').length;
            const maxIndex = Math.ceil(totalMovies / moviesPerSlide) - 1;

            nextBtn.addEventListener('click', () => {
                if (index < maxIndex) {
                    index++;
                } else {
                    index = 0; // Reset về đầu
                }
                updateSlider();
            });

            prevBtn.addEventListener('click', () => {
                if (index > 0) {
                    index--;
                } else {
                    index = maxIndex; // Trở về cuối
                }
                updateSlider();
            });

            function updateSlider() {
                const translateValue = -index * (moviesPerSlide * 270); // 270px per movie
                movieList.style.transform = `translateX(${translateValue}px)`;
            }
        </script>
    </body>
</html>
