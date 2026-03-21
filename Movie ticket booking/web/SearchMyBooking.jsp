<%-- 
    Document   : SearchMyBooking
    Created on : 1 Jan, 2025, 11:09:44 AM
    Author     : harsh
--%>

<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link href="css/new2.css" rel="stylesheet" type="text/css"/>
        <style type="text/css">
            label{
                width:150px;
                display: inline-block;
            }
            *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Trebuchet MS', sans-serif;
            }
            .container{
                width: 100%;
                height: 20vh;
                display: flex;
                align-items: center;
                justify-content:center;
                color: #000;
            }
             body{

              height:900%;
              width: 100%;
              background-position: center;
              background-size: cover;
              text-align: center;
              color: #f3f3f3;
              overflow-x: hidden;

              }
    </style> 
    <script language="javascript">
        function editRecord(id)
        {
            var f=document.form;
            f.method="post";
            f.action='cancelbooking.jsp?CancelBookingid='+id;
            f.submit();
        }
    </script>
    </head>
    <style>
      
      input[type=submit] {
        background-color:blue;
        border-color:darkblue;
        border-width: medium;
        color: #fff;
        padding: 12px 25px;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;
        border-radius: 20px;
      }
     
    </style>
    <style>
        table{
            border: 3px solid black;
            border-collapse: collapse;
        }
    </style>
    <style>
    nav{
    background: rgb(5,10,246);
    background: linear-gradient(90deg, rgba(5,10,246,1) 0%, rgba(8,238,192,1) 50%, rgba(88,9,224,1) 100%);
    border-radius: 50px;
    padding: 10px;
    box-shadow: 0 25px 20px -20px rgba(0, 0, 0, 0.4);
     
}
    </style>
    
       <%
        String unm=(String)session.getAttribute("unm1");
       
        %>
    <body style="background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;">
        
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            
            <ul>
                <li><a href="Admin_homepage.jsp">Home<br></a></li>
                <li><a href="Search_Movie.jsp">Search Movie </a></li>
                <li><a href="Booking.jsp">Booking</a></li>
                <li><a href="Logout.jsp"> Logout</a></li>

            </ul>
            
        </nav>
        </div>
           <%=unm%>       
        <div class="title6">
            <h1>Search My Booking</h1><br>
        </div>
         <br>     
        <div align="center">
            <form style="color: black;" method="post" name="form">
                <%
                String nm=null;
                Statement st1=con.createStatement();
                String str1="select * from customer_registration where Username='"+unm+"'";
                ResultSet rs1=st1.executeQuery(str1);
                while(rs1.next())
                {
                    nm=rs1.getString(1);
                }
                %>
            
                 <table border="5px" align="center" width="1000px" height="500px" style="background-color: lavender">
                    
                      <tr>
                          <td width="400px" height="90px" align="center" colspan="12px">Booking Date</td>
                        <td width="400px" height="90px" align="center"><input type="date" name="txtdate" value=""/></td>
                     </tr>
                      <tr>
                        <td width="400px" height="90px" align="center" colspan="12px">Name</td>
                        <td width="400px" height="90px" align="center"><input type="text" name="txtnm" value="<%=unm%>" /></td>
                      </tr>
                     <tr>
                     <td width="400px" height="70" align="center" colspan="14px"><input type="submit" value="Search Movie" name="Search Movie" /></td>
                    </tr>
                    
                    
                  <tr><td align="center" width="200">Id</td><td align="center" width="200">Name</td><td align="center" width="200">Address</td><td align="center" width="200">Mobile No</td><td align="center" width="200">Sr no</td><td align="center" width="200">Language</td><td align="center" width="200">City Name</td><td align="center" width="200">Theaters</td><td align="center" width="200">Movie name</td><td align="center"width="200">No of Seats</td><td align="center" width="200">Showtime</td><td align="center" width="200">Rate</td><td align="center" width="200">Total</td></tr>  
                 <%
                 String id=null;
                 String name=null;
                 String add=null;
                 String mobno=null;
                 String srno=null;
                 String lang=null;
                 String ct=null;
                 String th=null;
                 String mn=null; 
                 String seat=null;
                 String show=null;
                 String rate=null;
                 String tot=null;    
                 String date=request.getParameter("txtdate");
                 Statement st=con.createStatement();
                 String str="Select * from confirm_booking where Booking_date='"+date+"' and Name='"+nm+"'";
                 ResultSet rs=st.executeQuery(str);
                 while(rs.next())
                 {
                  id=rs.getString(1);
                  name=rs.getString(3);
                  add=rs.getString(4);
                  mobno=rs.getString(5);
                  srno=rs.getString(6);
                  lang=rs.getString(7);
                  ct=rs.getString(8);
                  th=rs.getString(9);
                  mn=rs.getString(10);
                  seat=rs.getString(11);
                  show=rs.getString(12);
                  rate=rs.getString(13);
                  tot=rs.getString(14);
                  %>
                  <tr><td align="center"><%=id%></td><td align="center"><%=name%></td><td align="center"><%=add%></td><td align="center"><%=mobno%></td><td align="center"><%=srno%></td><td align="center"><%=lang%></td><td align="center"><%=ct%></td><td align="center"><%=th%></td><td align="center"><%=mn%></td><td align="center"><%=seat%></td><td align="center"><%=show%></td><td align="center"><%=rate%></td><td align="center"><%=tot%></td><td align="center"><input type="button"name="Cancel" value="Cancel"style="background-color: darkblue;font-weight: bold;color: white;font-size: larger;"onclick="editRecord(<%=rs.getInt(1)%>)"/></td></tr>
               
                  <%
                  }
                  %>
                
              </table>
             </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>


