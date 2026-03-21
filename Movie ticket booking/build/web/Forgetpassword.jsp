<%-- 
    Document   : Forgetpassword
    Created on : 24 Oct, 2024, 12:01:33 PM
    Author     : harsh
--%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <link rel="stylesheet" href="style1.css">
</head>
<body>
    <div class="wrapper">
     <div class="form-wrapper sign-in">
        <form action="">
            <h2>Forget Password</h2>
            <div class="input-group">
                <input type="text" name="txtunm" required>
                <label>Username</label>
            </div>
            <div class="input-group">
                <input type="password" name="txtpass" required>
                <label> New Password</label>
            </div>
            
            <button type="submit">Reset Password</button>
     <%
     String unm=request.getParameter("txtunm");
     String pass=request.getParameter("txtpass");
     Statement st=con.createStatement();
     if(unm!=null && unm!="" && pass!=null && pass!="")
     {
     String str="update customer_registration set Password='"+pass+"' where Username='"+unm+"'";
     int a=st.executeUpdate(str);
     out.println("<script>alert('Password Changed Successfully.....')</script>");
     response.sendRedirect("Customerlogin.jsp");
     }
     %>       
        </form>
     </div>
    </div>    
</body>
</html>
