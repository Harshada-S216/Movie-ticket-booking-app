<%-- 
    Document   : Admincancelbookingcheck
    Created on : 25 Oct, 2024, 11:22:49 AM
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
        border-color: darkblue;
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
         <%
        String unm=(String)session.getAttribute("unm1");
         %>
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
            <h1>Cancel Movie ticket request</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="900px" height="500px" style="background-color: lavender">
                                                       
                    <tr> 
                        <td width="400px" height="90px" align="center" colspan="7px"> Date </td>
                        <td width="400px" height="90px" align="center"><input type="date" name="txtdate" value="" /></td>
                   </tr>
                   <tr>
                        <td width="400px" height="90" align="center" colspan="15px"><input type="submit" value="Check Cancel Booking" name="Check Cancel Booking" /></td>
                    
                    </tr>
                   
                     <tr colspan="8px"><td align="center" width="250">Id</td><td align="center" width="250">Date</td><td align="center" width="250">Name</td><td align="center" width="250">Mobile No</td><td align="center" width="260">Movie name </td><td align="center" width="250">Cancel Booking Id</td><td align="center" width="250">Cancel Booking Date</td><td align="center" width="250">Rate</td></tr>  
                 <%
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
                  %>
                  <tr><td align="center"><%=id%></td><td align="center"><%=date%></td><td align="center"><%=name%></td><td align="center"><%=mobno%></td><td align="center"><%=mn%></td><td align="center"><%=cid%></td><td align="center"><%=cdate%></td><td align="center"><%=rt%></td></tr>
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

