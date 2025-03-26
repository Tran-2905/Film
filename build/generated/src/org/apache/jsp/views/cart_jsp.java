package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.CartItem;
import dao.MovieDAO;
import dto.Movie;
import java.util.List;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("            body {\n");
      out.write("                background: linear-gradient(to bottom, #0f0c29, #302b63, #24243e);\n");
      out.write("                color: #fff;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Định dạng tiêu đề */\n");
      out.write("            h2 {\n");
      out.write("                color: yellow;\n");
      out.write("                font-size: 24px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Bảng */\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\n");
      out.write("                box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.2);\n");
      out.write("                border-radius: 10px;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Header của bảng */\n");
      out.write("            thead th {\n");
      out.write("                background: yellow;\n");
      out.write("                color: black;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Ô dữ liệu */\n");
      out.write("            tbody td {\n");
      out.write("                padding: 10px;\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Hiệu ứng hover cho hàng */\n");
      out.write("            tr:hover {\n");
      out.write("                background: rgba(255, 255, 255, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Ảnh trong bảng */\n");
      out.write("            td img {\n");
      out.write("                width: 100px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Nút bấm */\n");
      out.write("            button, input[type=\"submit\"] {\n");
      out.write("                background: yellow;\n");
      out.write("                color: black;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition: background 0.3s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover, input[type=\"submit\"]:hover {\n");
      out.write("                background: #ffcc00;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Nút \"Back\" */\n");
      out.write("            .back-button {\n");
      out.write("                background-color: #00BFFF;\n");
      out.write("                padding: 12px 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #009ACD;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Container chứa nút */\n");
      out.write("            .button-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Input số lượng */\n");
      out.write("            input[type=\"number\"] {\n");
      out.write("                width: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Link */\n");
      out.write("            a {\n");
      out.write("                color: yellow;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover {\n");
      out.write("                color: #ffcc00;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>No.</th>\n");
      out.write("                    <th>id</th>\n");
      out.write("                    <th>name</th>\n");
      out.write("                    <th>quantity</th>\n");
      out.write("                    <th>price</th>\n");
      out.write("                    <th>Total</th>\n");
      out.write("                    <th>Actions</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    int sum = 0;
                
      out.write("\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("dto");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartItems}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVarStatus("counter");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr> \n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.movieID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("<input type=\"hidden\" name=\"movieID\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.movieID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" /> </td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.movieName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("<input type=\"hidden\" name=\"movieName\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.movieName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" /> </td>\n");
            out.write("                        <td>\n");
            out.write("                            <form action=\"MainController\" method=\"post\" class=\"d-inline\">\n");
            out.write("                                <input type=\"hidden\" name=\"action\" value=\"UpdateCart\">\n");
            out.write("                                <input type=\"hidden\" name=\"movieID\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.movieID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                                <input type=\"number\" name=\"quantity\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" min=\"1\" class=\"form-control d-inline-block\" style=\"width: 60px;\">\n");
            out.write("                                <button type=\"submit\" class=\"btn btn-success btn-sm\">Update</button>\n");
            out.write("                            </form> \n");
            out.write("                        </td>\n");
            out.write("                        <td>45.000<input type=\"hidden\" name=\"price\" value=\"45\" /></td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.quantity*45}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                        <td>\n");
            out.write("                            <form action=\"MainController\" method=\"post\" class=\"d-inline\">\n");
            out.write("                                <input type=\"hidden\" name=\"action\" value=\"RemoveFromCart\">\n");
            out.write("                                <input type=\"hidden\" name=\"movieID\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.movieID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                                <button type=\"submit\" class=\"btn btn-danger btn-sm\">Remove</button>\n");
            out.write("                            </form>\n");
            out.write("                        </td>\n");
            out.write("                    </tr>\n");
            out.write("                    ");

                        CartItem cartItem = (CartItem) pageContext.getAttribute("dto"); // Correct class casting
                        if (cartItem != null) {
                            sum += cartItem.getQuantity() * 45;
                        }
                    
            out.write("\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <div class=\"text-center mt-4\">\n");
      out.write("            <form action=\"MainController\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"PlaceOrder\">\n");
      out.write("                <input type=\"hidden\" name=\"totalAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.quantity*45}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success btn-lg\">Confirm Order</button>\n");
      out.write("            </form>\n");
      out.write("        </div>    \n");
      out.write("        <div class=\"button-container\">\n");
      out.write("            <button type=\"button\" class=\"form-button back-button\" onclick=\"window.location.href = '");
      out.print( request.getContextPath());
      out.write("/views/home.jsp'\">Trở Về Trang Chủ</button>\n");
      out.write("        </div>\n");
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
