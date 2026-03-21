<%-- 
    Document   : Customerlogin
    Created on : 11 Oct, 2024, 10:59:06 AM
    Author     : harsh
--%>

<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head
    
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
            <h2>Login</h2>
            <div class="input-group">
                <input type="text" name="txtunm" required>
                <label for="">Username</label>
            </div>
            <div class="input-group">
                <input type="password" name="txtpass" required>
                <label for="">Password</label>
            </div>
            <div class="remember">
                <label for=""><input type="checkbox">Remember me</label>
            </div>
            <button type="submit">login</button>
             <tr>
                 <td  class="form" align="center"><a href="Forgetpassword.jsp">Forget Password</a></td> 
             </tr>
        </form>
         
         <%
         
         String unm=request.getParameter("txtunm");
         String pass=request.getParameter("txtpass");
         Statement st=con.createStatement();
         if(unm!=null && unm!="" && pass!=null && pass!="")
         {
            String str="Select * from customer_registration where Username='"+unm+"' and Password='"+pass+"'"; 
        
         ResultSet rs=st.executeQuery(str);
         if(rs.next())
         {
             out.println("<script> alert('login sucess....')</script>");
             session.setAttribute("unm1",unm);
             response.sendRedirect("Customerhomepage.jsp");
         }
         else
         {
            out.println("<script> alert('login failed....')</script>");
            response.sendRedirect("Registration.jsp");
         }
         }
         %>
     </div>
    </div>    
</body>
</html>






