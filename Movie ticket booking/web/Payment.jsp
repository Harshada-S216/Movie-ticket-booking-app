<%-- 
    Document   : Payment
    Created on : 13 Jan, 2025, 11:35:45 AM
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
.center{
  display: block;
  margin-left: auto;
  margin-right: auto;
}


    </style>
    
       <%
        String unm=(String)session.getAttribute("unm1");
        String bookid=(String)session.getAttribute("Bookid");
        String name2=(String)session.getAttribute("Name");
        String mn2=(String)session.getAttribute("Mn1");
        String Total1=(String)session.getAttribute("Total");
        String date1=(String)session.getAttribute("Date1");
        %>
    <body style="background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;">
        
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            
            <ul>
                <li><a href="Admin_homepage.jsp">Home<br></a></li>
                <li><a href="Search_Movie.jsp">Search Movie </a></li>
                <li><a href="Booking.jsp">Booking</a></li>
                <li><a href="Logout.jsp"> Logout</a></li>

            </ul>
            
        </nav>
        </div>
           <%=unm%>       
        <div class="title6">
            <h1>Payment</h1><br>
        </div>
         <br>     
        <div align="center">
            <form style="color: black;" method="post" name="form">
               
            
                 <table border="5px" align="center" width="800px" height="500px" style="background-color: lavender">
                      <tr>
                          <td width="400px" height="90px" align="center" colspan="12px">Payment Date</td>
                          <td width="400px" height="90px" align="center"><input type="date" name="txtpdate" value=""/></td>
                     </tr>
                      <tr>
                          <td width="400px" height="90px" align="center" colspan="12px">Booking Id</td>
                          <td width="400px" height="90px" align="center"><input type="text" name="txtid" value="<%=bookid%>"/></td>
                     </tr>
                      <tr>
                        <td width="400px" height="90px" align="center" colspan="12px">Name</td>
                        <td width="400px" height="90px" align="center"><input type="text" name="txtnm" value="<%=unm%>" /></td>
                      </tr>
                      <tr>
                        <td width="400px" height="90px" align="center" colspan="12px">Movie Name</td>
                        <td width="400px" height="90px" align="center"><input type="text" name="txtmn" value="<%=mn2%>" /></td>
                      </tr>
                      <tr>
                        <td width="400px" height="90px" align="center" colspan="12px">Total</td>
                        <td width="400px" height="90px" align="center"><input type="text" name="txttotal" value="<%=Total1%>" /></td>
                      </tr>
                      <tr>
                       <td width="400px" height="90px" align="center" colspan="12px">UPI ID</td>        
                       <td width="400px" height="90px" align="center"><input type="text" size="30" id="pay" name="UPI" value="" placeholder="rohinisuryawanshi0107@ibl" required /></td>
                      </tr>
                     
                     <tr>
                     <td width="400px" height="100" align="center" colspan="14px"><input type="submit" value="Payment" name="Payment" /></td>
                    </tr>
                    
                 </table>
           <%
           String pdate=request.getParameter("txtpdate");
           String id=request.getParameter("txtid");
           String name=request.getParameter("txtnm");
           String mn=request.getParameter("txtmn");
           String tot=request.getParameter("txttotal");
           String img="img/Scanner.jpeg";
           Statement st1=con.createStatement();
          if(id!=null && id!="" && name!=null && name!="" && mn!=null && mn!="" && tot!=null && tot!="" && pdate!=null && pdate!="" )
           {
               String str2="insert into payment(paydate,Booking_id,Name,Movie_name,Total)values('"+pdate+"',"+id+",'"+name+"','"+mn+"',"+tot+")";
               int a=st1.executeUpdate(str2);
               out.println("<script>alert('Your payment is Successfull...')</script>");
           
           }
           %>           
  </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
     
   </body>
</html>

