<%-- 
    Document   : Addmovieadmin
    Created on : 24 Oct, 2024, 7:31:34 PM
    Author     : harsh
--%>
<%@include file="connection.jsp" %>
<%@page import="java.io.*"%>
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
        
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            <ul>
                 <li><a href="adminhomepage.jsp">Home<br></a></li>
                <li><a href="Addmovieadmin.jsp">Add Movie</a></li>
                <li><a href="AdminNowDateBooking.jsp">Now Date Booking</a></li>
                <li><a href="Admincancelbookingcheck.jsp">Cancel booking</a></li>
                <li><a href="logout.jsp">Log Out<br></a></li>
            </ul>    
        </nav>
        </div>
                
        <div class="title6">
            <h1>Add Movie</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="500px" height="600px" style="background-color: lavender">
                     <%
                     int i=0;
                     Statement st= con.createStatement();
                     String str="select count(*) from add_movie";
                     ResultSet rs=st.executeQuery(str);
                     if(rs.next())
                             {
                                 i=rs.getInt(1);
                                 i++;
                             }
                     %>                                  
                    <tr> 
                        <td width="400px" align="center">Sr no.</td>
                        <td width="400px" align="center"> <%=i%> </td>
                   </tr>
                    <tr>
                        <td width="400px" align="center">Language</td>
                        <td width="400px" align="center"><select name="Language">
                                <option>Hindi</option>
                                <option>Marathi</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">City Name</td>
                        <td width="400px" align="center"><select name="cityname">
                                <option>Karad</option>
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
                            <td width="400px" align="center"><input type="submit" value="Search" name="Search" /></td>
                    </tr>
                    <%
                     String ct=request.getParameter("cityname");
                     String th=null;
                     Statement st3=con.createStatement();
                     String str3="select * from theaterinfo where City_name='"+ct+"'";
                     ResultSet rs3=st3.executeQuery(str3);
                     %>
                    <tr>
                       <td width="400px" align="center">Theaters</td>
                       <td width="400px" align="center"><select name="thname">
                               <%                          while(rs3.next())
                {
%>
                               <option><%=rs3.getString(2)%></option>
                               <%
                                       }
                     %>
                           </select></td>  
                    </tr>
                   
                     <tr>
                       <td width="400px" align="center">Movie name</td>
                       <td width="400px" align="center"><input type="text" name="txtmoviename" value="" /></td>  
                    </tr>
                     <%
                    String img=request.getParameter("fileupload");
                    File f=new File("img/");
                    img="img/"+img;
                    %>
                    <tr>
                       <td width="400px" align="center">Movie Image</td>
                       <td width="400px" align="center"><input type="file" name="fileupload" value="" /></td>  
                    </tr>
                    <tr>
                         <td width="400px" align="center">Movie discription</td>
                         <td width="400px" align="center"><input type="text" name="txtdesc" value="" /></td>
                    </tr>
                    <tr>
                         <td width="400px" align="center">Showtime</td>
                         <td width="400px" align="center"><input type="text" name="txtshow" value="" /></td>
                    </tr>
                    <tr>
                         <td width="400px" align="center">Rate</td>
                         <td width="400px" align="center"><input type="text" name="txtrate" value="" /></td>
                    </tr>
                    <tr>
                     <td width="400px" align="center" colspan="2px"><input type="submit" value="Add Movie" name="Add Movie" /></td>
                    </tr>
                   
                </table>
                <%
                 String lang=null;
                 String th1=null;
                 String mn=null;
                 String ds=null;
                 String sh=null;
                 String rt=null;
                 lang=request.getParameter("Language");
                 th1=request.getParameter("thname");
                 mn=request.getParameter("txtmoviename");
                 ds=request.getParameter("txtdesc");
                 sh=request.getParameter("txtshow");
                 rt=request.getParameter("txtrate");
                 Statement st1= con.createStatement();
                 if(lang!=null && lang!="" && th1!=null && th1!=""&& mn!=null && mn!=""&&  ds!=null && ds!="" && sh!=null && sh!="" && rt!=null && rt!="")
                 {
                  String str1="insert into add_movie(Sr_No,Language,City_Name,Theaters,Movie_Name,Movie_Image,Description,Showtime,Rate) values("+i+",'"+lang+"','"+ct+"','"+th1+"','"+mn+"','"+img+"','"+ds+"','"+sh+"',"+rt+")"; 
                  int a= st1.executeUpdate(str1);
                  out.println("<script> alert('Movie Added....')</script>");

                 }    
                %>
                
            </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>

