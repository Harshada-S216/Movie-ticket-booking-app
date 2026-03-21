<%-- 
    Document   : Payment_Page
    Created on : 17 Feb, 2025, 8:43:45 PM
    Author     : harsh
--%>

<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movie Ticket Payment</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            font-size: 16px;
            color: #333;
            display: block;
            margin-bottom: 5px;
        }
        .form-group input, .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        .form-group input[type="date"] {
            cursor: pointer;
        }
        .form-group input[type="number"] {
            -moz-appearance: textfield;
        }
        .form-group input[type="number"]::-webkit-outer-spin-button,
        .form-group input[type="number"]::-webkit-inner-spin-button {
            -webkit-appearance: none;
            margin: 0;
        }
        .payment-button {
            width: 100%;
            padding: 15px;
            background-color: #002BFF;
            color: white;
            font-size: 18px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .payment-button:hover {
            background-color: #002BFF;
        }
        .payment-button:active {
            background-color: #0078ff;
        }
        .upi-info {
            font-size: 18px;
            text-align: center;
            margin: 20px 0;
        }
         h1 {
            color: darkblue;
            font-size: 50px;
        }
        h2{
            color: #023e8a;
            font-size: 25px;
            text-align: center;
        }
        p{
            text-align: center;
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
</head>
<body>

    <div class="container">
        <h1>Payment</h1>
        <form>
             <div class="container">
           <h2>Make Your Payment</h2>
           <p>To complete your payment, please use the UPI ID below:</p>
         <div class="upi-info">
            <strong>UPI ID:</strong> rohinisuryawanshi0107@ibl
         </div>

            <div class="form-group">
                <label for="payment-date">Payment Date:</label>
                <input type="date" id="payment-date" name="txtpdate" required >
            </div>

            <div class="form-group">
                <label for="booking-id">Booking ID:</label>
                <input type="text" id="booking-id" name="txtid"  value="<%=bookid%>" placeholder="Enter your booking ID" readonly="true" required>
            </div>

            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="txtnm" value="<%=unm%>" placeholder="Enter your name" readonly="true" required>
            </div>

            <div class="form-group">
                <label for="movie-name">Movie Name:</label>
                <input type="text" id="movie-name" name="txtmn" value="<%=mn2%>" placeholder="Enter the movie name" readonly="true" required>
            </div>

            <div class="form-group">
                <label for="total-amount">Total Amount (₹):</label>
                <input type="number" id="total-amount" name="txttotal" value="<%=Total1%>" placeholder="Enter the total amount" readonly="true" required>
            </div>

            <div class="form-group">
                <label for="upi-id">UPI ID:</label>
                <input type="text" id="upi-id" name="txtupi" placeholder="Enter your UPI ID" required>
            </div>

            <button type="submit" class="payment-button">Make Payment</button>
            
                       <tr>
                         <td width="400px" align="center" colspan="2px" ><a href="payrecipt.jsp">Pay receipt</a></td> 
                    </tr>
        </form>
    </div>
         <%
           String pdate=request.getParameter("txtpdate");
           String id=request.getParameter("txtid");
           String name=request.getParameter("txtnm");
           String mn=request.getParameter("txtmn");
           String tot=request.getParameter("txttotal");
           String upi=request.getParameter("txtupi");
           Statement st1=con.createStatement();
          if(id!=null && id!="" && name!=null && name!="" && mn!=null && mn!="" && tot!=null && tot!="" && pdate!=null && pdate!="" && upi!=null && upi!="" )
           {
               String str2="insert into payment(paydate,Booking_id,Name,Movie_name,Total,Upi)values('"+pdate+"',"+id+",'"+name+"','"+mn+"',"+tot+",'"+upi+"')";
               int a=st1.executeUpdate(str2);
               out.println("<script>alert('Your payment is Successfull...')</script>");
           
           }
           %>           
</body>
</html>
