package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>LNMIIT Quiz Portal</title>\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/custom-theme.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("    <script src=\"bootstrap/js/jquery-2.2.2.min.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <header>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav_public.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("page", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("login", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <div class=\"col-lg-1\"></div>\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("        ");
 String error = (String) request.getAttribute("error");
            String error_msg = (String) request.getAttribute("error_msg"); 
      out.write("\r\n");
      out.write("        ");
 if (error == "true") { 
      out.write("\r\n");
      out.write("        <div class=\"alert alert-dismissible alert-danger\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("            <strong>");
      out.print( error_msg);
      out.write("\r\n");
      out.write("            </strong>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <form class=\"form-horizontal\" action=\"Login\" method=\"post\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("                <legend>Login Form</legend>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"inputUsername\" class=\"col-lg-2 control-label\">Username</label>\r\n");
      out.write("                    <div class=\"col-lg-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" id=\"inputUsername\"\r\n");
      out.write("                               placeholder=\"Username\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"inputPassword\" class=\"col-lg-2 control-label\">Password</label>\r\n");
      out.write("                    <div class=\"col-sm-8\">\r\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"inputPassword\"\r\n");
      out.write("                               placeholder=\"Password\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2 text-right\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" id=\"showpass\">Show Password</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-lg-10 col-lg-offset-5\">\r\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-default\">Reset</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-lg-1\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    $('.nav-collapse').click('li', function () {\r\n");
      out.write("        $('.nav-collapse').collapse('hide');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $('#showpass').mousedown(function () {\r\n");
      out.write("        $('#inputPassword').removeAttr(\"type\").prop('type', 'text');\r\n");
      out.write("    }).mouseup(function () {\r\n");
      out.write("        $('#inputPassword').removeAttr(\"type\").prop('type', 'password');\r\n");
      out.write("    })\r\n");
      out.write("    ;\r\n");
      out.write("</script>\r\n");
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
