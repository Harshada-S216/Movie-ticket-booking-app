<%-- 
    Document   : searchfeedback
    Created on : 8 Feb, 2025, 12:00:24 PM
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
            <h1>Customer Feedback</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="8px" align="center" width="550px" height="300px" style="background-color:lavender">
                     
                     
                                                  
                    
       <tr><td align="center" width="200">Name</td><td align="center" width="200">Email</td><td align="center" width="200">Message</td></tr>  

                   <%
                   String name=null;
                   String email=null;
                   String message=null;
                   Statement st2=con.createStatement();
                   String str2="select * from feedback ";
                   ResultSet rs1=st2.executeQuery(str2);
                   while(rs1.next())
                           {  
                               name=rs1.getString(1);
                               email=rs1.getString(2);
                               message=rs1.getString(3);
                          
                     %>
        <tr><td align="center"><%=name%></td><td align="center"><%=email%></td><td align="center"><%=message%></td></tr>
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


