package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Customer_005fBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              height:900%;\n");
      out.write("              width: 100%;\n");
      out.write("              background-position: center;\n");
      out.write("              background-size: cover;\n");
      out.write("              text-align: center;\n");
      out.write("              color: #f3f3f3;\n");
      out.write("              overflow-x:hidden;\n");
      out.write("              }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("      \n");
      out.write("      input[type=submit] {\n");
      out.write("        background-color:darkblue;\n");
      out.write("        border-color: black;\n");
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
      out.write("        \n");
      out.write("        ");

        String id=request.getParameter("Booking_id");
        String unm=(String)session.getAttribute("unm1");
        
      out.write("\n");
      out.write("        <section class=\"sub-header\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li ><a href=\"Customerhomepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"searchmovie.jsp\">Search Movie</a></li>\n");
      out.write("                <li><a href=\"cancel booking.jsp\">Cancel Booking</a></li>                \n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                <li><a href=\"Log_out.jsp\">Log out</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.print(unm);
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"title6\">\n");
      out.write("            <h1>Customer Booking</h1><br>\n");
      out.write("        </div>\n");
      out.write("              <br>     \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form style=\"color: black;\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                 <table border=\"5px\" align=\"center\" width=\"600px\" height=\"700px\" style=\"background-color: lavender\">\n");
      out.write("                    \n");
      out.write("                  ");

                 String nm=null;
                 String add=null;
                 String mob=null;
                 Statement st2=con.createStatement();
                 String str2="select * from customer_registration where Username='"+unm+"'";
                  ResultSet rs2=st2.executeQuery(str2);
                 while(rs2.next())
                 {
                  nm=rs2.getString(1);
                  mob=rs2.getString(2);
                  add=rs2.getString(4);
                  }
                  
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Customer Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtcnm\" value=\"");
      out.print(nm);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                   <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Address </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtadd\" value=\"");
      out.print(add);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Mobile Number</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtmobno\" value=\"");
      out.print(mob);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr> \n");
      out.write("                        <td width=\"400px\" align=\"center\"> Sr No.</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtsrno\" value=\"");
      out.print(id);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                   </tr>\n");
      out.write("                    ");

                 int Srno=0;
                 String ct=null;
                 String th=null;
                 String mn=null;
                 String img=null;
                 String ds=null;
                 String sh=null;
                 int rt=0;
                 String lang=null;
                 Statement st=con.createStatement();
                 String str="Select * from add_movie where Sr_No="+id+"";
                 ResultSet rs=st.executeQuery(str);
                 while(rs.next())
                  {
                  lang=rs.getString(2);
                  ct=rs.getString(3);
                  th=rs.getString(4);
                  mn=rs.getString(5);
                  img=rs.getString(6);
                  ds=rs.getString(7);
                  sh=rs.getString(8);
                  rt=rs.getInt(9);
                  }
                  
      out.write("\n");
      out.write("                 \n");
      out.write("                   \n");
      out.write("                     <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Language </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtlang\" value=\"");
      out.print(lang);
      out.write("\" readonly=\"true\"/>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">City_Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtct\" value=\"");
      out.print(ct);
      out.write("\" readonly=\"true\"/>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Theater </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txttheater\" value=\"");
      out.print(th);
      out.write("\" readonly=\"true\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Movie_Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtmname\" value=\"");
      out.print(mn);
      out.write("\" readonly=\"true\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Image </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><img src=\"");
      out.print(img);
      out.write("\" width=\"120\" height=\"100\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> No.of Seats </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtseat\" value=\"\" />\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\">Showtime</td>\n");
      out.write("                         <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtshow\" value=\"");
      out.print(sh);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Rate </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtrate\" value=\"");
      out.print(rt);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                  \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\" colspan=\"2px\"><input type=\"submit\" value=\"Book Now\" name=\"Book Now\" /></td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\" colspan=\"2px\" ><a href=\"confirmbooking.jsp\">confirm booking</a></td> \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                    String name=request.getParameter("txtcnm");
                    String mobno=request.getParameter("txtmobno");
                    String add1=request.getParameter("txtadd");
                    String srno=request.getParameter("txtsrno");
                    String lang1=request.getParameter("txtlang");
                    String city=request.getParameter("txtct");
                    String th1=request.getParameter("txttheater");
                    String mn1=request.getParameter("txtmname");
                    String seat=request.getParameter("txtseat");
                    String show=request.getParameter("txtshow");
                    String rate=request.getParameter("txtrate");
                    Statement st3= con.createStatement();
                    if( name!=null && name!="" && mobno!=null && mobno!="" && add1!=null && add1!="" && srno!=null && srno!="" && lang1!=null && lang1!="" && city!=null && city!="" && th1!=null && th1!="" && mn1!=null && mn1!="" && seat!=null && seat!="" && show!=null && show!="" && rate!=null && rate!="")
                    {
                     String str3="insert into customer_booking(Name,Address,Mobile_no,Srno,language,City_Name,Theater,Movie_name,Movie_img,No_ofseats,Showtime,Rate)values('"+name+"','"+add1+"','"+mobno+"',"+srno+",'"+lang1+"','"+city+"','"+th1+"','"+mn1+"','"+img+"',"+seat+",'"+show+"',"+rate+")";
                     int a=st3.executeUpdate(str3);
                     out.println("<script> alert('Booking sucessfull....')</script>");
                    }
                    session.setAttribute("Name", name);
                    session.setAttribute("Add1", add1);
                    session.setAttribute("Mobno", mobno);
                    session.setAttribute("Srno", srno);
                    session.setAttribute("Lang1", lang1);
                    session.setAttribute("City", city);
                    session.setAttribute("Th1", th1);
                    session.setAttribute("Mn1", mn1);
                    session.setAttribute("Seat1", seat);
                    session.setAttribute("Show1",show );
                    session.setAttribute("Rate", rate);
                    
                    
      out.write("\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                 \n");
      out.write("            </form>\t\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\t </section>\n");
      out.write("\n");
      out.write("      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            \n");
      out.write("     \n");
      out.write("   </body>\n");
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
