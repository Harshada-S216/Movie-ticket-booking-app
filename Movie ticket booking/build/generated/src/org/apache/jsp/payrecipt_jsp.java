package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class payrecipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Payment Receipt</title>\n");
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
      out.write("        .receipt-details {\n");
      out.write("            font-size: 18px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .receipt-details p {\n");
      out.write("            margin: 10px 0;\n");
      out.write("        }\n");
      out.write("        .receipt-details strong {\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        .print-button {\n");
      out.write("            display: block;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 15px;\n");
      out.write("            background-color: #002BFF;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .print-button:hover {\n");
      out.write("            background-color: #0078ff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function printReceipt() {\n");
      out.write("            window.print();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Payment Receipt</h1>\n");
      out.write("        <div class=\"receipt-details\">\n");
      out.write("            ");

                String bookid = request.getParameter("Bookid");
                String name = request.getParameter("Name");
                String movieName = request.getParameter("MovieName");
                String totalAmount = request.getParameter("TotalAmount");

                Statement st2 = con.createStatement();
                String query = "SELECT * FROM payment WHERE Booking_id = " + bookid;
                ResultSet rs = st2.executeQuery(query);
                if(rs.next()) {
                    name = rs.getString("Name");
                    movieName = rs.getString("Movie_name");
                    totalAmount = rs.getString("Total");
                }
            
      out.write("\n");
      out.write("            <p><strong>Booking ID:</strong> ");
      out.print( bookid );
      out.write("</p>\n");
      out.write("            <p><strong>Name:</strong> ");
      out.print( name );
      out.write("</p>\n");
      out.write("            <p><strong>Movie Name:</strong> ");
      out.print( movieName );
      out.write("</p>\n");
      out.write("            <p><strong>Total Amount (₹):</strong> ");
      out.print( totalAmount );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"print-button\" onclick=\"printReceipt()\">Print Receipt</button>\n");
      out.write("    </div>\n");
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
