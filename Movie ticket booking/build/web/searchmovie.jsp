<%-- 
    Document   : searchmovie
    Created on : 25 Oct, 2024, 11:05:49 AM
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
            var f = document.form;
            f.method="post";
            f.action='Customer_Booking.jsp?Booking_id=' +id;
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
      /*  animation: float 2s ease-in-out infinite;*/
      }
      /*  @keyframes float{
            0%, 100%{
                transform: translateY(0);
            }
            50%{
                transform: translateY(-10px);
            }
        }*/
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
                <li><a href="Customer_Booking.jsp">Booking</a></li>
                <li><a href="cancelbooking.jsp">Cancel Booking</a></li>
                <li><a href="Logout.jsp"> Logout</a></li>
            </ul>  
        </nav>
            
        </div>
                
        <div class="title6">
            <h1>Search Movie</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;" method="post" name="form">
                
            
                 <table border="5px" align="center" width="850px" height="420px" style="background-color: lavender">
                    
                      <tr>
                        <td width="400px" height="70" align="center" colspan="6px">Language</td>
                        <td width="400px" height="70" align="center" colspan="6px"><select name="Language">
                                <option>Hindi</option>
                                <option>Marathi</option>
                            </select></td>
                     </tr>
                     <tr>
                     <td width="400px" height="70" align="center" colspan="10px"><input type="submit" value="Search Movie" name="Search Movie" /></td>
                    </tr>
                    
                    
                 <tr><td align="center" width="100">Sr No</td><td align="center" width="100">Language</td><td align="center" width="100">City Name</td><td align="center" width="100">Theaters</td><td align="center" width="100">Movie name</td><td align="center"width="100">Movie Image</td><td align="center" width="500">Movie discription</td><td align="center" width="100">Showtime</td><td align="center" width="100">Rate</td></tr>  
                 <%
                 int Srno=0;
                 String ct=null;
                 String th=null;
                 String mn=null;
                 String img=null;
                 String ds=null;
                 String sh=null;
                 int rt=0;
                 String lang=request.getParameter("Language");
                 Statement st=con.createStatement();
                 String str="Select * from add_movie where Language='"+lang+"'";
                 ResultSet rs=st.executeQuery(str);
                 while(rs.next())
                 {
                  Srno=rs.getInt(1);
                  lang=rs.getString(2);
                  ct=rs.getString(3);
                  th=rs.getString(4);
                  mn=rs.getString(5);
                  img=rs.getString(6);
                  ds=rs.getString(7);
                  sh=rs.getString(8);
                  rt=rs.getInt(9);
                  %>
                  <tr><td align="center"><%=Srno%></td><td align="center"><%=lang%></td><td align="center"><%=ct%></td><td align="center"><%=th%></td><td align="center"><%=mn%></td><td align="center"><img src="<%=img%>" width="120" height="100"/></td><td align="center"><%=ds%></td><td align="center"><%=sh%></td><td align="center"><%=rt%></td> <td align="center"><input type="button"name="Book Now" value="Book Now"style="background-color: darkblue;font-weight: bold;color: white;font-size: larger;"onclick="editRecord(<%=rs.getInt(1)%>)"/></td>
            </tr>

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


