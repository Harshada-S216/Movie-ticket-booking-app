package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connection.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");

       Class.forName("com.mysql.jdbc.Driver");
       java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
     
      
      
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style_1.css\">\n");
      out.write("\t<title>Admin Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <form>\n");
      out.write("\t<div class=\"square\">\n");
      out.write("\t\t<i style=\"--clr:#00ff0a;\"></i>\n");
      out.write("\t\t<i style=\"--clr:#ff0057;\"></i>\n");
      out.write("\t\t<i style=\"--clr:#fffd44;\"></i>\n");
      out.write("            \n");
      out.write("\t\t<div class=\"login\">\n");
      out.write("\t\t\t<h2>Admin Login</h2>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"txtunm\"  placeholder=\"AdminName\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"txtpass\" placeholder=\"Password\">\n");
      out.write("\t\t\t</div>\n");
      out.write("                  \n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t</div>\n");
      out.write("<!--\t\t\t<div class=\"links\">\n");
      out.write("\t\t\t\t<a href=\"#\">Forget Password</a>\n");
      out.write("\t\t\t</div>-->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </form>\n");
      out.write("     ");

         
         String unm=request.getParameter("txtunm");
         String pass=request.getParameter("txtpass");
         Statement st=con.createStatement();
         if(unm!=null && unm!="" && pass!=null && pass!="")
         {
            String str="Select * from adminlogin where Adminname='"+unm+"' and Password='"+pass+"'"; 
        
         ResultSet rs=st.executeQuery(str);
         if(rs.next())
         {
             out.println("<script> alert('login sucess....')</script>");
             response.sendRedirect("adminhomepage.jsp");
         }
         else
         {
            out.println("<script> alert('login failed....')</script>");
  
         }
         }
         
      out.write("\n");
      out.write("</body>\n");
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
