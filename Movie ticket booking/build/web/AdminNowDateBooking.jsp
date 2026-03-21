<%-- 
    Document   : AdminNowDateBooking
    Created on : 24 Oct, 2024, 7:48:40 PM
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
             /* overflow-y: hidden;*/
              overflow-x: hidden;

              }
    </style>
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
    
     <%
        String unm=(String)session.getAttribute("unm1");
     %>
        
    <body style="background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;">
        
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            
            <ul>
                <li ><a href="adminhomepage.jsp">Home<br></a></li>
                <li><a href="Addmovieadmin.jsp">Add Movie</a></li>
                <li><a href="AdminNowDateBooking.jsp">Now Date Booking</a></li>
                <li><a href="Admincancelbookingcheck.jsp">Cancel booking</a></li>
                <li ><a href="logout.jsp">Log Out<br></a></li>
            </ul>
            
        </nav>
        </div>
        <%=unm%>       
      
        <div class="title6">
            <h1>Now Date Booking</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="1000px" height="500px" style="background-color: lavender">
                                                       
                    <tr> 
                        <td  width="400px" height="90px" align="center" colspan="12px"> Date </td>
                        <td  width="400px" height="90px" align="center" ><input type="date" name="txtdate" value="" /></td>
                   </tr>
                    
                    <tr>
                        <td width="400px" height="90" align="center" colspan="14px"><input type="submit" value=" check Booking" name="check Booking" /></td>
                    
                    </tr>
                    
                  <tr><td align="center" width="200">Id</td><td align="center" width="200">Name</td><td align="center" width="200">Address</td><td align="center" width="200">Mobile No</td><td align="center" width="260">Sr no</td><td align="center" width="200">Language</td><td align="center" width="200">City Name</td><td align="center" width="200">Theaters</td><td align="center" width="200">Movie name</td><td align="center"width="200">No of Seats</td><td align="center" width="200">Showtime</td><td align="center" width="200">Rate</td><td align="center" width="200">Total</td></tr>  
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
                 String str="Select * from confirm_booking where Booking_date='"+date+"'";
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
                  <tr><td align="center"><%=id%></td><td align="center"><%=name%></td><td align="center"><%=add%></td><td align="center"><%=mobno%></td><td align="center"><%=srno%></td><td align="center"><%=lang%></td><td align="center"><%=ct%></td><td align="center"><%=th%></td><td align="center"><%=mn%></td><td align="center"><%=seat%></td><td align="center"><%=show%></td><td align="center"><%=rate%></td><td align="center"><%=tot%></td></tr>
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

