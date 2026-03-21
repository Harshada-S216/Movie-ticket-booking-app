<%-- 
    Document   : Customer_Booking
    Created on : 11 Oct, 2024, 11:39:06 AM
    Author     : harsh
--%>

<%@include file="connection.jsp"%>
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
              overflow-x:hidden;
              }
    </style>
    </head>
    <style>
      
      input[type=submit]{
        background-color:darkblue;
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
        
        <%
        String id=request.getParameter("Booking_id");
        String unm=(String)session.getAttribute("unm1");
        %>
        
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
            
        <%=unm%>
      
        <div class="title6">
            <h1>Customer Booking</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="600px" height="700px" style="background-color: lavender">
                    
                  <%
                 String nm=null;
                 String add=null;
                 String mob=null;
                 Statement st2=con.createStatement();
                 String str2="select * from customer_registration where Username='"+unm+"'";
                  ResultSet rs2=st2.executeQuery(str2);
                 while(rs2.next())
                 {
                  nm=rs2.getString(1);
                  mob=rs2.getString(2);
                  add=rs2.getString(4);
                 }
                  %>
                    
                    <tr>
                        <td width="400px" align="center">Customer Name</td>
                        <td width="400px" align="center"><input type="text" name="txtcnm" value="<%=nm%>" readonly="true" /></td>
                    </tr>
                   
                    
                   <tr>
                        <td width="400px" align="center"> Address </td>
                        <td width="400px" align="center"><input type="text" name="txtadd" value="<%=add%>" readonly="true" /></td>
                    </tr>
                    
                    <tr>
                        <td width="400px" align="center">Mobile Number</td>
                        <td width="400px" align="center"><input type="text" name="txtmobno" value="<%=mob%>" readonly="true" /></td>
                    </tr>
                    <tr> 
                        <td width="400px" align="center"> Sr No.</td>
                        <td width="400px" align="center"><input type="text" name="txtsrno" value="<%=id%>" readonly="true" /></td>
                   </tr>
                    <%
                 int Srno=0;
                 String ct=null;
                 String th=null;
                 String mn=null;
                 String img=null;
                 String ds=null;
                 String sh=null;
                 int rt=0;
                 String lang=null;
                 Statement st=con.createStatement();
                 String str="Select * from add_movie where Sr_No="+id+"";
                 ResultSet rs=st.executeQuery(str);
                 while(rs.next())
                  {
                  lang=rs.getString(2);
                  ct=rs.getString(3);
                  th=rs.getString(4);
                  mn=rs.getString(5);
                  img=rs.getString(6);
                  ds=rs.getString(7);
                  sh=rs.getString(8);
                  rt=rs.getInt(9);
                  }
                  %>
                 
                   
                     <tr>
                        <td width="400px" align="center"> Language </td>
                        <td width="400px" align="center"><input type="text" name="txtlang" value="<%=lang%>" readonly="true"/>
                    </tr>
                    <tr>
                        <td width="400px" align="center">City_Name</td>
                        <td width="400px" align="center"><input type="text" name="txtct" value="<%=ct%>" readonly="true"/>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Theater </td>
                        <td width="400px" align="center"><input type="text" name="txttheater" value="<%=th%>" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">Movie_Name</td>
                        <td width="400px" align="center"><input type="text" name="txtmname" value="<%=mn%>" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Image </td>
                        <td width="400px" align="center"><img src="<%=img%>" width="120" height="100"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> No.of Seats </td>
                        <td width="400px" align="center"><input type="text" name="txtseat" value="" />
                    </tr>
                    <tr>
                         <td width="400px" align="center">Showtime</td>
                         <td width="400px" align="center"><input type="text" name="txtshow" value="<%=sh%>" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Rate </td>
                        <td width="400px" align="center"><input type="text" name="txtrate" value="<%=rt%>" readonly="true" /></td>
                    </tr>
                  
                    <tr>
                        <td width="400px" align="center" colspan="2px"><input type="submit" value="Book Now" name="Book Now" /></td>
                    
                    </tr>
                    <tr>
                        <td width="400px" align="center" colspan="2px" ><a href="confirmbooking.jsp">confirm booking</a></td> 
                    </tr>
                    
                    
                    
                    
                    <%
                    String name=request.getParameter("txtcnm");
                    String mobno=request.getParameter("txtmobno");
                    String add1=request.getParameter("txtadd");
                    String srno=request.getParameter("txtsrno");
                    String lang1=request.getParameter("txtlang");
                    String city=request.getParameter("txtct");
                    String th1=request.getParameter("txttheater");
                    String mn1=request.getParameter("txtmname");
                    String seat=request.getParameter("txtseat");
                    String show=request.getParameter("txtshow");
                    String rate=request.getParameter("txtrate");
                    Statement st3= con.createStatement();
                    if( name!=null && name!="" && mobno!=null && mobno!="" && add1!=null && add1!="" && srno!=null && srno!="" && lang1!=null && lang1!="" && city!=null && city!="" && th1!=null && th1!="" && mn1!=null && mn1!="" && seat!=null && seat!="" && show!=null && show!="" && rate!=null && rate!="")
                    {
                     String str3="insert into customer_booking(Name,Address,Mobile_no,Srno,language,City_Name,Theater,Movie_name,Movie_img,No_ofseats,Showtime,Rate)values('"+name+"','"+add1+"','"+mobno+"',"+srno+",'"+lang1+"','"+city+"','"+th1+"','"+mn1+"','"+img+"',"+seat+",'"+show+"',"+rate+")";
                     int a=st3.executeUpdate(str3);
                     out.println("<script> alert('Booking sucessfull....')</script>");
                    }
                    session.setAttribute("Name", name);
                    session.setAttribute("Add1", add1);
                    session.setAttribute("Mobno", mobno);
                    session.setAttribute("Srno", srno);
                    session.setAttribute("Lang1", lang1);
                    session.setAttribute("City", city);
                    session.setAttribute("Th1", th1);
                    session.setAttribute("Mn1", mn1);
                    session.setAttribute("Seat1", seat);
                    session.setAttribute("Show1",show );
                    session.setAttribute("Rate", rate);
                    
                    %>
                
                </table>
                 
            </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>
