package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"c2.css\">\r\n");
      out.write("\r\n");
      out.write("    <title>Contact us</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <section class=\"contact\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h2>Contact us</h2>\r\n");
      out.write("            <div class=\"contact-wrapper\">\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"contact-info\">\r\n");
      out.write("              <h3>Contact Information</h3>  \r\n");
      out.write("              <p><i class=\"fas fa-phone\"></i>+91 9325355028 , +91 9881284002</p>\r\n");
      out.write("              <p><i class=\"fas fa-envelope\"></i>hs1321@gmail.com</p>\r\n");
      out.write("              <p><i class=\"fas fa-map-marker-alt\"></i>College road,vidyanagar,SGM college Karad.</p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<style>\r\n");
      out.write(" *{\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("    padding: 0px;\r\n");
      out.write("    box-sizing: border-box; \r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".contact{\r\n");
      out.write("    min-height: 200vh;\r\n");
      out.write("    background-color: lavender;\r\n");
      out.write("    padding: 80px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".container{\r\n");
      out.write("    max-width: 800px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".container h2{\r\n");
      out.write("    font-size: 36px;\r\n");
      out.write("    background-color: darkblue;\r\n");
      out.write("    margin-bottom: 150px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".contact-wrapper{\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-template-columns: repeat(2,1fr);\r\n");
      out.write("    grid-gap: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input, textarea{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background-color: #f8f9fa;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".contact-info{\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write(".contact-info h3{\r\n");
      out.write("    font-size: 28px;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write(".contact-info p{\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("   margin-bottom: 10px;\r\n");
      out.write("   margin-right: 20px;\r\n");
      out.write("   color: #555; \r\n");
      out.write("}\r\n");
      out.write(".contact-info i{\r\n");
      out.write("    color: #11aeb0;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("@media screen and (max-width:768px){\r\n");
      out.write("    .container{\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .contact-wrapper{\r\n");
      out.write("        grid-template-columns: 1fr;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>>");
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
