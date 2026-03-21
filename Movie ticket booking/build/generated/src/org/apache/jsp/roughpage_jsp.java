package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roughpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/new2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"sub-header\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Admin_homepage.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"Admin_registration.jsp\"> Our Services</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"title6\">\n");
      out.write("                <h1>Search Document</h1>   \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <div class=\"registration\">\n");
      out.write("        <div class=\"registrationbox\">\n");
      out.write("            <img src=\"img/loginlogo.jpg\" class=\"avatar\">\n");
      out.write("            <h1>Register Here</h1>\n");
      out.write("            <form align=\"left\">\n");
      out.write("      \n");
      out.write("                <p>Sr.No</p>\n");
      out.write("               \n");
      out.write("                <input type=\"text\" name=\"txtsrno\" value=\"\" placeholder=\"entersrno\"/>\n");
      out.write("                <label class=\"required\"><p>Customer Name</p></label>\n");
      out.write("                <input type=\"text\" name=\"txtcnm\" value=\"\"  placeholder=\"enter name\"/>\n");
      out.write("                \n");
      out.write("                <label class=\"required\"><p>Address</p></label>\n");
      out.write("                <input type=\"text\" name=\"txtadd\" value=\"\" placeholder=\"enter address\"/>\n");
      out.write("                \n");
      out.write("                <label class=\"required\"><p>Mobile No</p></label>\n");
      out.write("                <input type=\"text\" name=\"txtmob\" value=\"\" placeholder=\"enter mobile number\"/>\n");
      out.write("                \n");
      out.write("               <label class=\"required\"><p>Email ID</p></label>\n");
      out.write("               <input type=\"text\" name=\"txtemailid\" value=\"\" placeholder=\"enter email\"/>\n");
      out.write("                \n");
      out.write("                <label class=\"required\"><p>Username</p></label>\n");
      out.write("                <input type=\"text\" name=\"txtunm\" value=\"\" placeholder=\"enter username\"/>\n");
      out.write("                \n");
      out.write("                <label class=\"required\"><p>Password</p></label>\n");
      out.write("                <input type=\"password\" name=\"txtpass\" value=\"\" placeholder=\"enter password\" />\n");
      out.write("                \n");
      out.write("                <br>     <br>     \n");
      out.write("                <input type=\"submit\" value=\"Register\" name=\"Register\" />   \n");
      out.write("      \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("            <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("            <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("            <br><br><br><br><br><br><br><br>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" \n");
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
