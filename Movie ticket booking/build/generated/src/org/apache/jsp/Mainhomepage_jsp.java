package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mainhomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li ><a href=\"Homepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"adminlogin.jsp\">Admin Login</a></li>\n");
      out.write("                <li><a href=\"Customerlogin.jsp\">Customer Login</a></li>                \n");
      out.write("                <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"title\">\n");
      out.write("             <h3 align=\"center\">Unforgettable Entertainment at your Fingertips....</h3>\n");
      out.write("            <h1 align=\"center\">Movie Ticket Booking </h1>\n");
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
      out.write("            <p class=\"text\">“An online movie ticke booking system is a digital platform that allows customer to access the service\n");
      out.write("                of a business ,reserve seats and buy tickets. this platform provides details such as what time a movie will be played\n");
      out.write("                and much more..”</p>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"news\">\n");
      out.write("       <marquee><h2> Your Trusted partner for best Entertainment Services..</h2></marquee>\n");
      out.write("    </div>\n");
      out.write("<!--</about-->\n");
      out.write("\n");
      out.write("<div class=\"Gallery\">\n");
      out.write("        <div class=\"title2\">\n");
      out.write("            <br>\n");
      out.write("            <h1 align=\"center\">Hindi Movies</h1><br><br>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("   <div class=\"box\"><img src=\"img/3I.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("            <h2 class=\"text-white\" align=\"center\">3 Idiots</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/YJHD.jpg\">  <a class=\"destination-overlay text-white text-decoration-none\" >\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Yeh Jaawani Hai Deewani</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/1983.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">1983</h2>\n");
      out.write("    </a></div>\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"box\"><img src=\"img/JVM.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                              <h2 class=\"text-white\" align=\"center\">Jab We Met</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/SB.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Sam Bahadur</h2>\n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/S.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\">\n");
      out.write("                            <h2 class=\"text-white\" align=\"center\">Stree2</h2>\n");
      out.write("    </a></div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("<div class=\"Yojana\">\n");
      out.write("<div class=\"title3\"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("              <h1 align=\"center\">Marathi Movies</h1>\n");
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
      out.write("                    <img src=\"img/D.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Dunyadari</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/V.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                     <h1>Valvi</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/T.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Tumbad</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/TSKK.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Ti Sadhya Ky Karta</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/N.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Natasamrat</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/BBD.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1> Baipan Bhari Deva</h1>\n");
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
      out.write("    <marquee> <p class=\"design\">Designed By:Harshada Suryawanshi and Shivani Kadam SGMCK 2024-25</marquee>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
