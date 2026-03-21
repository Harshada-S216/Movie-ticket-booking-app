<%-- 
    Document   : cancel booking
    Created on : 24 Oct, 2024, 11:08:33 AM
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
                   <% 
                    String unm=(String)session.getAttribute("unm1");
                    %>
                    <%
                    String id=request.getParameter("CancelBookingid");
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
            <h1>Cancel Booking</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="550px" height="600px" style="background-color:lavender">
                     
                      <%
                     int i1=0;
                     Statement st= con.createStatement();
                     String str="select count(*) from cancel_booking";
                     ResultSet rs=st.executeQuery(str);
                     if(rs.next())
                             {
                                 i1=rs.getInt(1);
                                 i1++;
                             }
                     %>               
                   
                                                  
                    <tr>
                      <td width="400px" align="center"> Cancel Id </td>
                      <td width="400px" align="center"><input type="text" name="txtcancelid" value="<%=i1%>" /></td>  
                    </tr>
                    <tr>
                       <td width="400px" align="center">Cancel Date</td>
                       <td width="400px" align="center"><input type="date" name="txtcanceldate" value="date" /></td>
                    </tr>
                   
                   <%
                   String name=null;
                   String mobno=null;
                   String bookid=null;
                   String bookdate=null;
                   String movien=null;
                   String rate=null;
                   Statement st2=con.createStatement();
                   String str2="select * from confirm_booking where Booking_id="+id+"";
                   ResultSet rs1=st2.executeQuery(str2);
                   while(rs1.next())
                           {
                               
                               name=rs1.getString(3);
                               mobno=rs1.getString(5);
                               bookid=rs1.getString(1);
                               bookdate=rs1.getString(2);
                               movien=rs1.getString(10);
                               rate=rs1.getString(13);
                            
                           }
                           
                   %>
                    <tr>
                        <td width="400px" align="center">Customer Name</td>
                        <td width="400px" align="center"><input type="text" name="txtcnm" value="<%=name%>" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">Mobile Number</td>
                        <td width="400px" align="center"><input type="text" name="txtmobno" value="<%=mobno%>" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Booking_id </td>
                        <td width="400px" align="center"><input type="text" name="txtid" value="<%=id%>" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Booking_Date </td>
                        <td width="400px" align="center"><input type="text" name="txtdate" value="<%=bookdate%>" /></td>
                    </tr>
                    <tr>
                       <td width="400px" align="center"> Movie Name </td>
                       <td width="400px" align="center"><input type="text" name="txtmoviename" value="<%=movien%>" /></td>
                    </tr>
                    
                    
                    <tr>
                       <td width="400px" align="center">Rate</td>
                       <td width="400px" align="center"><input type="text" name="txtrate" value="<%=rate%>" /></td>
                    </tr>
                    
                    <tr>
                       <td width="400px" align="center">Cancel Booking</td>
                       <td width="400px" align="center"><input type="submit" value="Cancel Booking" /></td>  
                    </tr>
                   
                
                </table>
              <%
              String cid=request.getParameter("txtcancelid");
              String cdate=request.getParameter("txtcanceldate");
              String cname=request.getParameter("txtcnm");
              String mob1=request.getParameter("txtmobno");
              String id1=request.getParameter("txtid");
              String date=request.getParameter("txtdate");
              String mn=request.getParameter("txtmoviename");
              String rate1=request.getParameter("txtrate");
              Statement st3=con.createStatement();
              if(cid!=null && cid!="" && cname!=null && cname!="" && mob1!=null && mob1!="" && id1!=null && id1!="" && date!=null && date!="" && mn!=null && mn!="" && rate1!=null && rate1!="")
              {
                  String str3="insert into cancel_booking(Booking_id,Booking_date,Name,Mobile_No,Movie_Name,CancelBookingid,CancelBookingdate,Rate)values("+id1+",'"+date+"','"+cname+"','"+mob1+"','"+mn+"',"+cid+",'"+date+"',"+rate1+")";
                  int a=st3.executeUpdate(str3);
                  out.println("<script>alert('your Booking is Cancled...')</script>");
              }

              %>
            </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>

