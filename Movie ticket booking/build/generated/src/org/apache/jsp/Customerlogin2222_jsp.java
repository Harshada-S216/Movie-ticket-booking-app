package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customerlogin2222_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Animated Login Form using HTML CSS Only | Codehal</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("     <div class=\"form-wrapper sign-in\">\n");
      out.write("        <form action=\"\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" required>\n");
      out.write("                <label>Username</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"password\" required>\n");
      out.write("                <label>Password</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"remember\">\n");
      out.write("                <label><input type=\"checkbox\">Remember me</label>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\">login</button>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("     </div>\n");
      out.write("    </div>    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap');\n");
      out.write("* {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-family: 'Poppins', sans-serif;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    min-height: 100vh;\n");
      out.write("   background: #000;\n");
      out.write("}\n");
      out.write(".wrapper{\n");
      out.write("    position: relative;\n");
      out.write("    width: 400px;\n");
      out.write("    height: 500px;\n");
      out.write("    background: #000;\n");
      out.write("    box-shadow: 0 0 50px #0ef;\n");
      out.write("    border-radius:20px ;\n");
      out.write("    padding: 40px;\n");
      out.write("}\n");
      out.write(".wrapper:hover{\n");
      out.write("    animation: animate 1s linear infinite;\n");
      out.write("}\n");
      out.write("@keyframes animate{\n");
      out.write("    100%{\n");
      out.write("        filter: hue-rotate(360deg);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write(".form-wrapper{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("    font-size: 30px;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".input-group{\n");
      out.write("    position: relative;\n");
      out.write("    margin: 30px 0 ;\n");
      out.write("    border-bottom: 2px solid #fff;\n");
      out.write("}\n");
      out.write(".input-group label{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 5px;\n");
      out.write("    transform: translate(-50%);\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #fff;\n");
      out.write("    pointer-events: none;\n");
      out.write("    transition: .5s;\n");
      out.write("}\n");
      out.write(".input-group input {\n");
      out.write("    width: 320px;\n");
      out.write("    height: 40px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color:#fff;\n");
      out.write("    padding: 0 5px;\n");
      out.write("    background: transparent;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write(".input-group input:focus~label,\n");
      out.write(".input-group input:valid~label{\n");
      out.write("    top: -5px;\n");
      out.write("}\n");
      out.write(".remember{\n");
      out.write("    margin: -5px 0  15px 5px;\n");
      out.write("}\n");
      out.write(".remember label{\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 14px;\n");
      out.write("}\n");
      out.write(".remember label input{\n");
      out.write("    accent-color: #0ef;\n");
      out.write("}\n");
      out.write("button{\n");
      out.write("    position: relative;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 40px;\n");
      out.write("    background: #0ef;\n");
      out.write("    box-shadow: 0 0 10px #0ef;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #000;\n");
      out.write("    font-weight:500;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius:30px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
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
