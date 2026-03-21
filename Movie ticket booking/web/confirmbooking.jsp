<%-- 
    Document   : confirmbooking
    Created on : 24 Dec, 2024, 10:42:56 AM
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
      
      input[type=submit] {
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
                 /* String id=request.getParameter("Booking_id");*/
                    String unm=(String)session.getAttribute("unm1");
                    String name2=(String)session.getAttribute("Name");
                    String add2=(String)session.getAttribute("Add1");
                    String mobno2=(String)session.getAttribute("Mobno");
                    String srno2=(String)session.getAttribute("Srno");
                    String lang2=(String)session.getAttribute("Lang1");
                    String city2=(String)session.getAttribute("City");
                    String th2=(String)session.getAttribute("Th1");
                    String mn2=(String)session.getAttribute("Mn1");
                    String seat2=(String)session.getAttribute("Seat1");
                    String show2=(String)session.getAttribute("Show1");
                    String rate2=(String)session.getAttribute("Rate");  
                  %>
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            <ul>
                <li><a href="Customerhomepage.jsp">Home<br></a></li>
                <li><a href="Customer_Booking.jsp">Customer Booking<br></a></li>
                <li><a href="SearchMyBooking.jsp">Search my Booking</a></li>                
                <li><a href="Payment.jsp">Payment</a></li>                
                <li><a href="feedback.jsp">Feedback</a></li>
                <li><a href="logout.jsp">Log out</a></li>
            </ul>
        </nav>
        </div>
        <%=unm%>
      
        <div class="title6">
            <h1>Confirm Booking</h1><br>
        </div>
              <br>     
        <div align="center">
            <form style="color: black;">
                
            
                 <table border="5px" align="center" width="600px" height="700px" style="background-color: lavender">
                     
                      <%
                     int i=0;
                     Statement st1= con.createStatement();
                     String str1="select count(*) from confirm_booking";
                     ResultSet rs1=st1.executeQuery(str1);
                     if(rs1.next())
                             {
                                 i=rs1.getInt(1);
                                 i++;
                             }
                     %>          
                     <tr> 
                        <td width="400px" align="center">Booking Id</td>
                        <td width="400px" align="center"><input type="text" name="txttno" value="<%=i%>" /></td>
                   </tr>                                  
                  <tr>
                        <td width="400px" align="center"> Booking_Date </td>
                        <td width="400px" align="center"><input type="date" name="txtdate" value="" /></td>
                    </tr>
                    
                 
                    <tr>
                        <td width="400px" align="center">Customer Name</td>
                        <td width="400px" align="center"><input type="text" name="txtcnm" value="<%=name2%>" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">Mobile Number</td>
                        <td width="400px" align="center"><input type="text" name="txtmobno" value="<%=mobno2%>" /></td>
                    </tr>
                    
                   <tr>
                        <td width="400px" align="center"> Address </td>
                        <td width="400px" align="center"><input type="text" name="txtadd" value="<%=add2%>" /></td>
                    </tr>
                    
                   
                    <tr> 
                        <td width="400px" align="center"> Sr No.</td>
                        <td width="400px" align="center"><input type="text" name="txtsrno" value="<%=srno2%>" readonly="true" /></td>
                   </tr>
                    
                    <tr>
                        <td width="400px" align="center"> Language </td>
                        <td width="400px" align="center"><input type="text" name="txtlang" value="<%=lang2%>" readonly="true"/>
                    </tr>
                    <tr>
                        <td width="400px" align="center">City_Name</td>
                        <td width="400px" align="center"><input type="text" name="txtct" value="<%=city2%>" readonly="true"/>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Theater </td>
                        <td width="400px" align="center"><input type="text" name="txttheater" value="<%=th2%>" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">Movie_Name</td>
                        <td width="400px" align="center"><input type="text" name="txtmname" value="<%=mn2%>" readonly="true"/></td>
                    </tr>
                    
                    <tr>
                        <td width="400px" align="center"> No.of Seats </td>
                        <td width="400px" align="center"><input type="text" name="txtseat" value="<%=seat2%>" readonly="true"/>
                    </tr>
                    <tr>
                         <td width="400px" align="center">Showtime</td>
                         <td width="400px" align="center"><input type="text" name="txtshow" value="<%=show2%>" readonly="true" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Rate </td>
                        <td width="400px" align="center"><input type="text" name="txtrate" value="<%=rate2%>" readonly="true" /></td>
                    </tr>
                    <%
                    int tot=0;int s=0;int r=0;
                   
                   
                     r=Integer.parseInt(rate2);
                     s=Integer.parseInt(seat2);
                     tot=r*s;
                    
                    
                    %>
                     <tr>
                        <td width="400px" align="center"> Total </td>
                        <td width="400px" align="center"><input type="text" name="txttotal" value="<%=tot%>" />
                    </tr>
                    <tr>
                        <td width="400px" align="center" colspan="2px"><input type="submit" value="Confirm Booking" name="Confirm Booking" /></td>
                    
                    </tr>
                     <tr>
                         <td width="400px" align="center" colspan="2px" ><a href="Payment_Page.jsp">Payment</a></td> 
                    </tr>
                   
                </table>
                   <%
                    String Id=request.getParameter("txttno");
                    String Date=request.getParameter("txtdate");
                    String name=request.getParameter("txtcnm");
                    String mobno=request.getParameter("txtmobno");
                    String add1=request.getParameter("txtadd");
                    String srno=request.getParameter("txtsrno");
                    String lang1=request.getParameter("txtlang");
                    String city=request.getParameter("txtct");
                    String th1=request.getParameter("txttheater");
                    String mn1=request.getParameter("txtmname");
                    String seat1=request.getParameter("txtseat");
                    String show=request.getParameter("txtshow");
                    String rate=request.getParameter("txtrate");
                    String Total=request.getParameter("txttotal");

                    Statement st3= con.createStatement();
                    if( Date!=null && Date!="" && name!=null && name!="" && mobno!=null && mobno!="" && add1!=null && add1!="" && srno!=null && srno!="" && lang1!=null && lang1!="" && city!=null && city!="" && th1!=null && th1!="" && mn1!=null && mn1!="" && show!=null && show!="" && seat1!=null && seat1!="" && rate!=null && rate!="")
                    {
                     String str3="insert into confirm_booking(Booking_id,Booking_date,Name,Address,Mobile_no,Srno,language,City_Name,Theater,Movie_name,No_ofseats,Showtime,Rate,Total)values("+i+",'"+Date+"','"+name+"','"+add1+"','"+mobno+"',"+srno+",'"+lang1+"','"+city+"','"+th1+"','"+mn1+"',"+seat1+",'"+show+"',"+rate+","+Total+")";
                     int a=st3.executeUpdate(str3);
                     out.println("<script> alert('Booking sucessfull....')</script>");
                    }
                    
                   %>    
                   
                   <%
                    session.setAttribute("Bookid", Id);
                    session.setAttribute("Name", name);
                    session.setAttribute("Mn1", mn1);
                    session.setAttribute("Total", Total);
                   %>
            </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>
