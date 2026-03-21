<%-- 
    Document   : SearchBooking
    Created on : 15 Feb, 2025, 1:07:54 PM
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
                height: 30vh;
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
    </head>
    <style>
      
      input[type=submit] {
        background-color:blue;
        border-color: black;
        border-width: medium;
        color: #fff;
        padding: 12px 25px;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;
        border-radius: 20px;
        animation: float 2s ease-in-out infinite;
        }
        @keyframes float{
            0%, 100%{
                transform: translateY(0);
            }
            50%{
                transform: translateY(-10px);
            }
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
    <body style="background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;">
                  
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
         <nav>
            <ul>
                <li ><a href="Customerhomepage.jsp">Home<br></a></li>
                <li><a href="searchmovie.jsp">Search Movie</a></li>
                <li><a href="cancel booking.jsp">Cancel Booking</a></li>                
                <li><a href="feedback.jsp">Feedback</a></li>
                <li><a href="Log_out.jsp">Log out</a></li>
            </ul>
        </nav>
        </div>
      
        <div class="title6">
            <h1>Search Booking</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="8px" align="center" width="1300px" height="500px" style="background-color:lavender">
                     
                     
                                                  
                    
       <tr><td align="center" width="400">Booking Id</td><td align="center" width="400">Booking date</td><td align="center" width="400">Customer Name</td><td align="center" width="400">Address</td><td align="center" width="400">Mobile no</td><td align="center" width="400">Sr no</td><td align="center" width="400">Language</td><td align="center" width="400"></td><td align="center" width="400">City Name</td><td align="center" width="400">Theater</td><td align="center" width="400">Movie Name</td><td align="center" width="400">No of Seats</td><td align="center" width="400">showtime</td><td align="center" width="400">Rate</td><td align="center" width="400">Total</td></tr>  

                   <%
                   String bookid=null;
                   String bookdate=null;
                   String cname=null;
                   String add=null;
                   String mobno=null;                  
                   String Srno=null;
                   String lang=null;
                   String ctname=null;
                   String theater=null;
                   String mn=null;
                   String seat=null;
                   String show=null;
                   String rate=null;
                   String total=null;
               
                   Statement st2=con.createStatement();
                   String str2="select * from confirm_booking";
                   ResultSet rs=st2.executeQuery(str2);
                   while(rs.next())
                           {  
                               bookid=rs.getString(1);
                               bookdate=rs.getString(2);
                               cname=rs.getString(3);
                               add=rs.getString(4);
                               mobno=rs.getString(5);                             
                               Srno=rs.getString(6);
                               lang=rs.getString(7);
                               ctname=rs.getString(8);
                               theater=rs.getString(9);
                               mn=rs.getString(10);
                               seat=rs.getString(11);
                               show=rs.getString(12);
                               rate=rs.getString(13);
                               total=rs.getString(14);
                     %>
                     <tr><td align="center"><%=bookid%></td><td align="center"><%=bookdate%></td><td align="center"><%=cname%></td><td align="center"><%=add%></td><td align="center"><%=mobno%></td><td align="center"><%=Srno%></td<td align="center"><%=lang%></td><td align="center"><%=ctname%></td><td align="center"><%=theater%></td><td align="center"><%=mn%></td><td align="center"><%=seat%></td><td align="center"><%=show%></td><td align="center"><%=rate%></td><td align="center"><%=total%></td></tr>
          
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


