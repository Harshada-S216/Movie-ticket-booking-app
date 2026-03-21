package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Payment_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Movie Ticket Payment</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #333;\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("        .form-group input, .form-group select {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        .form-group input[type=\"date\"] {\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .form-group input[type=\"number\"] {\n");
      out.write("            -moz-appearance: textfield;\n");
      out.write("        }\n");
      out.write("        .form-group input[type=\"number\"]::-webkit-outer-spin-button,\n");
      out.write("        .form-group input[type=\"number\"]::-webkit-inner-spin-button {\n");
      out.write("            -webkit-appearance: none;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .payment-button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 15px;\n");
      out.write("            background-color: #002BFF;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .payment-button:hover {\n");
      out.write("            background-color: #002BFF;\n");
      out.write("        }\n");
      out.write("        .payment-button:active {\n");
      out.write("            background-color: #0078ff;\n");
      out.write("        }\n");
      out.write("        .upi-info {\n");
      out.write("            font-size: 18px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 20px 0;\n");
      out.write("        }\n");
      out.write("         h1 {\n");
      out.write("            color: darkblue;\n");
      out.write("            font-size: 50px;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            color: #023e8a;\n");
      out.write("            font-size: 25px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("     ");

        String unm=(String)session.getAttribute("unm1");
        String bookid=(String)session.getAttribute("Bookid");
        String name2=(String)session.getAttribute("Name");
        String mn2=(String)session.getAttribute("Mn1");
        String Total1=(String)session.getAttribute("Total");
        String date1=(String)session.getAttribute("Date1");
     
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Payment</h1>\n");
      out.write("        <form>\n");
      out.write("             <div class=\"container\">\n");
      out.write("           <h2>Make Your Payment</h2>\n");
      out.write("           <p>To complete your payment, please use the UPI ID below:</p>\n");
      out.write("         <div class=\"upi-info\">\n");
      out.write("            <strong>UPI ID:</strong> rohinisuryawanshi0107@ibl\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"payment-date\">Payment Date:</label>\n");
      out.write("                <input type=\"date\" id=\"payment-date\" name=\"txtpdate\" required >\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"booking-id\">Booking ID:</label>\n");
      out.write("                <input type=\"text\" id=\"booking-id\" name=\"txtid\"  value=\"");
      out.print(bookid);
      out.write("\" placeholder=\"Enter your booking ID\" readonly=\"true\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Name:</label>\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"txtnm\" value=\"");
      out.print(unm);
      out.write("\" placeholder=\"Enter your name\" readonly=\"true\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"movie-name\">Movie Name:</label>\n");
      out.write("                <input type=\"text\" id=\"movie-name\" name=\"txtmn\" value=\"");
      out.print(mn2);
      out.write("\" placeholder=\"Enter the movie name\" readonly=\"true\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"total-amount\">Total Amount (₹):</label>\n");
      out.write("                <input type=\"number\" id=\"total-amount\" name=\"txttotal\" value=\"");
      out.print(Total1);
      out.write("\" placeholder=\"Enter the total amount\" readonly=\"true\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"upi-id\">UPI ID:</label>\n");
      out.write("                <input type=\"text\" id=\"upi-id\" name=\"txtupi\" placeholder=\"Enter your UPI ID\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"payment-button\">Make Payment</button>\n");
      out.write("            \n");
      out.write("                       <tr>\n");
      out.write("                         <td width=\"400px\" align=\"center\" colspan=\"2px\" ><a href=\"payrecipt.jsp\">Pay receipt</a></td> \n");
      out.write("                    </tr>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("         ");

           String pdate=request.getParameter("txtpdate");
           String id=request.getParameter("txtid");
           String name=request.getParameter("txtnm");
           String mn=request.getParameter("txtmn");
           String tot=request.getParameter("txttotal");
           String upi=request.getParameter("txtupi");
           Statement st1=con.createStatement();
          if(id!=null && id!="" && name!=null && name!="" && mn!=null && mn!="" && tot!=null && tot!="" && pdate!=null && pdate!="" && upi!=null && upi!="" )
           {
               String str2="insert into payment(paydate,Booking_id,Name,Movie_name,Total,Upi)values('"+pdate+"',"+id+",'"+name+"','"+mn+"',"+tot+",'"+upi+"')";
               int a=st1.executeUpdate(str2);
               out.println("<script>alert('Your payment is Successfull...')</script>");
           
           }
           
      out.write("           \n");
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
