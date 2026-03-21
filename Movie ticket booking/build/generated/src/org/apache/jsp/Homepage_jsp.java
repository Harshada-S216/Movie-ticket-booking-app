package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li ><a href=\"Homepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"Admin_login.jsp\">Admin Login</a></li>\n");
      out.write("                <li><a href=\"Cust_Login.jsp\">Customer Login</a></li>                \n");
      out.write("                <li><a href=\"About_Us.jsp\">About Us </a></li>\n");
      out.write("                <li><a href=\"Contact_Us.jsp\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"title\">\n");
      out.write("             <h3 align=\"center\">Healthy Bodies, Healthy Minds, Healthy Life.</h3>\n");
      out.write("            <h1 align=\"center\">Medox Management system</h1>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("</header>\n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <!--about us-->\n");
      out.write("    <br><br><br><div class=\"title4\"><h1 align=\"center\">Why to Visit Our Website...</h1></div>\n");
      out.write("    <div class=\"about\">\n");
      out.write("        \n");
      out.write("    <div class=\"about-section\">\n");
      out.write("        <div class=\"inner-container\">\n");
      out.write("            <h1>Benefit of our Website</h1>\n");
      out.write("            <p class=\"text\">“Medicine is not only a science; it is also an art. It does not consist of compounding pills and plasters; \n");
      out.write("                it deals with the very processes of life, which must be understood before they may be guided.”</p>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"news\">\n");
      out.write("       <marquee><h2>Best services available for the best customers </h2></marquee>\n");
      out.write("    </div>\n");
      out.write("<!--</about-->\n");
      out.write("\n");
      out.write("<div class=\"Gallery\">\n");
      out.write("        <div class=\"title2\">\n");
      out.write("            <br>\n");
      out.write("            <h1 align=\"center\">Our Products</h1><br><br>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    <div class=\"box\"><img src=\"img/product1.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("            <h2 class=\"text-white\" align=\"center\">Bourn Vita</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/product2.jpg\">  <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\" >\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Vicks</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/product3.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Shampoo</h2>\n");
      out.write("    </a></div>\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"box\"><img src=\"img/product4.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                              <h2 class=\"text-white\" align=\"center\">Dettol</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/product5.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Dog Products</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/product6.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Baby Wipes</h2>\n");
      out.write("    </a></div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"Yojana\">\n");
      out.write("<div class=\"title3\"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("              <h1 align=\"center\">Medicines Category</h1>\n");
      out.write("          </div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("<div class=\"gallery-sec\">\n");
      out.write("    \n");
      out.write("    <div class=\"gallery-wrap\">\n");
      out.write("        \n");
      out.write("        <div class=\"gallery-img\">\n");
      out.write("              \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/category1.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Tablets</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/category2.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                     <h1>Capsules</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/category3.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Syrup</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/category4.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Syringe</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/category5.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Cream</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/category6.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1> Body Lotion</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<!--footer start-->\n");
      out.write("<div class=\"footer\" style=\"color: black;\">\n");
      out.write("    <marquee> <p class=\"design\">Designed By:Rasika Deshmukh & Nikita Mane SGMCK 2023-24</marquee>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
