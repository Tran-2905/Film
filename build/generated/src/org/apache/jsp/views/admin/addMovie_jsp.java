package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.MovieDAO;
import dto.Movie;

public final class addMovie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Add Movie</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("                background: linear-gradient(135deg, #6A0DAD, #9F2BFF);\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .container {\r\n");
      out.write("                width: 500px;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("                background: #1E1B29;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                box-shadow: 0 0 10px rgba(0,0,0,0.5);\r\n");
      out.write("            }\r\n");
      out.write("            .form-group {\r\n");
      out.write("                margin-bottom: 15px;\r\n");
      out.write("            }\r\n");
      out.write("            label {\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-bottom: 5px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=\"text\"],\r\n");
      out.write("            input[type=\"number\"],\r\n");
      out.write("            textarea {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                outline: none;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=\"file\"] {\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("            .button-container {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            .form-button {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                background-color: #FF00FF;\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                transition: background-color 0.3s;\r\n");
      out.write("            }\r\n");
      out.write("            .form-button:hover {\r\n");
      out.write("                background-color: #E600E6;\r\n");
      out.write("            }\r\n");
      out.write("            .back-button {\r\n");
      out.write("                background-color: #00BFFF;\r\n");
      out.write("            }\r\n");
      out.write("            .back-button:hover {\r\n");
      out.write("                background-color: #009ACD;\r\n");
      out.write("            }\r\n");
      out.write("            .preview {\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                max-width: 100%;\r\n");
      out.write("                max-height: 300px;\r\n");
      out.write("            }.file-info {\r\n");
      out.write("                color: yellow;\r\n");
      out.write("                font-size: 0.9em;\r\n");
      out.write("                margin-top: 5px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.role eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        ");

            String id = request.getParameter("id");
            MovieDAO dao = new MovieDAO();
            Movie movie = dao.getMovieByID(id); // Chỉ khai báo 1 lần

            if (movie == null) {
                movie = new Movie(); // Nếu không tìm thấy phim, tạo đối tượng rỗng
            }
            request.setAttribute("movie", movie);
        
          out.write("\r\n");
          out.write("        <div class=\"container\">\r\n");
          out.write("            welcome, ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("            <form action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/addMovieController\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
          out.write("                <input type=\"hidden\" name=\"action\" value=\"addMovie\">\r\n");
          out.write("                <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"name\">Tên phim:</label>\r\n");
          out.write("                    <input type=\"text\" id=\"name\" name=\"txtname\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"required/>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"actor\">Diễn viên:</label>\r\n");
          out.write("                    <input type=\"text\" id=\"actor\" name=\"actor\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.actor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"category\">Thể loại:</label>\r\n");
          out.write("                    <input type=\"text\" id=\"category\" name=\"category\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"time\">Thời lượng (phút):</label>\r\n");
          out.write("                    <input type=\"number\" id=\"time\" name=\"time\" value=\"90\" min=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"language\">Ngôn ngữ:</label>\r\n");
          out.write("                    <input type=\"text\" id=\"language\" name=\"language\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"txtImage\">Book Cover Image:</label>\r\n");
          out.write("                    <input type=\"hidden\" id=\"txtImage\" name=\"txtImage\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                    <div class=\"upload-container\">\r\n");
          out.write("                        <div class=\"file-upload-wrapper\">\r\n");
          out.write("                            <button type=\"button\" class=\"file-upload-button\">Choose an Image</button>\r\n");
          out.write("                            <input type=\"file\" id=\"imageUpload\" class=\"file-upload-input\" accept=\"image/*\"/>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"file-info\" id=\"fileInfo\">No file selected</div>\r\n");
          out.write("                        <div class=\"progress-bar-container\" id=\"progressContainer\">\r\n");
          out.write("                            <div class=\"progress-bar\" id=\"progressBar\"></div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    <div class=\"image-preview\" id=\"imagePreview\">\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"description\">Mô tả:</label>\r\n");
          out.write("                    <textarea id=\"description\" name=\"description\"></textarea>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"form-group\">\r\n");
          out.write("                    <label for=\"isShowing\">Đang chiếu:</label>\r\n");
          out.write("                    <input type=\"checkbox\" id=\"isShowing\" name=\"isShowing\">\r\n");
          out.write("                </div>\r\n");
          out.write("                <div class=\"button-container\">\r\n");
          out.write("                    <input type=\"submit\" id=\"sub\"class=\"form-button\">\r\n");
          out.write("                </div>\r\n");
          out.write("                ");

                    String Error = (String) request.getAttribute("ERROR");
                    if (Error != null) {
                
          out.write("\r\n");
          out.write("                <p class=\"message\">");
          out.print(Error.equals("null") ? "" : Error);
          out.write("</p>\r\n");
          out.write("                ");
}
          out.write("\r\n");
          out.write("                ");

                    String message = (String) request.getAttribute("message");
                    if (message != null) {
                
          out.write("\r\n");
          out.write("                <p class=\"message\">");
          out.print(message.equals("null") ? "" : message);
          out.write("</p>\r\n");
          out.write("                ");
}
          out.write("\r\n");
          out.write("\r\n");
          out.write("            </form>\r\n");
          out.write("            <div class=\"button-container\">\r\n");
          out.write("                <button type=\"button\" class=\"form-button back-button\" onclick=\"window.location.href = '");
          out.print( request.getContextPath());
          out.write("/views/home.jsp'\">Trở Về Trang Chủ</button>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("    ");
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
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        // Hiển thị tên file khi chọn file\r\n");
      out.write("                        $('#imageUpload').change(function () {\r\n");
      out.write("                            const file = this.files[0];\r\n");
      out.write("                            if (file) {\r\n");
      out.write("                                // Kiểm tra xem file có phải là hình ảnh không\r\n");
      out.write("                                if (!file.type.match('image.*')) {\r\n");
      out.write("                                    alert('Please select an image file (JPEG, PNG, GIF, etc.)');\r\n");
      out.write("                                    this.value = '';\r\n");
      out.write("                                    $('#fileInfo').text('No file selected');\r\n");
      out.write("                                    return;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                // Hiển thị tên file và kích thước\r\n");
      out.write("                                const fileSize = (file.size / 1024).toFixed(2) + ' KB';\r\n");
      out.write("                                $('#fileInfo').text(file.name + ' (' + fileSize + ')');\r\n");
      out.write("\r\n");
      out.write("                                // Hiển thị thanh tiến trình và bắt đầu chuyển đổi sang Base64\r\n");
      out.write("                                $('#progressContainer').show();\r\n");
      out.write("\r\n");
      out.write("                                // Thiết lập FileReader để đọc file và chuyển đổi sang Base64\r\n");
      out.write("                                const reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("                                reader.onprogress = function (event) {\r\n");
      out.write("                                    if (event.lengthComputable) {\r\n");
      out.write("                                        const percentLoaded = Math.round((event.loaded / event.total) * 100);\r\n");
      out.write("                                        $('#progressBar').css('width', percentLoaded + '%');\r\n");
      out.write("                                    }\r\n");
      out.write("                                };\r\n");
      out.write("\r\n");
      out.write("                                reader.onload = function (e) {\r\n");
      out.write("                                    // Hoàn thành tiến trình\r\n");
      out.write("                                    $('#progressBar').css('width', '100%');\r\n");
      out.write("\r\n");
      out.write("                                    // Lưu trữ dữ liệu Base64 vào input ẩn\r\n");
      out.write("                                    const base64String = e.target.result;\r\n");
      out.write("                                    $('#txtImage').val(base64String);\r\n");
      out.write("\r\n");
      out.write("                                    // Hiển thị hình ảnh xem trước\r\n");
      out.write("                                    $('#imagePreview').html('<img src=\"' + base64String + '\" alt=\"Preview\">');\r\n");
      out.write("\r\n");
      out.write("                                    // Ẩn thanh tiến trình sau 1 giây\r\n");
      out.write("                                    setTimeout(function () {\r\n");
      out.write("                                        $('#progressContainer').hide();\r\n");
      out.write("                                        $('#progressBar').css('width', '0%');\r\n");
      out.write("                                    }, 1000);\r\n");
      out.write("                                };\r\n");
      out.write("\r\n");
      out.write("                                reader.onerror = function () {\r\n");
      out.write("                                    alert('Error reading the file. Please try again.');\r\n");
      out.write("                                    $('#progressContainer').hide();\r\n");
      out.write("                                    $('#progressBar').css('width', '0%');\r\n");
      out.write("                                    $('#fileInfo').text('No file selected');\r\n");
      out.write("                                };\r\n");
      out.write("\r\n");
      out.write("                                // Bắt đầu đọc file và chuyển đổi sang Base64\r\n");
      out.write("                                reader.readAsDataURL(file);\r\n");
      out.write("                            } else {\r\n");
      out.write("                                $('#fileInfo').text('No file selected');\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        // Xử lý nút Reset\r\n");
      out.write("                        $('#resetBtn').click(function () {\r\n");
      out.write("                            $('#imagePreview').empty();\r\n");
      out.write("                            $('#fileInfo').text('No file selected');\r\n");
      out.write("                            $('#txtImage').val('');\r\n");
      out.write("                            $('#progressContainer').hide();\r\n");
      out.write("                            $('#progressBar').css('width', '0%');\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        // Để chọn lại file đã tải lên trước đó (nếu có)\r\n");
      out.write("                        const existingImageSrc = $('#imagePreview img').attr('src');\r\n");
      out.write("                        if (existingImageSrc) {\r\n");
      out.write("                            $('#txtImage').val(existingImageSrc);\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.txtImage_error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"error-message\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.txtImage_error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
