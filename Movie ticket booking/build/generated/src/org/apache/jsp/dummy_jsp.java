package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dummy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demoneha.css\">\n");
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
      out.write("                <li><a href=\"Contact_Us.jsp\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"title\">\n");
      out.write("             <h3 align=\"center\">Cultivate,Innovate,Succeed!</h3>\n");
      out.write("            <h1 align=\"center\">AgroConnect</h1>\n");
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
      out.write("            <h1><u>---Benefits of website---</u></h1>\n");
      out.write("            <p class=\"text\">“Agriculture market increase efficiency and reduce middlemen and costs by connecting farmers directly to consumers.\n");
      out.write("                They promote transparency and trust.Helps you make informed purchasing decisions and support the local economy.”</p>\n");
      out.write("       \n");
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
      out.write("    <div class=\"box\"><img src=\"img/Img1.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("            <h2 class=\"text-white\" align=\"center\">Fertilizer</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/Img2.jpg\">  <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Fertilizer</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/Img3.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Seeds</h2>\n");
      out.write("    </a></div>\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"box\"><img src=\"img/Img4.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                              <h2 class=\"text-white\" align=\"center\">Machines</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/Img5.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Pesticides</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/Img6.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Tools</h2>\n");
      out.write("    </a></div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("<div class=\"Yojana\">\n");
      out.write("<div class=\"title3\"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("              <h1 align=\"center\">Grow Local, Sow Global</h1>\n");
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
      out.write("                    <img src=\"img/G1.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Plants</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/G2.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                     <h1>Grains</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/G3.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Fertilizers</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/G4.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Technology</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/G5.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Machines</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/G6.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Results</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<!--footer start-->\n");
      out.write("<!-<div class=\"footer\" style=\"color: black;\">\n");
      out.write("    <marquee> <p class=\"design\"> </marquee>\n");
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
