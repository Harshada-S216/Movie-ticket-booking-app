package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Admincancelbookingcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/new2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            label{\n");
      out.write("                width:150px;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: 'Trebuchet MS', sans-serif;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 30vh;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content:center;\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("             body{\n");
      out.write("\n");
      out.write("              height:900%;\n");
      out.write("              width: 100%;\n");
      out.write("              background-position: center;\n");
      out.write("              background-size: cover;\n");
      out.write("              text-align: center;\n");
      out.write("              color: #f3f3f3;\n");
      out.write("             /* overflow-y: hidden;*/\n");
      out.write("              overflow-x: hidden;\n");
      out.write("\n");
      out.write("              }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("      \n");
      out.write("      input[type=submit] {\n");
      out.write("        background-color:blue;\n");
      out.write("        border-color: darkblue;\n");
      out.write("        border-width: medium;\n");
      out.write("        color: #fff;\n");
      out.write("        padding: 12px 25px;\n");
      out.write("        text-decoration: none;\n");
      out.write("        margin: 4px 2px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        border-radius: 20px;\n");
      out.write("        animation: float 2s ease-in-out infinite;\n");
      out.write("        }\n");
      out.write("        @keyframes float{\n");
      out.write("            0%, 100%{\n");
      out.write("                transform: translateY(0);\n");
      out.write("            }\n");
      out.write("            50%{\n");
      out.write("                transform: translateY(-10px);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("     \n");
      out.write("    </style>\n");
      out.write("    <style>\n");
      out.write("        table{\n");
      out.write("            border: 3px solid black;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <style>\n");
      out.write("        nav{\n");
      out.write("    background: rgb(5,10,246);\n");
      out.write("    background: linear-gradient(90deg, rgba(5,10,246,1) 0%, rgba(8,238,192,1) 50%, rgba(88,9,224,1) 100%);\n");
      out.write("    border-radius: 50px;\n");
      out.write("    padding: 10px;\n");
      out.write("    box-shadow: 0 25px 20px -20px rgba(0, 0, 0, 0.4);\n");
      out.write("     \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body style=\"background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;\">\n");
      out.write("         ");

        String unm=(String)session.getAttribute("unm1");
         
      out.write("\n");
      out.write("        <section class=\"sub-header\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("        <nav>\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                <li ><a href=\"adminhomepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"Addmovieadmin.jsp\">Add Movie</a></li>\n");
      out.write("                <li><a href=\"AdminNowDateBooking.jsp\">Now Date Booking</a></li>\n");
      out.write("                <li><a href=\"Admincancelbookingcheck.jsp\">Cancel booking</a></li>\n");
      out.write("                <li ><a href=\"logout.jsp\">Log Out<br></a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("           ");
      out.print(unm);
      out.write("          \n");
      out.write("        <div class=\"title6\">\n");
      out.write("            <h1>Cancel Movie ticket request</h1><br>\n");
      out.write("        </div>\n");
      out.write("              <br>     \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form style=\"color: black;\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                 <table border=\"5px\" align=\"center\" width=\"900px\" height=\"500px\" style=\"background-color: lavender\">\n");
      out.write("                                                       \n");
      out.write("                    <tr> \n");
      out.write("                        <td width=\"400px\" height=\"90px\" align=\"center\" colspan=\"7px\"> Date </td>\n");
      out.write("                        <td width=\"400px\" height=\"90px\" align=\"center\"><input type=\"date\" name=\"txtdate\" value=\"\" /></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td width=\"400px\" height=\"90\" align=\"center\" colspan=\"15px\"><input type=\"submit\" value=\"Check Cancel Booking\" name=\"Check Cancel Booking\" /></td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                     <tr colspan=\"8px\"><td align=\"center\" width=\"250\">Id</td><td align=\"center\" width=\"250\">Date</td><td align=\"center\" width=\"250\">Name</td><td align=\"center\" width=\"250\">Mobile No</td><td align=\"center\" width=\"260\">Movie name </td><td align=\"center\" width=\"250\">Cancel Booking Id</td><td align=\"center\" width=\"250\">Cancel Booking Date</td><td align=\"center\" width=\"250\">Rate</td></tr>  \n");
      out.write("                 ");

                 String cid=null;
                String cdate=null;
                 String name=null;
                 String mobno=null;
                 String id=null;
               /*  String date=null;*/
                 String mn=null;
                 String rt=null;    
                 String date=request.getParameter("txtdate");
                 Statement st=con.createStatement();
                 String str="Select * from cancel_booking where Booking_date='"+date+"'";
                 ResultSet rs=st.executeQuery(str);
                 while(rs.next())
                 {
                  id=rs.getString(1);
                  date=rs.getString(2);
                  name=rs.getString(3);
                  mobno=rs.getString(4);
                  mn=rs.getString(5);
                  cid=rs.getString(6);
                  cdate=rs.getString(7);
                  rt=rs.getString(8);
                  
      out.write("\n");
      out.write("                  <tr><td align=\"center\">");
      out.print(id);
      out.write("</td><td align=\"center\">");
      out.print(date);
      out.write("</td><td align=\"center\">");
      out.print(name);
      out.write("</td><td align=\"center\">");
      out.print(mobno);
      out.write("</td><td align=\"center\">");
      out.print(mn);
      out.write("</td><td align=\"center\">");
      out.print(cid);
      out.write("</td><td align=\"center\">");
      out.print(cdate);
      out.write("</td><td align=\"center\">");
      out.print(rt);
      out.write("</td></tr>\n");
      out.write("                  ");

                  }
                  
      out.write("\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </form>\t\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\t </section>\n");
      out.write("\n");
      out.write("      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            \n");
      out.write("     \n");
      out.write("   </body>\n");
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
