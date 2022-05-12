package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"main-bg\">\n");
      out.write("        <div class=\"login-container text-c animated flipInX\">\n");
      out.write("            <div>\n");
      out.write("                <h1 class=\"logo-badge text-whitesmoke\"><span class=\"fa fa-user-circle\"></span></h1>\n");
      out.write("            </div>\n");
      out.write("            <h3 class=\"text-whitesmoke\">Sign In Template</h3>\n");
      out.write("            <p class=\"text-whitesmoke\">Sign In</p>\n");
      out.write("            <div class=\"container-content\">\n");
      out.write("                <form class=\"margin-t\" action=\"XuLyDangKy\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"form-group\" style=\"margin-bottom: 2px\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  placeholder=\"Ten dang nhap\" required=\"\" name=\"tendangnhap\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tk.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" style=\"margin-bottom: 2px\">\n");
      out.write("                        <div class=\"form-group\" style=\"margin-bottom: 2px\">\n");
      out.write("\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Mat khau\" required=\"\" name=\"matkhau\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"margin-bottom: 2px\">\n");
      out.write("\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Xac nhan mat khau\" required=\"\" name=\"xnmatkhau\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Ho ten\" required=\"\" name=\"hoten\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tk.hoTen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" style=\"margin-bottom: 2px\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Email\" required=\"\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tk.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\" class=\"form-button button-l margin-b\">Sign In</button>\n");
      out.write("\n");
      out.write("                    <a class=\"text-darkyellow\" href=\"#\"><small>Forgot your password?</small></a>\n");
      out.write("                    <p class=\"text-whitesmoke text-center\"><small>Do not have an account?</small></p>\n");
      out.write("                    <a class=\"text-darkyellow\" href=\"#\"><small>Sign Up</small></a>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
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
