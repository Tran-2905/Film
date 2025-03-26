package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
