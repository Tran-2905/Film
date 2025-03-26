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
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/views/header.jsp");
    _jspx_dependants.add("/views/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            body {\r\n");
      out.write("                margin-top: 100px;\r\n");
      out.write("                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);\r\n");
      out.write("            }\r\n");
      out.write("            .button-container {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                margin-top: 20px; /* Đẩy xuống thêm một chút */\r\n");
      out.write("                position: relative;\r\n");
      out.write("                z-index: 100;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .add-movie-button {\r\n");
      out.write("                padding: 10px 20px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: white;\r\n");
      out.write("                background: linear-gradient(135deg, #FF00FF, #E600E6);\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                transition: background 0.3s ease-in-out;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .add-movie-button:hover {\r\n");
      out.write("                background: linear-gradient(135deg, #E600E6, #C400C4);\r\n");
      out.write("            }\r\n");
      out.write("            body {\r\n");
      out.write("                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                height: 900px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .section-title {\r\n");
      out.write("                color: yellow;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                margin: 20px 0;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie-container {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                flex-wrap: wrap;\r\n");
      out.write("                gap: 20px;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie {\r\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.2);\r\n");
      out.write("                transition: transform 0.3s;\r\n");
      out.write("                width: 220px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie:hover {\r\n");
      out.write("                transform: scale(1.05);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie-img img {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie-title {\r\n");
      out.write("                color: yellow;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie-description {\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                margin-top: 5px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn-ticket {\r\n");
      out.write("                background: yellow;\r\n");
      out.write("                color: black;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn-ticket:hover {\r\n");
      out.write("                background: #ffcc00;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .movie-slider {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                gap: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .prev-btn, .next-btn {\r\n");
      out.write("                background: yellow;\r\n");
      out.write("                border: none;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .prev-btn:hover, .next-btn:hover {\r\n");
      out.write("                background: #ffcc00;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Header</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .body{\r\n");
      out.write("            margin-bottom: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar {\r\n");
      out.write("            display: flex\r\n");
      out.write(";\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            /* padding: 0px 0px; */\r\n");
      out.write("            background-color: #0b0d19;\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            z-index: 1000;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* LOGO */\r\n");
      out.write("        .logo-img {\r\n");
      out.write("            height: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* BUTTONS */\r\n");
      out.write("        .btn {\r\n");
      out.write("            padding: 10px 15px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            gap: 5px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .yellow {\r\n");
      out.write("            background-color: #FFD700;\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .purple {\r\n");
      out.write("            background-color: #6A0DAD;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* SEARCH BAR */\r\n");
      out.write("        .search-bar {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            background: white;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            padding: 5px 10px;\r\n");
      out.write("            border: 2px solid black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .search-bar input {\r\n");
      out.write("            border: none;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .search-icon {\r\n");
      out.write("            width: 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* USER ACTIONS */\r\n");
      out.write("        .user-actions {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            gap: 10px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            background: #0b0d19;\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            border-radius: 10px;    \r\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0,0,0,0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .icon {\r\n");
      out.write("            width: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .flag-icon {\r\n");
      out.write("            width: 25px;\r\n");
      out.write("        }\r\n");
      out.write("        .login-btn {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: yellow;\r\n");
      out.write("            text-decoration: none; /* B? g?ch d??i */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-btn .icon {\r\n");
      out.write("            width: 20px;\r\n");
      out.write("            height: 20px;\r\n");
      out.write("            margin-right: 5px;\r\n");
      out.write("            filter: invert(100%);\r\n");
      out.write("        }\r\n");
      out.write("        .user-section {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                gap: 20px;\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .welcome-text {\r\n");
      out.write("                /* Màu vàng cho ch? ?Xin chào? và tên user */\r\n");
      out.write("                color: #FFD700;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .logout-btn {\r\n");
      out.write("                /* CSS cho nút ??ng xu?t */\r\n");
      out.write("                background-color: #ff4b2b;  /* Ch?n màu n?n tùy ý */\r\n");
      out.write("                color: #ffffff;            /* Màu ch? */\r\n");
      out.write("                padding: 10px 15px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                transition: background-color 0.3s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .logout-btn:hover {\r\n");
      out.write("                background-color: #e33e1f; /* Màu n?n khi hover */\r\n");
      out.write("            }     \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        User user = (User) session.getAttribute("user");
    
      out.write("\r\n");
      out.write("    <header class=\"navbar\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.print( request.getContextPath() );
      out.write("/image/logoCinestart.png\" alt=\"Logo\" class=\"logo-img\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"nav-links\">\r\n");
      out.write("            <button class=\"btn yellow\">\r\n");
      out.write("                ĐẶT VÉ NGAY\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"btn purple\">\r\n");
      out.write("                ĐẶT BẮP NƯỚC\r\n");
      out.write("            </button>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"search-bar\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Tìm phim, rạp...\">\r\n");
      out.write("            <img src=\"");
      out.print( request.getContextPath() );
      out.write("/image/searchbutton.png\" width=\"400\" height=\"16\" alt=\"Search\" class=\"search-icon\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            ");
 if (user==null) { 
      out.write("\r\n");
      out.write("                <div class=\"user-actions\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/login.jsp\" class=\"login-btn\">\r\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath() );
      out.write("/image/iconuser.jpg\" alt=\"User\" class=\"icon\">\r\n");
      out.write("                        Đăng nhập\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("                <div class=\"user-section\">\r\n");
      out.write("                    <span class=\"welcome-text\">Xin chào, <span class=\"user-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>!</span>\r\n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController\" method=\"post\" style=\"margin: 0;\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"logout\"/>\r\n");
      out.write("                        <input type=\"submit\" value=\"??ng xu?t\" class=\"logout-btn\"/>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.role eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"button-container\">\r\n");
          out.write("                <button class=\"add-movie-button\" onclick=\"location.href = '");
          out.print( request.getContextPath());
          out.write("/views/admin/addMovie.jsp'\">➕ Thêm Phim</button>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div class=\"button-container\">\r\n");
          out.write("                ");
          if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("                <button class=\"add-movie-button\" onclick=\"window.location = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${updateMovieUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\">➕ Chỉnh Sửa Phim</button>\r\n");
          out.write("\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
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
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <h2 class=\"section-title\">PHIM ĐANG CHIẾU</h2>\r\n");
      out.write("            <div class=\"movie-slider\">\r\n");
      out.write("                <button class=\"prev-btn\">&#10094;</button>\r\n");
      out.write("                <div class=\"movie-container\">\r\n");
      out.write("                    ");

                        MovieDAO movieDAO = new MovieDAO();
                        List<Movie> movies = movieDAO.getAllMovies();
                        if (movies != null && !movies.isEmpty()) {
                            for (Movie movie : movies) {
                                if (movie.isIsShowing()) {
                    
      out.write("\r\n");
      out.write("                    <div class=\"movie\">\r\n");
      out.write("                        <div class=\"movie-img\">\r\n");
      out.write("                            <img src=\"");
      out.print( movie.getImage());
      out.write("\" alt=\"");
      out.print( movie.getName());
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h3 class=\"movie-title\">");
      out.print( movie.getName());
      out.write("</h3>\r\n");
      out.write("                        <p class=\"movie-description\">Thể loại: ");
      out.print( movie.getCategory());
      out.write("</p>\r\n");
      out.write("                        <p class=\"movie-description\">Thời gian: ");
      out.print( movie.getTime());
      out.write(" phút</p>\r\n");
      out.write("                        <form action=\"");
      out.print( request.getContextPath());
      out.write("/views/booking.jsp\" method=\"get\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"movieId\" value=\"");
      out.print( movie.getId());
      out.write("\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn-ticket\">ĐẶT VÉ</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      }
                        }
                    } else {
                    
      out.write("\r\n");
      out.write("                    <p>Không có phim nào.</p>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"next-btn\">&#10095;</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            const movieList = document.querySelector('.movie-list');\r\n");
      out.write("            const prevBtn = document.querySelector('.prev-btn');\r\n");
      out.write("            const nextBtn = document.querySelector('.next-btn');\r\n");
      out.write("\r\n");
      out.write("            let index = 0;\r\n");
      out.write("            const moviesPerSlide = 4; // Số phim trượt một lần\r\n");
      out.write("            const totalMovies = document.querySelectorAll('.movie').length;\r\n");
      out.write("            const maxIndex = Math.ceil(totalMovies / moviesPerSlide) - 1;\r\n");
      out.write("\r\n");
      out.write("            nextBtn.addEventListener('click', () => {\r\n");
      out.write("                if (index < maxIndex) {\r\n");
      out.write("                    index++;\r\n");
      out.write("                } else {\r\n");
      out.write("                    index = 0; // Reset về đầu\r\n");
      out.write("                }\r\n");
      out.write("                updateSlider();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            prevBtn.addEventListener('click', () => {\r\n");
      out.write("                if (index > 0) {\r\n");
      out.write("                    index--;\r\n");
      out.write("                } else {\r\n");
      out.write("                    index = maxIndex; // Trở về cuối\r\n");
      out.write("                }\r\n");
      out.write("                updateSlider();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            function updateSlider() {\r\n");
      out.write("                const translateValue = -index * (moviesPerSlide * 270); // 270px per movie\r\n");
      out.write("                movieList.style.transform = `translateX(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${translateValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("px)`;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-container\">\n");
      out.write("        <div class=\"footer-column\">\n");
      out.write("            <h3>TÀI KHOẢN</h3>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Đăng nhập</a></li>\n");
      out.write("                <li><a href=\"#\">Đăng ký</a></li>\n");
      out.write("                <li><a href=\"#\">Membership</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-column\">\n");
      out.write("            <h3>THUÊ SỰ KIỆN</h3>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Thuê rạp</a></li>\n");
      out.write("                <li><a href=\"#\">Các loại hình cho thuê khác</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-column\">\n");
      out.write("            <h3>DỊCH VỤ KHÁC</h3>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Nhà hàng</a></li>\n");
      out.write("                <li><a href=\"#\">Kidzone</a></li>\n");
      out.write("                <li><a href=\"#\">Bowling</a></li>\n");
      out.write("                <li><a href=\"#\">Billiards</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-column\">\n");
      out.write("            <h3>HỆ THỐNG RẠP</h3>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Tất cả hệ thống rạp</a></li>\n");
      out.write("                <li><a href=\"#\">Cinestar Quốc Thanh (TP.HCM)</a></li>\n");
      out.write("                <li><a href=\"#\">Cinestar Hai Bà Trưng (TP.HCM)</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    footer {\n");
      out.write("        background: #0B0B14; /* Đổi nền thành màu đen giống header */\n");
      out.write("        padding: 20px 0;\n");
      out.write("        color: white;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-container {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("        gap: 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-column {\n");
      out.write("        min-width: 200px;\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-column h3 {\n");
      out.write("        font-size: 18px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        color: #FFD700; /* Màu vàng giống nút \"Đăng nhập\" */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-column ul {\n");
      out.write("        list-style: none;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-column ul li {\n");
      out.write("        margin-bottom: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-column ul li a {\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 14px;\n");
      out.write("        transition: color 0.3s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-column ul li a:hover {\n");
      out.write("        color: #FFD700; /* Đổi sang màu vàng khi hover giống header */\n");
      out.write("    }\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_0.setVar("updateMovieUrl");
    _jspx_th_c_url_0.setValue("/MainController");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("action");
    _jspx_th_c_param_0.setValue("editMovie");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }
}
