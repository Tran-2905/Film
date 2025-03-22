package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background: linear-gradient(to bottom, #4a148c, #7b1fa2);\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-form {\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\n");
      out.write("                padding: 30px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);\n");
      out.write("                text-align: center;\n");
      out.write("                width: 350px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-form h2 {\n");
      out.write("                color: #ffffff;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .Form-register {\n");
      out.write("                text-align: left;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .Form-register label {\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #e1bee7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .Form-register input {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-top: 5px;\n");
      out.write("                border: 1px solid #ba68c8;  /* Viền tím nhạt */\n");
      out.write("                border-radius: 5px;\n");
      out.write("                outline: none;\n");
      out.write("                background: white;  /* Nền trắng */\n");
      out.write("                color: black;  /* Chữ màu đen */\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .Form-register input::placeholder {\n");
      out.write("                color: #666; /* Placeholder màu xám */\n");
      out.write("            }\n");
      out.write("            button[type=\"submit\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #d500f9;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background 0.3s ease;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button[type=\"submit\"]:hover {\n");
      out.write("                background-color: #aa00ff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Nút Đăng nhập */\n");
      out.write("            .login-text {\n");
      out.write("                color: #e1bee7;\n");
      out.write("                font-size: 14px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-btn {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #8e24aa; /* Tím nhạt hơn */\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: background 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-btn:hover {\n");
      out.write("                background-color: #ab47bc; /* Tím sáng hơn khi hover */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Hiển thị thông báo */\n");
      out.write("            .message {\n");
      out.write("                color: #ffcc00;\n");
      out.write("                font-size: 14px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"register-form\">\n");
      out.write("        <h2>Đăng ký</h2>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"register\">\n");
      out.write("\n");
      out.write("            <div class=\"Form-register\">\n");
      out.write("                <label for=\"UserName\">User Name:</label>\n");
      out.write("                <input type=\"text\" name=\"txtUser\" id=\"UserName\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Form-register\">\n");
      out.write("                <label for=\"fullName\">Full Name:</label>\n");
      out.write("                <input type=\"text\" name=\"txtFullName\" id=\"fullName\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Form-register\">\n");
      out.write("                <label for=\"email\">Email:</label>\n");
      out.write("                <input type=\"text\" name=\"txtEmail\" id=\"email\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Form-register\">\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" name=\"txtPassword\" id=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"Form-register\">\n");
      out.write("                <label for=\"passwordAgain\">Password Again:</label>\n");
      out.write("                <input type=\"password\" name=\"txtPasswordAgain\" id=\"passwordAgain\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Đăng ký</button>\n");
      out.write("            ");

                String message = request.getAttribute("message")+""; 
            
      out.write("\n");
      out.write("            <p class=\"message\">");
      out.print(message.equals("null") ? "" : message);
      out.write("</p>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <p class=\"login-text\">Đã có tài khoản?</p>\n");
      out.write("        <a href=\"views/login.jsp\" class=\"login-btn\">Đăng nhập</a>\n");
      out.write("    </div>\n");
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
