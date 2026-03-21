<%-- 
    Document   : feedback
    Created on : 24 Oct, 2024, 11:47:22 AM
    Author     : harsh
--%>

<%@include file="connection.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="../main.css">

</head>
<style>
 body {
  background-color: lightskyblue;
}

#title-Tag-Line {
  font-size: 20px;
}
.form {
  background: #fff;
  box-shadow: 0 30px 60px 0 rgba(90, 116, 148, 0.4);
  border-radius: 5px;
  max-width: 480px;
  margin-left: auto;
  margin-right: auto;
  padding-top: 5px;
  padding-bottom: 5px;
  left: 0;
  right: 0;
  position: absolute;
  border-top: 5px solid #0e3721;
/*   z-index: 1; */
  animation: bounce 1.5s infinite;
}
::-webkit-input-placeholder {
  font-size: 1.3em;
}

.title{
  display: block;
  font-family: sans-serif;
  margin: 10px auto 5px;
  width: 300px;
}
.termsConditions{
  margin: 0 auto 5px 80px;
}

.pageTitle{
  font-size: 2em;
  font-weight: bold;
}
.secondaryTitle{
  color: grey;
}

.name {
  background-color: #ebebeb;
  color: black;
}
.name:hover {
  border-bottom: 5px solid #0e3721;
  height: 30px;
  width: 380px;
  transition: ease 0.5s;
}

.email {
  background-color: #ebebeb;
  height: 2em;
}

.email:hover {
  border-bottom: 5px solid #0e3721;
  height: 30px;
  width: 380px;
  transition: ease 0.5s;
}

.message {
  background-color: #ebebeb;
  overflow: hidden;
  height: 10rem;
}

.message:hover {
  border-bottom: 5px solid #0e3721;
  height: 12em;
  width: 380px;
  transition: ease 0.5s;
}

.formEntry {
  display: block;
  margin: 30px auto;
  min-width: 300px;
  padding: 10px;
  border-radius: 2px;
  border: none;
  transition: all 0.5s ease 0s;
}


.submit {
  width: 200px;
  color: white;
  background-color: darkorchid; 
  font-size: 20px;
}

.submit:hover {
  box-shadow: 15px 15px 15px 5px rgba(78, 72, 77, 0.219);
  transform: translateY(-3px);
  width: 300px;
  border-top: 5px solid #0e3750;
  border-radius: 0%;
}

@keyframes bounce {
  0% {
    tranform: translate(0, 4px);
  }
  50% {
    transform: translate(0, 8px);
  }
} 



.star-rating { 
    display: flex; 
    direction: row-reverse; 
    justify-content: center; 
    margin-bottom: 10px; 
} 
.star { 
    font-size: 30px; 
    color: #ccc; 
    cursor: pointer; 
    } 
 
.star:hover, 
.star:hover ~ .star { 
    color: gold; 
} 
 

</style>
<body>
  <div class="wrapper">
    <form class="form">
      <div class="pageTitle title"> FeedBack </div>
      <div class="secondaryTitle title"> Tell us what you think....</div>
      <input type="text" class="name formEntry" placeholder="Name" name="txtname"  />
      <input type="text" class="email formEntry" placeholder="Email" name="txtemail" />
      <input class="message formEntry" placeholder="Message" type="text" name="txtmessage" value="" />
      
      
      
      <div class="star-rating"> 
            <span class="star" data-value="1">&#9733;</span> 
            <span class="star" data-value="2">&#9733;</span> 
            <span class="star" data-value="3">&#9733;</span> 
            <span class="star" data-value="4">&#9733;</span> 
            <span class="star" data-value="5">&#9733;</span> 
        </div>
      
      
       <button class="submit formEntry" onclick="thanks()">Submit</button> 
    </form>
  </div>
  <script src="app.js"></script>
</body>

</html>

         <%
           String name=request.getParameter("txtname");
           String email=request.getParameter("txtemail");
           String message=request.getParameter("txtmessage");
           Statement st1=con.createStatement();
          if(name!=null && name!="" && email!=null && email!="" && message!=null && message!="")
           {
               String str2="insert into feedback(Name,Email,Message)values('"+name+"','"+email+"','"+message+"')";
               int a=st1.executeUpdate(str2);
               out.println("<script>alert('Your FeedBack is Submitted...')</script>");
           
           }
           %>      


<script>
const stars = document.querySelectorAll('.star'); 
 
stars.forEach(star => { 
    star.addEventListener('click', () => { 
        const rating = star.getAttribute('data-value'); 
        stars.forEach(s => { 
            s.style.color = s.getAttribute('data-value') <= rating ? 'gold' : '#ccc'; 
        }); 
    }); 
}); 
</script>