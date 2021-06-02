package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <form class=\"form-horizontal\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>Add Question</legend>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputQuestionText\" class=\"col-lg-2 control-label\">Question Text</label>\r\n");
      out.write("                <div class=\"col-lg-10\">\r\n");
      out.write("                    <input type=\"text\" name=\"question_text\" class=\"form-control\" id=\"inputQuestionText\"\r\n");
      out.write("                           placeholder=\"Text\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"select\" class=\"col-lg-2 control-label\">Select Topic</label>\r\n");
      out.write("                <div class=\"col-lg-10\">\r\n");
      out.write("                    <select class=\"form-control\" id=\"select\">\r\n");
      out.write("                        <option disabled=\"disabled\" selected=\"selected\">Select Topic</option>\r\n");
      out.write("                        <option>Java</option>\r\n");
      out.write("                        <option>C++</option>\r\n");
      out.write("                        <option>Python Programing</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputChoice_1\" class=\"col-lg-2 control-label\">Choice 1</label>\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"choice1_text\" class=\"form-control\" id=\"inputChoice_1\" placeholder=\"Choice Text\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-2 text-left\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"radio\" name=\"correct_choice\" value=\"1\">\r\n");
      out.write("                        Correct Answer\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputChoice_2\" class=\"col-lg-2 control-label\">Choice 2</label>\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"choice2_text\" class=\"form-control\" id=\"inputChoice_2\" placeholder=\"Choice Text\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-2 text-left\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"radio\" name=\"correct_choice\" value=\"2\">\r\n");
      out.write("                        Correct Answer\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputChoice_3\" class=\"col-lg-2 control-label\">Choice 3</label>\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"choice3_text\" class=\"form-control\" id=\"inputChoice_3\" placeholder=\"Choice Text\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-2 text-left\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"radio\" name=\"correct_choice\" value=\"3\">\r\n");
      out.write("                        Correct Answer\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputChoice_4\" class=\"col-lg-2 control-label\">Choice 4</label>\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"choice4_text\" class=\"form-control\" id=\"inputChoice_4\" placeholder=\"Choice Text\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-2 text-left\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"radio\" name=\"correct_choice\" value=\"4\">\r\n");
      out.write("                        Correct Answer\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-lg-10 col-lg-offset-5\">\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-default\">Reset</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    $('.nav-collapse').click('li', function () {\r\n");
      out.write("        $('.nav-collapse').collapse('hide');\r\n");
      out.write("    });\r\n");
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
