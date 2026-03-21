package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<div class=\"wrap\">\n");
      out.write("  <button class=\"button\">Submit</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        html, body {\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrap {\n");
      out.write("  height: 100%;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  min-width: 300px;\n");
      out.write("  min-height: 60px;\n");
      out.write("  display: inline-flex;\n");
      out.write("  font-family: 'Nunito', sans-serif;\n");
      out.write("  font-size: 22px;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  text-align: center;\n");
      out.write("  letter-spacing: 1.3px;\n");
      out.write("  font-weight: 700;\n");
      out.write("  color: #313133;\n");
      out.write("  background: #4FD1C5;\n");
      out.write("background: linear-gradient(90deg, rgba(129,230,217,1) 0%, rgba(79,209,197,1) 100%);\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 1000px;\n");
      out.write("  box-shadow: 12px 12px 24px rgba(79,209,197,.64);\n");
      out.write("  transition: all 0.3s ease-in-out 0s;\n");
      out.write("  cursor: pointer;\n");
      out.write("  outline: none;\n");
      out.write("  position: relative;\n");
      out.write("  padding: 10px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".button::before {\n");
      out.write("content: '';\n");
      out.write("  border-radius: 1000px;\n");
      out.write("  min-width: calc(300px + 12px);\n");
      out.write("  min-height: calc(60px + 12px);\n");
      out.write("  border: 6px solid #00FFCB;\n");
      out.write("  box-shadow: 0 0 60px rgba(0,255,203,.64);\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  opacity: 0;\n");
      out.write("  transition: all .3s ease-in-out 0s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover, \n");
      out.write(".button:focus {\n");
      out.write("  color: #313133;\n");
      out.write("  transform: translateY(-6px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover::before, \n");
      out.write(".button:focus::before {\n");
      out.write("  opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button::after {\n");
      out.write("  content: '';\n");
      out.write("  width: 30px; height: 30px;\n");
      out.write("  border-radius: 100%;\n");
      out.write("  border: 6px solid #00FFCB;\n");
      out.write("  position: absolute;\n");
      out.write("  z-index: -1;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  animation: ring 1.5s infinite;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover::after, \n");
      out.write(".button:focus::after {\n");
      out.write("  animation: none;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes ring {\n");
      out.write("  0% {\n");
      out.write("    width: 30px;\n");
      out.write("    height: 30px;\n");
      out.write("    opacity: 1;\n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    width: 300px;\n");
      out.write("    height: 300px;\n");
      out.write("    opacity: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
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
