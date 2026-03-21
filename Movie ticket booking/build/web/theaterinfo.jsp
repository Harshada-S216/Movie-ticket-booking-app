<%-- 
    Document   : theaterinfo
    Created on : 26 Nov, 2024, 11:15:13 AM
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
              overflow-y: hidden;

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
    <body style="background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;">
        
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            
            <ul>
                <li><a href="Admin_homepage.jsp">Home<br></a></li>
                <li><a href="Search_Movie.jsp">Search Movie </a></li>
                <li><a href="Booking.jsp">Booking</a></li>
                <li><a href="Payment.jsp"> Payment</a></li>
                <li><a href="Cancel_Booking.jsp"> Cancel Booking</a></li>
                <li><a href="Logout.jsp"> Logout</a></li>

            </ul>
            
        </nav>
        </div>
                
        <div class="title6">
            <h1>Theaters</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="400" height="300px" style="background-color: lavender">
                                                       
                    <tr> 
                        <td width="400px" align="center">City Name</td>
                        <td width="400px" align="center"><select name="Cityname">
                                <option> Karad </option>
                                <option> Mumbai </option>
                                <option> Satara </option>
                                <option> Ahmedabad </option>
                                <option> Kolhapur </option>
                                <option> Vita</option>
                                <option> Rahimatpur </option>
                                <option> Nagpur </option>
                                <option> Sangali</option>
                                <option> Solapur</option>
                            </select></td>
                   </tr>
                  
                   <tr>
                       <td width="400px" align="center">Theaters</td>
                       <td width="400px" align="center"><input type="text" name="txtth" value="" /></td>
                   </tr>
       
                        <td width="400px" align="center" colspan="2px"><input type="submit" value="select" name="select" /></td>
                    
                    </tr>
                    
                
                </table>
                <%
                String ct=null;
                String th=null;
                ct=request.getParameter("Cityname");
                th=request.getParameter("txtth");
                Statement st=con.createStatement();
                if(ct!=null && ct!="" && th!=null && th!="")
                {
                    String str="insert into theaterinfo(City_name,Theaters) values('"+ct+"','"+th+"')";
                    int a= st.executeUpdate(str);
                    out.println("<script> alert('Theater Info Added Sucess....')</script>");

                }
                %>
                
            </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>

