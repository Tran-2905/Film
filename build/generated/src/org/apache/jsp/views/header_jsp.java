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
      out.write("            }        \n");
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
      out.write("            ");
 if (user==null) { 
      out.write("\n");
      out.write("                <div class=\"user-actions\">\n");
      out.write("                    <a href=\"views/login.jsp\" class=\"login-btn\">\n");
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
      out.write("                    <form action=\"MainController\" method=\"post\" style=\"margin: 0;\">\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"logout\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Đăng xuất\" class=\"logout-btn\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("</body>\n");
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
