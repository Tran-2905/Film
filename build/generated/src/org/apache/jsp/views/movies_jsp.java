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
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background: linear-gradient(to bottom, #2a0845, #6441a5);\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-slider {\n");
      out.write("                position: relative;\n");
      out.write("                width: 80%;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-container {\n");
      out.write("                display: flex;\n");
      out.write("                width: 100%;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-list {\n");
      out.write("                display: flex;\n");
      out.write("                transition: transform 0.5s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie {\n");
      out.write("                width: 250px;\n");
      out.write("                margin: 0 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                background: white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie img {\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                background: yellow;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: none;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Nút trái/phải */\n");
      out.write("            .prev-btn, .next-btn {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translateY(-50%);\n");
      out.write("                background: rgba(255, 255, 255, 0.5);\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .prev-btn { left: 10px; }\n");
      out.write("            .next-btn { right: 10px; }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"movie-slider\">\n");
      out.write("            <button class=\"prev-btn\">&#10094;</button> <!-- Nút trước -->\n");
      out.write("            <div class=\"movie-container\">\n");
      out.write("                <div class=\"movie-list\">\n");
      out.write("                    ");
 List<Movie> movies = (List<Movie>) request.getAttribute("movies");
                       if (movies != null) {
                           for (Movie movie : movies) { 
      out.write("\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <img src=\"data:image/jpeg;base64,");
      out.print( java.util.Base64.getEncoder().encodeToString(movie.getImage()) );
      out.write("\" alt=\"");
      out.print( movie.getName() );
      out.write("\">\n");
      out.write("                            <h3>");
      out.print( movie.getName() );
      out.write("</h3>\n");
      out.write("                            <button class=\"btn\">Đặt Vé</button>\n");
      out.write("                        </div>\n");
      out.write("                    ");
 } } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"next-btn\">&#10095;</button> <!-- Nút tiếp theo -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        const movieList = document.querySelector('.movie-list');\n");
      out.write("        const prevBtn = document.querySelector('.prev-btn');\n");
      out.write("        const nextBtn = document.querySelector('.next-btn');\n");
      out.write("\n");
      out.write("        let index = 0;\n");
      out.write("        const moviesPerSlide = 4;\n");
      out.write("        const totalMovies = document.querySelectorAll('.movie').length;\n");
      out.write("\n");
      out.write("        nextBtn.addEventListener('click', () => {\n");
      out.write("            if (index < totalMovies - moviesPerSlide) {\n");
      out.write("                index++;\n");
      out.write("            } else {\n");
      out.write("                index = 0; // Quay lại đầu khi hết phim\n");
      out.write("            }\n");
      out.write("            movieList.style.transform = `translateX(-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index * 270}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("px)`;\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        prevBtn.addEventListener('click', () => {\n");
      out.write("            if (index > 0) {\n");
      out.write("                index--;\n");
      out.write("            } else {\n");
      out.write("                index = totalMovies - moviesPerSlide; // Quay về cuối nếu đang ở đầu\n");
      out.write("            }\n");
      out.write("            movieList.style.transform = `translateX(-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index * 270}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("px)`;\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
