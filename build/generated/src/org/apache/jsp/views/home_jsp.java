package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.MovieDAO;
import dto.Movie;
import java.util.List;
import dto.User;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/views/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin-top: 100px;\n");
      out.write("                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);\n");
      out.write("            }\n");
      out.write("            .button-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                margin-top: 20px; /* Đẩy xuống thêm một chút */\n");
      out.write("                position: relative;\n");
      out.write("                z-index: 10;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-movie-button {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: white;\n");
      out.write("                background: linear-gradient(135deg, #FF00FF, #E600E6);\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background 0.3s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-movie-button:hover {\n");
      out.write("                background: linear-gradient(135deg, #E600E6, #C400C4);\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);\n");
      out.write("                color: #fff;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("                height: 900px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .section-title {\n");
      out.write("                color: yellow;\n");
      out.write("                font-size: 24px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                gap: 20px;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie {\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\n");
      out.write("                padding: 15px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.2);\n");
      out.write("                transition: transform 0.3s;\n");
      out.write("                width: 220px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie:hover {\n");
      out.write("                transform: scale(1.05);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-img img {\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-title {\n");
      out.write("                color: yellow;\n");
      out.write("                font-size: 18px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-description {\n");
      out.write("                font-size: 14px;\n");
      out.write("                margin-top: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-ticket {\n");
      out.write("                background: yellow;\n");
      out.write("                color: black;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-ticket:hover {\n");
      out.write("                background: #ffcc00;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .movie-slider {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                gap: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .prev-btn, .next-btn {\n");
      out.write("                background: yellow;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .prev-btn:hover, .next-btn:hover {\n");
      out.write("                background: #ffcc00;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Header</title>\n");
      out.write("    <style>\n");
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #0b0d19;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            z-index: 1000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* LOGO */\n");
      out.write("        .logo-img {\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* BUTTONS */\n");
      out.write("        .btn {\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: bold;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 5px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .yellow {\n");
      out.write("            background-color: #FFD700;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .purple {\n");
      out.write("            background-color: #6A0DAD;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* SEARCH BAR */\n");
      out.write("        .search-bar {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            border: 2px solid black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-bar input {\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            padding: 5px;\n");
      out.write("            width: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-icon {\n");
      out.write("            width: 20px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* USER ACTIONS */\n");
      out.write("        .user-actions {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 10px;\n");
      out.write("            color: white;\n");
      out.write("            background: #0b0d19;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 10px;    \n");
      out.write("            box-shadow: 0px 4px 10px rgba(0,0,0,0.5);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .icon {\n");
      out.write("            width: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .flag-icon {\n");
      out.write("            width: 25px;\n");
      out.write("        }\n");
      out.write("        .login-btn {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: yellow;\n");
      out.write("            text-decoration: none; /* Bỏ gạch dưới */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-btn .icon {\n");
      out.write("            width: 20px;\n");
      out.write("            height: 20px;\n");
      out.write("            margin-right: 5px;\n");
      out.write("            filter: invert(100%);\n");
      out.write("        }\n");
      out.write("        .user-section {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                gap: 20px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .welcome-text {\n");
      out.write("                /* Màu vàng cho chữ “Xin chào” và tên user */\n");
      out.write("                color: #FFD700;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logout-btn {\n");
      out.write("                /* CSS cho nút Đăng xuất */\n");
      out.write("                background-color: #ff4b2b;  /* Chọn màu nền tùy ý */\n");
      out.write("                color: #ffffff;            /* Màu chữ */\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-weight: bold;\n");
      out.write("                transition: background-color 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logout-btn:hover {\n");
      out.write("                background-color: #e33e1f; /* Màu nền khi hover */\n");
      out.write("            }     \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        User user = (User) session.getAttribute("user");
    
      out.write("\n");
      out.write("    <header class=\"navbar\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img src=\"");
      out.print( request.getContextPath() );
      out.write("/image/logoCinestart.png\" alt=\"Logo\" class=\"logo-img\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <nav class=\"nav-links\">\n");
      out.write("            <button class=\"btn yellow\">\n");
      out.write("                <img src=\"ticket-icon.png\" alt=\"Ticket\" class=\"icon\">\n");
      out.write("                ĐẶT VÉ NGAY\n");
      out.write("            </button>\n");
      out.write("            <button class=\"btn purple\">\n");
      out.write("                <img src=\"popcorn-icon.png\" alt=\"Popcorn\" class=\"icon\">\n");
      out.write("                ĐẶT BẮP NƯỚC\n");
      out.write("            </button>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"search-bar\">\n");
      out.write("            <input type=\"text\" placeholder=\"Tìm phim, rạp\">\n");
      out.write("            <img src=\"");
      out.print( request.getContextPath() );
      out.write("/image/searchbutton.png\" width=\"400\" height=\"16\" alt=\"Search\" class=\"search-icon\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            ");
 if (user==null) { 
      out.write("\n");
      out.write("                <div class=\"user-actions\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/login.jsp\" class=\"login-btn\">\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath() );
      out.write("/image/iconuser.jpg\" alt=\"User\" class=\"icon\">\n");
      out.write("                        Đăng nhập\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            ");
}else{ 
      out.write("\n");
      out.write("                <div class=\"user-section\">\n");
      out.write("                    <span class=\"welcome-text\">Xin chào, <span class=\"user-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>!</span>\n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController\" method=\"post\" style=\"margin: 0;\">\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"logout\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Đăng xuất\" class=\"logout-btn\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.getRole eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"button-container\">\n");
          out.write("                    <button class=\"add-movie-button\" onclick=\"location.href = '");
          out.print( request.getContextPath());
          out.write("/views/admin/addMovie.jsp'\">➕ Thêm Phim</button>\n");
          out.write("                </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h2 class=\"section-title\">PHIM ĐANG CHIẾU</h2>\n");
      out.write("                <div class=\"movie-slider\">\n");
      out.write("                    <button class=\"prev-btn\">&#10094;</button>\n");
      out.write("                    <div class=\"movie-container\">\n");
      out.write("                        ");

                            MovieDAO movieDAO = new MovieDAO();
                            List<Movie> movies = movieDAO.getAllMovies();
                            if (movies != null && !movies.isEmpty()) {
                                for (Movie movie : movies) {
                        
      out.write("\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-img\">\n");
      out.write("                                <img src=\"");
      out.print( movie.getImage());
      out.write("\" alt=\"");
      out.print( movie.getName());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <h3 class=\"movie-title\">");
      out.print( movie.getName());
      out.write("</h3>\n");
      out.write("                            <p class=\"movie-description\">Thể loại: ");
      out.print( movie.getCategory());
      out.write("</p>\n");
      out.write("                            <p class=\"movie-description\">Thời gian: ");
      out.print( movie.getTime());
      out.write(" phút</p>\n");
      out.write("                            <button class=\"btn-ticket\">ĐẶT VÉ</button>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        } else {
                        
      out.write("\n");
      out.write("                        <p>Không có phim nào.</p>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"next-btn\">&#10095;</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
