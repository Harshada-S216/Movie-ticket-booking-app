<%-- 
    Document   : payrecipt
    Created on : 6 Mar, 2025, 3:20:21 PM
    Author     : harsh
--%>

<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Receipt</title>
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
        .receipt-details {
            font-size: 18px;
            margin-bottom: 20px;
        }
        .receipt-details p {
            margin: 10px 0;
        }
        .receipt-details strong {
            color: #333;
        }
        .print-button {
            display: block;
            width: 100%;
            padding: 15px;
            background-color: #002BFF;
            color: white;
            font-size: 18px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-align: center;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }
        .print-button:hover {
            background-color: #0078ff;
        }
    </style>
    <script>
        function printReceipt() {
            window.print();
        }
    </script>
</head>
<body>
    <div class="container">
        <h1>Payment Receipt</h1>
        <div class="receipt-details">
            <%
                String bookid = request.getParameter("Bookid");
                String name = request.getParameter("Name");
                String movieName = request.getParameter("MovieName");
                String totalAmount = request.getParameter("TotalAmount");

                Statement st2 = con.createStatement();
                String query = "SELECT * FROM payment WHERE Booking_id = " + bookid;
                ResultSet rs = st2.executeQuery(query);
                if(rs.next()) {
                    name = rs.getString("Name");
                    movieName = rs.getString("Movie_name");
                    totalAmount = rs.getString("Total");
                }
            %>
            <p><strong>Booking ID:</strong> <%= bookid %></p>
            <p><strong>Name:</strong> <%= name %></p>
            <p><strong>Movie Name:</strong> <%= movieName %></p>
            <p><strong>Total Amount (₹):</strong> <%= totalAmount %></p>
        </div>
        <button class="print-button" onclick="printReceipt()">Print Receipt</button>
    </div>
</body>
</html>
