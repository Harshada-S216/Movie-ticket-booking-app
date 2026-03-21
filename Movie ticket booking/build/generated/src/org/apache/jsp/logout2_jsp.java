package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"dom.css\">\n");
      out.write("  <title>CSS Button Glow Effect</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <a href=\"adminhomepage.jsp\" button class=\"btn\">Logout!!</button></a>\n");
 
    response.sendRedirect("adminhomepage.jsp");

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(" html, body {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    background-color: #161616;\n");
      out.write("    overflow: hidden;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn {\n");
      out.write("    margin: 300px;\n");
      out.write("    padding: 15px 40px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: #FFF;\n");
      out.write("    cursor: pointer;\n");
      out.write("    position: relative;\n");
      out.write("    z-index: 0;\n");
      out.write("    border-radius: 12px;\n");
      out.write("  }\n");
      out.write("  .btn::after {\n");
      out.write("    content: \"\";\n");
      out.write("    z-index: -1;\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    background-color: #333;\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    border-radius: 10px;\n");
      out.write("  }\n");
      out.write("  /* glow */\n");
      out.write("  .btn::before {\n");
      out.write("    content: \"\";\n");
      out.write("    background: linear-gradient(\n");
      out.write("      45deg,\n");
      out.write("      #FF0000, #FF7300, #FFFB00, #48FF00,\n");
      out.write("      #00FFD5, #002BFF, #FF00C8, #FF0000\n");
      out.write("    );\n");
      out.write("    position: absolute;\n");
      out.write("    top: -2px;\n");
      out.write("    left: -2px;\n");
      out.write("    background-size: 600%;\n");
      out.write("    z-index: -1;\n");
      out.write("    width: calc(100% + 4px);\n");
      out.write("    height:  calc(100% + 4px);\n");
      out.write("    filter: blur(8px);\n");
      out.write("    animation: glowing 20s linear infinite;\n");
      out.write("    transition: opacity .3s ease-in-out;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    opacity: 0;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  @keyframes glowing {\n");
      out.write("    0% {background-position: 0 0;}\n");
      out.write("    50% {background-position: 400% 0;}\n");
      out.write("    100% {background-position: 0 0;}\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* hover */\n");
      out.write("  .btn:hover::before {\n");
      out.write("    opacity: 1;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn:active:after {\n");
      out.write("    background: transparent;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn:active {\n");
      out.write("    color: #000;\n");
      out.write("    font-weight: bold;\n");
      out.write("  } \n");
      out.write("</style>");
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
