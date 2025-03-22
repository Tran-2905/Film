package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.Movie;
import java.util.List;

public final class movies_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Danh sách phim</title>\n");
      out.write("        <style>\n");
      out.write("            /* Phần tử chứa phim */\n");
      out.write("            body {\n");
      out.write("                background: linear-gradient(to bottom, #4a0080, #8a2be2);\n");
      out.write("                height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("            .movie-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                gap: 20px; /* Khoảng cách giữa các ảnh */\n");
      out.write("                flex-wrap: nowrap; /* Đảm bảo ảnh luôn trên một hàng */\n");
      out.write("                overflow-x: auto; /* Nếu quá 4 ảnh thì có thể cuộn ngang */\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie {\n");
      out.write("                position: relative;\n");
      out.write("                width: 250px; /* Định kích thước ảnh */\n");
      out.write("                height: 370px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                transition: transform 0.3s ease, box-shadow 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie img {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie:hover {\n");
      out.write("                transform: scale(1.1); /* Phóng to ảnh khi hover */\n");
      out.write("                box-shadow: 0 15px 30px rgba(0, 0, 0, 0.5); /* Bóng đổ khi hover */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Hiển thị mô tả khi hover */\n");
      out.write("            .movie .description {\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                opacity: 0;\n");
      out.write("                transition: opacity 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie:hover .description {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"movie-slider\">\n");
      out.write("            <button class=\"prev-btn\">&#10094;</button>\n");
      out.write("            <div class=\"movie-container\">\n");
      out.write("                <h2 class=\"section-title\">PHIM ĐANG CHIẾU</h2>\n");
      out.write("                <div class=\"movie-slider\">\n");
      out.write("                        ");

                            List<Movie> movies = (List<Movie>) request.getAttribute("movies");
                            if (movies != null && !movies.isEmpty()) {
                                for (Movie movie : movies) {
                        
      out.write("\n");
      out.write("                                    <div class=\"movie\">\n");
      out.write("                                        <div class=\"movie-img\">\n");
      out.write("                                            <img src=\"");
      out.print( movie.getImage() );
      out.write("\" alt=\"");
      out.print( movie.getName() );
      out.write("\">\n");
      out.write("                                            <div class=\"movie-overlay\">\n");
      out.write("                                                <button class=\"btn-trailer\">Xem Trailer</button>\n");
      out.write("                                                <button class=\"btn-ticket\">ĐẶT VÉ</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h3 class=\"movie-title\">");
      out.print( movie.getName() );
      out.write("</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"movie\">\n");
      out.write("                                        <div class=\"movie-img\">\n");
      out.write("                                            <img src=\"path/to/image.jpg\" alt=\"Movie Poster\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"movie-description\">\n");
      out.write("                                            <p>Đây là nội dung mô tả của bộ phim...</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                        ");

                                }
                            } else {
                        
      out.write("\n");
      out.write("                            <p>Không có phim nào.</p>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"next-btn\">&#10095;</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            const movieList = document.querySelector('.movie-list');\n");
      out.write("            const prevBtn = document.querySelector('.prev-btn');\n");
      out.write("            const nextBtn = document.querySelector('.next-btn');\n");
      out.write("\n");
      out.write("            let index = 0;\n");
      out.write("            const moviesPerSlide = 4; // Số phim trượt một lần\n");
      out.write("            const totalMovies = document.querySelectorAll('.movie').length;\n");
      out.write("            const maxIndex = Math.ceil(totalMovies / moviesPerSlide) - 1;\n");
      out.write("\n");
      out.write("            nextBtn.addEventListener('click', () => {\n");
      out.write("                if (index < maxIndex) {\n");
      out.write("                    index++;\n");
      out.write("                } else {\n");
      out.write("                    index = 0; // Reset về đầu\n");
      out.write("                }\n");
      out.write("                updateSlider();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            prevBtn.addEventListener('click', () => {\n");
      out.write("                if (index > 0) {\n");
      out.write("                    index--;\n");
      out.write("                } else {\n");
      out.write("                    index = maxIndex; // Trở về cuối\n");
      out.write("                }\n");
      out.write("                updateSlider();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function updateSlider() {\n");
      out.write("                const translateValue = -index * (moviesPerSlide * 270); // 270px per movie\n");
      out.write("                movieList.style.transform = `translateX(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${translateValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("px)`;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
