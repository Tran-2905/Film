package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addMovie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Add Movie</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: linear-gradient(135deg, #6A0DAD, #9F2BFF);\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 500px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            background: #1E1B29;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0,0,0,0.5);\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"number\"],\n");
      out.write("        textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        input[type=\"file\"] {\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("        .button-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .form-button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #FF00FF;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("        }\n");
      out.write("        .form-button:hover {\n");
      out.write("            background-color: #E600E6;\n");
      out.write("        }\n");
      out.write("        .back-button {\n");
      out.write("            background-color: #00BFFF;\n");
      out.write("        }\n");
      out.write("        .back-button:hover {\n");
      out.write("            background-color: #009ACD;\n");
      out.write("        }\n");
      out.write("        .preview {\n");
      out.write("            margin-top: 10px;\n");
      out.write("            max-width: 100%;\n");
      out.write("            max-height: 300px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Thêm Phim</h2>\n");
      out.write("        <!-- \n");
      out.write("            Để upload file, cần method=\"post\" và enctype=\"multipart/form-data\"\n");
      out.write("        -->\n");
      out.write("        <form action=\"MainController\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"addMovie\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Tên phim:</label>\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"actor\">Diễn viên:</label>\n");
      out.write("                <input type=\"text\" id=\"actor\" name=\"actor\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"category\">Thể loại:</label>\n");
      out.write("                <input type=\"text\" id=\"category\" name=\"category\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"time\">Thời lượng (phút):</label>\n");
      out.write("                <input type=\"number\" id=\"time\" name=\"time\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"language\">Ngôn ngữ:</label>\n");
      out.write("                <input type=\"text\" id=\"language\" name=\"language\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"image\">Tên file ảnh (tuỳ chọn):</label>\n");
      out.write("                <input type=\"text\" id=\"image\" name=\"image\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"imageFile\">Chọn ảnh từ máy tính:</label>\n");
      out.write("                <input type=\"file\" id=\"imageFile\" name=\"imageFile\" accept=\"image/*\" onchange=\"previewFile(event)\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"imageURL\">Hoặc nhập đường dẫn ảnh:</label>\n");
      out.write("                <input type=\"text\" id=\"imageFile\" name=\"imageFile\" placeholder=\"Nhập URL ảnh\" onchange=\"previewURL()\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <img id=\"imgPreview\" class=\"preview\" src=\"#\" alt=\"Xem trước ảnh\" style=\"display: none;\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"description\">Mô tả:</label>\n");
      out.write("                <textarea id=\"description\" name=\"description\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"isShowing\">Đang chiếu:</label>\n");
      out.write("                <input type=\"checkbox\" id=\"isShowing\" name=\"isShowing\">\n");
      out.write("            </div>\n");
      out.write("            ");

                String message = (String) request.getAttribute("message"); 
                 if (message != null) {
            
      out.write("\n");
      out.write("            <p class=\"message\">");
      out.print(message.equals("null") ? "" : message);
      out.write("</p>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <div class=\"button-container\">\n");
      out.write("                <input type=\"submit\" class=\"form-button\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button-container\">\n");
      out.write("                <button type=\"button\" class=\"form-button back-button\" onclick=\"window.location.href='");
      out.print( request.getContextPath() );
      out.write("/views/home.jsp'\">Trở Về Trang Chủ</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        // Xem trước file upload từ máy\n");
      out.write("        function previewFile(event) {\n");
      out.write("            const input = event.target;\n");
      out.write("            const preview = document.getElementById('imgPreview');\n");
      out.write("            if (input.files && input.files[0]) {\n");
      out.write("                const reader = new FileReader();\n");
      out.write("                reader.onload = function(e) {\n");
      out.write("                    preview.src = e.target.result;\n");
      out.write("                    preview.style.display = 'block';\n");
      out.write("                }\n");
      out.write("                reader.readAsDataURL(input.files[0]);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        // Xem trước ảnh theo đường dẫn URL được nhập\n");
      out.write("        function previewURL() {\n");
      out.write("            const urlInput = document.getElementById('imageURL');\n");
      out.write("            const preview = document.getElementById('imgPreview');\n");
      out.write("            const url = urlInput.value.trim();\n");
      out.write("            if (url) {\n");
      out.write("                preview.src = url;\n");
      out.write("                preview.style.display = 'block';\n");
      out.write("            } else {\n");
      out.write("                preview.src = \"#\";\n");
      out.write("                preview.style.display = 'none';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        let base64Image = \"\";\n");
      out.write("\n");
      out.write("    function convertImageToBase64() {\n");
      out.write("        var file = document.getElementById(\"imageFile\").files[0];\n");
      out.write("        var reader = new FileReader();\n");
      out.write("        \n");
      out.write("        reader.onloadend = function () {\n");
      out.write("            base64Image = reader.result.split(\",\")[1]; // Lấy phần Base64 của ảnh\n");
      out.write("            document.getElementById(\"imagePreview\").src = reader.result;\n");
      out.write("            document.getElementById(\"imagePreview\").style.display = 'block';\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        if (file) {\n");
      out.write("            reader.readAsDataURL(file);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
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
