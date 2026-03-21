<%-- 
    Document   : adminlogin
    Created on : 25 Sep, 2024, 12:15:04 PM
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
	<link rel="stylesheet" href="style_1.css">
	<title>Admin Login</title>
</head>
<body>
        <form>
	<div class="square">
		<i style="--clr:#00ff0a;"></i>
		<i style="--clr:#ff0057;"></i>
		<i style="--clr:#fffd44;"></i>
            
		<div class="login">
			<h2>Admin Login</h2>
			<div class="inputBx">
				<input type="text" name="txtunm"  placeholder="AdminName">
			</div>
			<div class="inputBx">
				<input type="password" name="txtpass" placeholder="Password">
			</div>
                  
			<div class="inputBx">
				<input type="submit" value="Login">
			</div>
<!--			<div class="links">
				<a href="#">Forget Password</a>
			</div>-->
		</div>
	</div>
    </form>
     <%
         
         String unm=request.getParameter("txtunm");
         String pass=request.getParameter("txtpass");
         Statement st=con.createStatement();
         if(unm!=null && unm!="" && pass!=null && pass!="")
         {
            String str="Select * from adminlogin where Adminname='"+unm+"' and Password='"+pass+"'"; 
        
         ResultSet rs=st.executeQuery(str);
         if(rs.next())
         {
             out.println("<script> alert('login sucess....')</script>");
             response.sendRedirect("adminhomepage.jsp");
         }
         else
         {
            out.println("<script> alert('login failed....')</script>");
  
         }
         }
         %>
</body>
</html>