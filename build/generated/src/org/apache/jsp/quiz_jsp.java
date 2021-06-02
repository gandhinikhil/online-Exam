package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 String email = (String) request.getAttribute("email"); 
      out.write("\r\n");
      out.write("\r\n");
 String topic_name = (String) request.getAttribute("topic_name"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>LNCT Quiz Portal</title>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav_user.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <form class=\"form-horizontal\" method=\"post\" action=\"Quiz\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>\r\n");
      out.write("                <div class=\"col-sm-9\">Quiz - ");
      out.print( topic_name);
      out.write("</div>\r\n");
      out.write("                <span id=\"timeleft\" class=\"text-right\"></span>\r\n");
      out.write("            </legend>\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-lg-10 col-lg-offset-5\">\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-default\">Reset</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit your Quiz</button>\r\n");
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
      out.write("\r\n");
      out.write("    var myVar = setInterval(function () {\r\n");
      out.write("        myTimer()\r\n");
      out.write("    }, 1000);\r\n");
      out.write("    var d = 600;\r\n");
      out.write("    var min, sec;\r\n");
      out.write("\r\n");
      out.write("    function myTimer() {\r\n");
      out.write("        d--;\r\n");
      out.write("        min = parseInt(d / 60);\r\n");
      out.write("        sec = parseInt((d / 60 - min) * 59);\r\n");
      out.write("        document.getElementById(\"timeleft\").innerHTML = min + \" miunte \" + sec + \" second left\";\r\n");
      out.write("    }\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("quiz_ques");
    _jspx_th_c_forEach_0.setVarStatus("loopCounter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"quiz-ques form-group\">\r\n");
          out.write("                <label class=\"col-lg-2 control-label\">Question ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loopCounter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\r\n");
          out.write("                <div class=\"col-lg-10 text-left\">\r\n");
          out.write("                    <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_ques.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"question");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loopCounter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("_id\">\r\n");
          out.write("                    <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_ques.text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                    <label>\r\n");
          out.write("                        <input type=\"radio\" name=\"question");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loopCounter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("_option\" required=\"required\" value=\"1\">\r\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_ques.option1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("                    </label><br>\r\n");
          out.write("                    <label>\r\n");
          out.write("                        <input type=\"radio\" name=\"question");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loopCounter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("_option\" required=\"required\" value=\"2\">\r\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_ques.option2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("                    </label><br>\r\n");
          out.write("                    <label>\r\n");
          out.write("                        <input type=\"radio\" name=\"question");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loopCounter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("_option\" required=\"required\" value=\"3\">\r\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_ques.option3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("                    </label><br>\r\n");
          out.write("                    <label>\r\n");
          out.write("                        <input type=\"radio\" name=\"question");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loopCounter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("_option\" required=\"required\" value=\"4\">\r\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quiz_ques.option4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("                    </label>\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
