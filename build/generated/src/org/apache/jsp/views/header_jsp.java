package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.User;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
