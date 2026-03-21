package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class Addmovieadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                height: 20vh;\n");
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
      out.write("    box-shadow: 0 25px 20px -20px rgba(0, 0, 0, 0.4);     \n");
      out.write("     }\n");
      out.write("    </style>\n");
      out.write("    <body style=\"background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;\">\n");
      out.write("        \n");
      out.write("        <section class=\"sub-header\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                 <li><a href=\"adminhomepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"Addmovieadmin.jsp\">Add Movie</a></li>\n");
      out.write("                <li><a href=\"AdminNowDateBooking.jsp\">Now Date Booking</a></li>\n");
      out.write("                <li><a href=\"Admincancelbookingcheck.jsp\">Cancel booking</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\">Log Out<br></a></li>\n");
      out.write("            </ul>    \n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <div class=\"title6\">\n");
      out.write("            <h1>Add Movie</h1><br>\n");
      out.write("        </div>\n");
      out.write("              <br>     \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form style=\"color: black;\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                 <table border=\"5px\" align=\"center\" width=\"500px\" height=\"600px\" style=\"background-color: lavender\">\n");
      out.write("                     ");

                     int i=0;
                     Statement st= con.createStatement();
                     String str="select count(*) from add_movie";
                     ResultSet rs=st.executeQuery(str);
                     if(rs.next())
                             {
                                 i=rs.getInt(1);
                                 i++;
                             }
                     
      out.write("                                  \n");
      out.write("                    <tr> \n");
      out.write("                        <td width=\"400px\" align=\"center\">Sr no.</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> ");
      out.print(i);
      out.write(" </td>\n");
      out.write("                   </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Language</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><select name=\"Language\">\n");
      out.write("                                <option>Hindi</option>\n");
      out.write("                                <option>Marathi</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">City Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><select name=\"cityname\">\n");
      out.write("                                <option>Karad</option>\n");
      out.write("                                <option> Mumbai </option>\n");
      out.write("                                <option> Satara </option>\n");
      out.write("                                <option> Ahmedabad </option>\n");
      out.write("                                <option> Kolhapur </option>\n");
      out.write("                                <option> Vita</option>\n");
      out.write("                                <option> Rahimatpur </option>\n");
      out.write("                                <option> Nagpur </option>\n");
      out.write("                                <option> Sangali</option>\n");
      out.write("                                <option> Solapur</option>\n");
      out.write("                            </select></td>\n");
      out.write("                            <td width=\"400px\" align=\"center\"><input type=\"submit\" value=\"Search\" name=\"Search\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                     String ct=request.getParameter("cityname");
                     String th=null;
                     Statement st3=con.createStatement();
                     String str3="select * from theaterinfo where City_name='"+ct+"'";
                     ResultSet rs3=st3.executeQuery(str3);
                     
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                       <td width=\"400px\" align=\"center\">Theaters</td>\n");
      out.write("                       <td width=\"400px\" align=\"center\"><select name=\"thname\">\n");
      out.write("                               ");
                          while(rs3.next())
                {

      out.write("\n");
      out.write("                               <option>");
      out.print(rs3.getString(2));
      out.write("</option>\n");
      out.write("                               ");

                                       }
                     
      out.write("\n");
      out.write("                           </select></td>  \n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                     <tr>\n");
      out.write("                       <td width=\"400px\" align=\"center\">Movie name</td>\n");
      out.write("                       <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtmoviename\" value=\"\" /></td>  \n");
      out.write("                    </tr>\n");
      out.write("                     ");

                    String img=request.getParameter("fileupload");
                    File f=new File("img/");
                    img="img/"+img;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                       <td width=\"400px\" align=\"center\">Movie Image</td>\n");
      out.write("                       <td width=\"400px\" align=\"center\"><input type=\"file\" name=\"fileupload\" value=\"\" /></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\">Movie discription</td>\n");
      out.write("                         <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtdesc\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\">Showtime</td>\n");
      out.write("                         <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtshow\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\">Rate</td>\n");
      out.write("                         <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtrate\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                     <td width=\"400px\" align=\"center\" colspan=\"2px\"><input type=\"submit\" value=\"Add Movie\" name=\"Add Movie\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("                ");

                 String lang=null;
                 String th1=null;
                 String mn=null;
                 String ds=null;
                 String sh=null;
                 String rt=null;
                 lang=request.getParameter("Language");
                 th1=request.getParameter("thname");
                 mn=request.getParameter("txtmoviename");
                 ds=request.getParameter("txtdesc");
                 sh=request.getParameter("txtshow");
                 rt=request.getParameter("txtrate");
                 Statement st1= con.createStatement();
                 if(lang!=null && lang!="" && th1!=null && th1!=""&& mn!=null && mn!=""&&  ds!=null && ds!="" && sh!=null && sh!="" && rt!=null && rt!="")
                 {
                  String str1="insert into add_movie(Sr_No,Language,City_Name,Theaters,Movie_Name,Movie_Image,Description,Showtime,Rate) values("+i+",'"+lang+"','"+ct+"','"+th1+"','"+mn+"','"+img+"','"+ds+"','"+sh+"',"+rt+")"; 
                  int a= st1.executeUpdate(str1);
                  out.println("<script> alert('Movie Added....')</script>");

                 }    
                
      out.write("\n");
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
