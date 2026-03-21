package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Customerlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login Form</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("     <div class=\"form-wrapper sign-in\">\n");
      out.write("        <form action=\"\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" name=\"txtunm\" required>\n");
      out.write("                <label for=\"\">Username</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"password\" name=\"txtpass\" required>\n");
      out.write("                <label for=\"\">Password</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"remember\">\n");
      out.write("                <label for=\"\"><input type=\"checkbox\">Remember me</label>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\">login</button>\n");
      out.write("             <tr>\n");
      out.write("                 <td  class=\"form\" align=\"center\"><a href=\"Forgetpassword.jsp\">Forget Password</a></td> \n");
      out.write("             </tr>\n");
      out.write("        </form>\n");
      out.write("         \n");
      out.write("         ");

         
         String unm=request.getParameter("txtunm");
         String pass=request.getParameter("txtpass");
         Statement st=con.createStatement();
         if(unm!=null && unm!="" && pass!=null && pass!="")
         {
            String str="Select * from customer_registration where Username='"+unm+"' and Password='"+pass+"'"; 
        
         ResultSet rs=st.executeQuery(str);
         if(rs.next())
         {
             out.println("<script> alert('login sucess....')</script>");
             session.setAttribute("unm1",unm);
             response.sendRedirect("Customerhomepage.jsp");
         }
         else
         {
            out.println("<script> alert('login failed....')</script>");
            response.sendRedirect("Registration.jsp");
         }
         }
         
      out.write("\n");
      out.write("     </div>\n");
      out.write("    </div>    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
