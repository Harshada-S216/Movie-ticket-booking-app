<%-- 
    Document   : Registration
    Created on : 7 Oct, 2024, 11:40:30 AM
    Author     : harsh
--%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="css/new2.css" rel="stylesheet" type="text/css"/>
                <script type="text/javascript">
function validate()
{ 
if( document.mobilenumbervalidation.txtmobno.value == "" ||
isNaN( document.mobilenumbervalidation.txtmobno.value) ||
document.mobilenumbervalidation.txtmobno.value.length != 10 )
{
alert( "Please provide a 10 digit no" );
document.mobilenumbervalidation.txtmobno.focus();
return false;
}
var email = document.mobilenumbervalidation.txtemail.value;
atpos = email.indexOf("@");
dotpos = email.lastIndexOf(".");
if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
{
alert("Please enter correct email ID");
document.mobilenumbervalidation.txtemail.focus() ;
return false;
}
return( true );
}
</script>   

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
              overflow-y:hidden;
              overflow-x: hidden;

              }       
  
      input[type=submit]{
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
     
        table{
            border: 3px solid black;
            border-collapse: collapse;
        }
        
        nav{
    background: rgb(5,10,246);
    background: linear-gradient(90deg, rgba(5,10,246,1) 0%, rgba(8,238,192,1) 50%, rgba(88,9,224,1) 100%);
    border-radius: 50px;
    padding: 10px;
    box-shadow: 0 25px 20px -20px rgba(0, 0, 0, 0.4);
     }
     
    </style>
        
    </head>

    <body style="background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(img/reg5.jpg);background-repeat: no-repeat;">
        
        <section class="sub-header">
        <div class="main">
        <div class="container">
           
        <nav>
            <ul>
                <li><a href="adminhomepage.jsp">Home<br></a></li>
                <li><a href="Registration.jsp">Registration </a></li>
                <li><a href="Customerlogin.jsp">Login</a></li>
                <li><a href="logout.jsp"> Logout</a></li>
            </ul>        
        </nav>
        </div>
                
        <div class="title6">
            <h1>Registration</h1><br>
        </div>
        <br>     
        <div align="center">
            <form style="color: black;">
            <form align="#" method="get" action="" name="mobilenumbervalidation" onsubmit="return(validate());">
                 <table border="5px" align="center" width="500px" height="400px" style="background-color: lavender">
                                                       
                    <tr>
                        <td width="400px" align="center">Customer Name</td>
                        <td width="400px" align="center"><input type="text" name="txtcnm" value="" /></td>
                    </tr>  
                    <tr>
                        <td width="400px" align="center"> Address </td>
                        <td width="400px" align="center"><input type="text" name="txtadd" value="" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">Mobile Number</td>
                        <td width="400px" align="center"><input type="text" name="txtmobno" value="" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">E-mail</td>
                        <td width="400px" align="center"><input type="text" name="txtemail" value="" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center"> Username</td>
                        <td width="400px" align="center"><input type="text" name="txtusername" value="" /></td>
                    </tr>
                    <tr>
                        <td width="400px" align="center">Password</td>
                        <td width="400px" align="center"><input type="password" name="txtpass" value="" /></td>
                    </tr>
                    <tr>
                   <td width="400px" align="center" colspan="2px"><input type="submit" value="Register Now" name="Register Now"/></td>
                    
                    </tr>
                
                </table>
                 <%
                 String nm=null;
                 String add=null;
                 String mob=null;
                 String email=null;
                 String unm=null;
                 String pass=null;
                 nm=request.getParameter("txtcnm");
                 add=request.getParameter("txtadd");
                 mob=request.getParameter("txtmobno");
                 email=request.getParameter("txtemail");
                 unm=request.getParameter("txtusername");
                 pass=request.getParameter("txtpass");
                 Statement st=con.createStatement();
                 if(nm!=null && nm!="" && mob!=null && mob!="" && email!=null && email!="" && add!=null && add!="" && unm!=null && unm!="" && pass!=null && pass!="")
                 {
                 String str="insert into customer_registration(Name,Mobile_no,Email,Address,Username,Password) values('"+nm+"','"+mob+"','"+email+"','"+add+"','"+unm+"','"+pass+"')";
                 int a=st.executeUpdate(str);
                 out.println("<script> alert('Your registration is sucessfull....');window location='Customerlogin';</script>");
                 }
                 %>
            </form>	
        </div>
        </div>
	 </section>

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>            
   </body>
</html>
