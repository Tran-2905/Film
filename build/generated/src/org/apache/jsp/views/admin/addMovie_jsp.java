package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.Movie;

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
      out.write("        }.file-info {\n");
      out.write("            color: yellow;\n");
      out.write("            font-size: 0.9em;\n");
      out.write("            margin-top: 5px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

                    // Nếu không có bean trong request, tạo bean mới trước khi sử dụng jsp:useBean
                    Movie movie = new Movie();
                    if (request.getAttribute("movie") == null) {
                        request.setAttribute("movie", new Movie());
                        movie = new Movie();
                    } else {
                        movie = (Movie) request.getAttribute("movie");
                    }
                
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Thêm Phim</h2>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/addMovieController\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"addMovie\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Tên phim:</label>\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"txtname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"required/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"actor\">Diễn viên:</label>\n");
      out.write("                <input type=\"text\" id=\"actor\" name=\"actor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.actor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"category\">Thể loại:</label>\n");
      out.write("                <input type=\"text\" id=\"category\" name=\"category\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"time\">Thời lượng (phút):</label>\n");
      out.write("                <input type=\"number\" id=\"time\" name=\"time\" value=\"90\" min=\"1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"language\">Ngôn ngữ:</label>\n");
      out.write("                <input type=\"text\" id=\"language\" name=\"language\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtImage\">Book Cover Image:</label>\n");
      out.write("                <input type=\"hidden\" id=\"txtImage\" name=\"txtImage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <div class=\"upload-container\">\n");
      out.write("                    <div class=\"file-upload-wrapper\">\n");
      out.write("                        <button type=\"button\" class=\"file-upload-button\">Choose an Image</button>\n");
      out.write("                        <input type=\"file\" id=\"imageUpload\" class=\"file-upload-input\" accept=\"image/*\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"file-info\" id=\"fileInfo\">No file selected</div>\n");
      out.write("                    <div class=\"progress-bar-container\" id=\"progressContainer\">\n");
      out.write("                        <div class=\"progress-bar\" id=\"progressBar\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.txtImage_error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <div class=\"error-message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.txtImage_error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                </c:if>\n");
      out.write("                <div class=\"image-preview\" id=\"imagePreview\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"description\">Mô tả:</label>\n");
      out.write("                <textarea id=\"description\" name=\"description\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"isShowing\">Đang chiếu:</label>\n");
      out.write("                <input type=\"checkbox\" id=\"isShowing\" name=\"isShowing\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button-container\">\n");
      out.write("                <input type=\"submit\" id=\"sub\"class=\"form-button\">\n");
      out.write("            </div>\n");
      out.write("            ");

                String Error = (String) request.getAttribute("ERROR"); 
                 if (Error != null) {
            
      out.write("\n");
      out.write("            <p class=\"message\">");
      out.print(Error.equals("null") ? "" : Error);
      out.write("</p>\n");
      out.write("            ");
}
      out.write("\n");
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
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            <div class=\"button-container\">\n");
      out.write("                <button type=\"button\" class=\"form-button back-button\" onclick=\"window.location.href='");
      out.print( request.getContextPath() );
      out.write("/views/home.jsp'\">Trở Về Trang Chủ</button>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("$(document).ready(function () {\n");
      out.write("    // Hiển thị tên file khi chọn file\n");
      out.write("    $('#imageUpload').change(function () {\n");
      out.write("        const file = this.files[0];\n");
      out.write("        if (file) {\n");
      out.write("            // Kiểm tra xem file có phải là hình ảnh không\n");
      out.write("            if (!file.type.match('image.*')) {\n");
      out.write("                alert('Please select an image file (JPEG, PNG, GIF, etc.)');\n");
      out.write("                this.value = '';\n");
      out.write("                $('#fileInfo').text('No file selected');\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Hiển thị tên file và kích thước\n");
      out.write("            const fileSize = (file.size / 1024).toFixed(2) + ' KB';\n");
      out.write("            $('#fileInfo').text(file.name + ' (' + fileSize + ')');\n");
      out.write("\n");
      out.write("            // Hiển thị thanh tiến trình và bắt đầu chuyển đổi sang Base64\n");
      out.write("            $('#progressContainer').show();\n");
      out.write("\n");
      out.write("            // Thiết lập FileReader để đọc file và chuyển đổi sang Base64\n");
      out.write("            const reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onprogress = function (event) {\n");
      out.write("                if (event.lengthComputable) {\n");
      out.write("                    const percentLoaded = Math.round((event.loaded / event.total) * 100);\n");
      out.write("                    $('#progressBar').css('width', percentLoaded + '%');\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                // Hoàn thành tiến trình\n");
      out.write("                $('#progressBar').css('width', '100%');\n");
      out.write("\n");
      out.write("                // Lưu trữ dữ liệu Base64 vào input ẩn\n");
      out.write("                const base64String = e.target.result;\n");
      out.write("                $('#txtImage').val(base64String);\n");
      out.write("\n");
      out.write("                // Hiển thị hình ảnh xem trước\n");
      out.write("                $('#imagePreview').html('<img src=\"' + base64String + '\" alt=\"Preview\">');\n");
      out.write("\n");
      out.write("                // Ẩn thanh tiến trình sau 1 giây\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    $('#progressContainer').hide();\n");
      out.write("                    $('#progressBar').css('width', '0%');\n");
      out.write("                }, 1000);\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            reader.onerror = function () {\n");
      out.write("                alert('Error reading the file. Please try again.');\n");
      out.write("                $('#progressContainer').hide();\n");
      out.write("                $('#progressBar').css('width', '0%');\n");
      out.write("                $('#fileInfo').text('No file selected');\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            // Bắt đầu đọc file và chuyển đổi sang Base64\n");
      out.write("            reader.readAsDataURL(file);\n");
      out.write("        } else {\n");
      out.write("            $('#fileInfo').text('No file selected');\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // Xử lý nút Reset\n");
      out.write("    $('#resetBtn').click(function () {\n");
      out.write("        $('#imagePreview').empty();\n");
      out.write("        $('#fileInfo').text('No file selected');\n");
      out.write("        $('#txtImage').val('');\n");
      out.write("        $('#progressContainer').hide();\n");
      out.write("        $('#progressBar').css('width', '0%');\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // Để chọn lại file đã tải lên trước đó (nếu có)\n");
      out.write("    const existingImageSrc = $('#imagePreview img').attr('src');\n");
      out.write("    if (existingImageSrc) {\n");
      out.write("        $('#txtImage').val(existingImageSrc);\n");
      out.write("    }\n");
      out.write("});\n");
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
