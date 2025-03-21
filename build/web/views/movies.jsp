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
                font-family: Arial, sans-serif;
                background: linear-gradient(to bottom, #2a0845, #6441a5);
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }

            .movie-slider {
                position: relative;
                width: 80%;
                overflow: hidden;
            }

            .movie-container {
                display: flex;
                width: 100%;
                overflow: hidden;
            }

            .movie-list {
                display: flex;
                transition: transform 0.5s ease-in-out;
            }

            .movie {
                width: 250px;
                margin: 0 10px;
                text-align: center;
                background: white;
                border-radius: 10px;
                padding: 10px;
            }

            .movie img {
                width: 100%;
                border-radius: 10px;
            }

            .btn {
                background: yellow;
                padding: 10px;
                border: none;
                font-size: 16px;
                cursor: pointer;
                margin-top: 10px;
            }

            /* Nút trái/phải */
            .prev-btn, .next-btn {
                position: absolute;
                top: 50%;
                transform: translateY(-50%);
                background: rgba(255, 255, 255, 0.5);
                border: none;
                padding: 10px;
                cursor: pointer;
                font-size: 24px;
            }

            .prev-btn { left: 10px; }
            .next-btn { right: 10px; }
        </style>

    <body>
        <div class="movie-slider">
            <button class="prev-btn">&#10094;</button> <!-- Nút trước -->
            <div class="movie-container">
                <div class="movie-list">
                    <% List<Movie> movies = (List<Movie>) request.getAttribute("movies");
                       if (movies != null) {
                           for (Movie movie : movies) { %>
                        <div class="movie">
                            <img src="data:image/jpeg;base64,<%= java.util.Base64.getEncoder().encodeToString(movie.getImage()) %>" alt="<%= movie.getName() %>">
                            <h3><%= movie.getName() %></h3>
                            <button class="btn">Đặt Vé</button>
                        </div>
                    <% } } %>
                </div>
            </div>
            <button class="next-btn">&#10095;</button> <!-- Nút tiếp theo -->
        </div>

    <script>
        const movieList = document.querySelector('.movie-list');
        const prevBtn = document.querySelector('.prev-btn');
        const nextBtn = document.querySelector('.next-btn');

        let index = 0;
        const moviesPerSlide = 4;
        const totalMovies = document.querySelectorAll('.movie').length;

        nextBtn.addEventListener('click', () => {
            if (index < totalMovies - moviesPerSlide) {
                index++;
            } else {
                index = 0; // Quay lại đầu khi hết phim
            }
            movieList.style.transform = `translateX(-${index * 270}px)`;
        });

        prevBtn.addEventListener('click', () => {
            if (index > 0) {
                index--;
            } else {
                index = totalMovies - moviesPerSlide; // Quay về cuối nếu đang ở đầu
            }
            movieList.style.transform = `translateX(-${index * 270}px)`;
        });
    </script>
    </body>
</html>
