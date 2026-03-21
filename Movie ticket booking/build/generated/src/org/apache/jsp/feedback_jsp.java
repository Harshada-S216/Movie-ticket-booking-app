package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../main.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write(" body {\n");
      out.write("  background-color: lightskyblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#title-Tag-Line {\n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write(".form {\n");
      out.write("  background: #fff;\n");
      out.write("  box-shadow: 0 30px 60px 0 rgba(90, 116, 148, 0.4);\n");
      out.write("  border-radius: 5px;\n");
      out.write("  max-width: 480px;\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("  padding-top: 5px;\n");
      out.write("  padding-bottom: 5px;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  border-top: 5px solid #0e3721;\n");
      out.write("/*   z-index: 1; */\n");
      out.write("  animation: bounce 1.5s infinite;\n");
      out.write("}\n");
      out.write("::-webkit-input-placeholder {\n");
      out.write("  font-size: 1.3em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title{\n");
      out.write("  display: block;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  margin: 10px auto 5px;\n");
      out.write("  width: 300px;\n");
      out.write("}\n");
      out.write(".termsConditions{\n");
      out.write("  margin: 0 auto 5px 80px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pageTitle{\n");
      out.write("  font-size: 2em;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write(".secondaryTitle{\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name {\n");
      out.write("  background-color: #ebebeb;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write(".name:hover {\n");
      out.write("  border-bottom: 5px solid #0e3721;\n");
      out.write("  height: 30px;\n");
      out.write("  width: 380px;\n");
      out.write("  transition: ease 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".email {\n");
      out.write("  background-color: #ebebeb;\n");
      out.write("  height: 2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".email:hover {\n");
      out.write("  border-bottom: 5px solid #0e3721;\n");
      out.write("  height: 30px;\n");
      out.write("  width: 380px;\n");
      out.write("  transition: ease 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".message {\n");
      out.write("  background-color: #ebebeb;\n");
      out.write("  overflow: hidden;\n");
      out.write("  height: 10rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".message:hover {\n");
      out.write("  border-bottom: 5px solid #0e3721;\n");
      out.write("  height: 12em;\n");
      out.write("  width: 380px;\n");
      out.write("  transition: ease 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".formEntry {\n");
      out.write("  display: block;\n");
      out.write("  margin: 30px auto;\n");
      out.write("  min-width: 300px;\n");
      out.write("  padding: 10px;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  border: none;\n");
      out.write("  transition: all 0.5s ease 0s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".submit {\n");
      out.write("  width: 200px;\n");
      out.write("  color: white;\n");
      out.write("  background-color: darkorchid; \n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit:hover {\n");
      out.write("  box-shadow: 15px 15px 15px 5px rgba(78, 72, 77, 0.219);\n");
      out.write("  transform: translateY(-3px);\n");
      out.write("  width: 300px;\n");
      out.write("  border-top: 5px solid #0e3750;\n");
      out.write("  border-radius: 0%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes bounce {\n");
      out.write("  0% {\n");
      out.write("    tranform: translate(0, 4px);\n");
      out.write("  }\n");
      out.write("  50% {\n");
      out.write("    transform: translate(0, 8px);\n");
      out.write("  }\n");
      out.write("} \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".star-rating { \n");
      out.write("    display: flex; \n");
      out.write("    direction: row-reverse; \n");
      out.write("    justify-content: center; \n");
      out.write("    margin-bottom: 10px; \n");
      out.write("} \n");
      out.write(".star { \n");
      out.write("    font-size: 30px; \n");
      out.write("    color: #ccc; \n");
      out.write("    cursor: pointer; \n");
      out.write("    } \n");
      out.write(" \n");
      out.write(".star:hover, \n");
      out.write(".star:hover ~ .star { \n");
      out.write("    color: gold; \n");
      out.write("} \n");
      out.write(" \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("    <form class=\"form\">\n");
      out.write("      <div class=\"pageTitle title\"> FeedBack </div>\n");
      out.write("      <div class=\"secondaryTitle title\"> Tell us what you think....</div>\n");
      out.write("      <input type=\"text\" class=\"name formEntry\" placeholder=\"Name\" name=\"txtname\"  />\n");
      out.write("      <input type=\"text\" class=\"email formEntry\" placeholder=\"Email\" name=\"txtemail\" />\n");
      out.write("      <input class=\"message formEntry\" placeholder=\"Message\" type=\"text\" name=\"txtmessage\" value=\"\" />\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div class=\"star-rating\"> \n");
      out.write("            <span class=\"star\" data-value=\"1\">&#9733;</span> \n");
      out.write("            <span class=\"star\" data-value=\"2\">&#9733;</span> \n");
      out.write("            <span class=\"star\" data-value=\"3\">&#9733;</span> \n");
      out.write("            <span class=\"star\" data-value=\"4\">&#9733;</span> \n");
      out.write("            <span class=\"star\" data-value=\"5\">&#9733;</span> \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <button class=\"submit formEntry\" onclick=\"thanks()\">Submit</button> \n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"app.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         ");

           String name=request.getParameter("txtname");
           String email=request.getParameter("txtemail");
           String message=request.getParameter("txtmessage");
           Statement st1=con.createStatement();
          if(name!=null && name!="" && email!=null && email!="" && message!=null && message!="")
           {
               String str2="insert into feedback(Name,Email,Message)values('"+name+"','"+email+"','"+message+"')";
               int a=st1.executeUpdate(str2);
               out.println("<script>alert('Your FeedBack is Submitted...')</script>");
           
           }
           
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("const stars = document.querySelectorAll('.star'); \n");
      out.write(" \n");
      out.write("stars.forEach(star => { \n");
      out.write("    star.addEventListener('click', () => { \n");
      out.write("        const rating = star.getAttribute('data-value'); \n");
      out.write("        stars.forEach(s => { \n");
      out.write("            s.style.color = s.getAttribute('data-value') <= rating ? 'gold' : '#ccc'; \n");
      out.write("        }); \n");
      out.write("    }); \n");
      out.write("}); \n");
      out.write("</script>");
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
