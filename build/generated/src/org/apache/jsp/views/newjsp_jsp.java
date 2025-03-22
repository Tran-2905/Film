package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Danh sách phim</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    background: linear-gradient(to right, #0b0d19, #241a48);\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding-top: 80px; /* Để không bị header che */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    width: 90%;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("    font-size: 26px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color: #FFD700;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Danh sách phim */\n");
      out.write(".movie-list {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    gap: 15px;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Mỗi phim */\n");
      out.write(".movie {\n");
      out.write("    background: #1c1b29;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    padding: 15px;\n");
      out.write("    width: 250px;\n");
      out.write("    text-align: center;\n");
      out.write("    transition: transform 0.3s ease-in-out;\n");
      out.write("    box-shadow: 0 4px 8px rgba(255, 255, 255, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie:hover {\n");
      out.write("    transform: scale(1.05);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie img {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 370px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    object-fit: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie h3 {\n");
      out.write("    font-size: 18px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    color: #FFD700;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie p {\n");
      out.write("    font-size: 14px;\n");
      out.write("    margin: 5px 0;\n");
      out.write("    color: #ecf0f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Nút đặt vé */\n");
      out.write(".btn {\n");
      out.write("    background: #FFD700;\n");
      out.write("    color: black;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 15px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    cursor: pointer;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    transition: background 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    background: #d4ac0d;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Phim đang chiếu</h2>\n");
      out.write("        <div class=\"movie-list\">\n");
      out.write("            <div class=\"movie\">\n");
      out.write("                <img src=\"image/movie1.jpg\" alt=\"Phim 1\">\n");
      out.write("                <h3>QUỶ NHẬP TRÀNG (T18)</h3>\n");
      out.write("                <p>Thể loại: Kinh dị</p>\n");
      out.write("                <p>Thời gian: 120 phút</p>\n");
      out.write("                <button class=\"btn\">ĐẶT VÉ</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"movie\">\n");
      out.write("                <img src=\"image/movie2.jpg\" alt=\"Phim 2\">\n");
      out.write("                <h3>SÁT THỦ VÔ CÙNG CỰC HÀI (T16)</h3>\n");
      out.write("                <p>Thể loại: Hài, hành động</p>\n");
      out.write("                <p>Thời gian: 100 phút</p>\n");
      out.write("                <button class=\"btn\">ĐẶT VÉ</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"movie\">\n");
      out.write("                <img src=\"image/movie3.jpg\" alt=\"Phim 3\">\n");
      out.write("                <h3>NHÀ GIA TIÊN (T18)</h3>\n");
      out.write("                <p>Thể loại: Kinh dị, tâm lý</p>\n");
      out.write("                <p>Thời gian: 110 phút</p>\n");
      out.write("                <button class=\"btn\">ĐẶT VÉ</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"movie\">\n");
      out.write("                <img src=\"image/movie4.jpg\" alt=\"Phim 4\">\n");
      out.write("                <h3>NGHI LỄ TRỤC QUỶ (T18)</h3>\n");
      out.write("                <p>Thể loại: Kinh dị</p>\n");
      out.write("                <p>Thời gian: 90 phút</p>\n");
      out.write("                <button class=\"btn\">ĐẶT VÉ</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
