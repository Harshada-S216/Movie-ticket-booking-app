package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class confirmbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                  ");

                 /* String id=request.getParameter("Booking_id");*/
                    String unm=(String)session.getAttribute("unm1");
                    String name2=(String)session.getAttribute("Name");
                    String add2=(String)session.getAttribute("Add1");
                    String mobno2=(String)session.getAttribute("Mobno");
                    String srno2=(String)session.getAttribute("Srno");
                    String lang2=(String)session.getAttribute("Lang1");
                    String city2=(String)session.getAttribute("City");
                    String th2=(String)session.getAttribute("Th1");
                    String mn2=(String)session.getAttribute("Mn1");
                    String seat2=(String)session.getAttribute("Seat1");
                    String show2=(String)session.getAttribute("Show1");
                    String rate2=(String)session.getAttribute("Rate");  
                  
      out.write("\n");
      out.write("        <section class=\"sub-header\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Customerhomepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"Customer_Booking.jsp\">Customer Booking<br></a></li>\n");
      out.write("                <li><a href=\"SearchMyBooking.jsp\">Search my Booking</a></li>                \n");
      out.write("                <li><a href=\"Payment.jsp\">Payment</a></li>                \n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\">Log out</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.print(unm);
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"title6\">\n");
      out.write("            <h1>Confirm Booking</h1><br>\n");
      out.write("        </div>\n");
      out.write("              <br>     \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form style=\"color: black;\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                 <table border=\"5px\" align=\"center\" width=\"600px\" height=\"700px\" style=\"background-color: lavender\">\n");
      out.write("                     \n");
      out.write("                      ");

                     int i=0;
                     Statement st1= con.createStatement();
                     String str1="select count(*) from confirm_booking";
                     ResultSet rs1=st1.executeQuery(str1);
                     if(rs1.next())
                             {
                                 i=rs1.getInt(1);
                                 i++;
                             }
                     
      out.write("          \n");
      out.write("                     <tr> \n");
      out.write("                        <td width=\"400px\" align=\"center\">Booking Id</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txttno\" value=\"");
      out.print(i);
      out.write("\" /></td>\n");
      out.write("                   </tr>                                  \n");
      out.write("                  <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Booking_Date </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"date\" name=\"txtdate\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Customer Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtcnm\" value=\"");
      out.print(name2);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Mobile Number</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtmobno\" value=\"");
      out.print(mobno2);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Address </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtadd\" value=\"");
      out.print(add2);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <tr> \n");
      out.write("                        <td width=\"400px\" align=\"center\"> Sr No.</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtsrno\" value=\"");
      out.print(srno2);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                   </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Language </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtlang\" value=\"");
      out.print(lang2);
      out.write("\" readonly=\"true\"/>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">City_Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtct\" value=\"");
      out.print(city2);
      out.write("\" readonly=\"true\"/>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Theater </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txttheater\" value=\"");
      out.print(th2);
      out.write("\" readonly=\"true\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\">Movie_Name</td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtmname\" value=\"");
      out.print(mn2);
      out.write("\" readonly=\"true\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> No.of Seats </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtseat\" value=\"");
      out.print(seat2);
      out.write("\" />\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\">Showtime</td>\n");
      out.write("                         <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtshow\" value=\"");
      out.print(show2);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Rate </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txtrate\" value=\"");
      out.print(rate2);
      out.write("\" readonly=\"true\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    int tot=0;int s=0;int r=0;
                   
                   
                     r=Integer.parseInt(rate2);
                     s=Integer.parseInt(seat2);
                     tot=r*s;
                    
                    
                    
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\"> Total </td>\n");
      out.write("                        <td width=\"400px\" align=\"center\"><input type=\"text\" name=\"txttotal\" value=\"");
      out.print(tot);
      out.write("\" />\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"400px\" align=\"center\" colspan=\"2px\"><input type=\"submit\" value=\"Confirm Booking\" name=\"Confirm Booking\" /></td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\" colspan=\"2px\" ><a href=\"Payment.jsp\">Payment</a></td> \n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("                   ");

                    String Id=request.getParameter("txttno");
                    String Date=request.getParameter("txtdate");
                    String name=request.getParameter("txtcnm");
                    String mobno=request.getParameter("txtmobno");
                    String add1=request.getParameter("txtadd");
                    String srno=request.getParameter("txtsrno");
                    String lang1=request.getParameter("txtlang");
                    String city=request.getParameter("txtct");
                    String th1=request.getParameter("txttheater");
                    String mn1=request.getParameter("txtmname");
                    String seat1=request.getParameter("txtseat");
                    String show=request.getParameter("txtshow");
                    String rate=request.getParameter("txtrate");
                    String Total=request.getParameter("txttotal");

                    Statement st3= con.createStatement();
                    if( Date!=null && Date!="" && name!=null && name!="" && mobno!=null && mobno!="" && add1!=null && add1!="" && srno!=null && srno!="" && lang1!=null && lang1!="" && city!=null && city!="" && th1!=null && th1!="" && mn1!=null && mn1!="" && show!=null && show!="" && seat1!=null && seat1!="" && rate!=null && rate!="")
                    {
                     String str3="insert into confirm_booking(Booking_id,Booking_date,Name,Address,Mobile_no,Srno,language,City_Name,Theater,Movie_name,No_ofseats,Showtime,Rate,Total)values("+i+",'"+Date+"','"+name+"','"+add1+"','"+mobno+"',"+srno+",'"+lang1+"','"+city+"','"+th1+"','"+mn1+"',"+seat1+",'"+show+"',"+rate+","+Total+")";
                     int a=st3.executeUpdate(str3);
                     out.println("<script> alert('Booking sucessfull....')</script>");
                    }
                    
                   
      out.write("    \n");
      out.write("                   \n");
      out.write("                   ");

                    session.setAttribute("Bookid", Id);
                    session.setAttribute("Name", name);
                    session.setAttribute("Mn1", mn1);
                    session.setAttribute("Total", Total);
                   
      out.write("\n");
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
