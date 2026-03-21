<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="c2.css">

    <title>Contact us</title>
</head>
<body>
    <section class="contact">
        <div class="container">
            <h2>Contact us</h2>
            <div class="contact-wrapper">
           
            <div class="contact-info">
              <h3>Contact Information</h3>  
              <p><i class="fas fa-phone"></i>+91 9325355028 , +91 9881284002</p>
              <p><i class="fas fa-envelope"></i>hs1321@gmail.com</p>
              <p><i class="fas fa-map-marker-alt"></i>College road,vidyanagar,SGM college Karad.</p>

            </div>
            </div>
        </div>
    </section>
</body>
</html>
<style>
 *{
    margin: 0px;
    padding: 0px;
    box-sizing: border-box; 
    font-family: sans-serif;
}
.contact{
    min-height: 200vh;
    background-color: lavender;
    padding: 80px;
    text-align: center;
}
.container{
    max-width: 800px;
    margin: 0 auto;
}
.container h2{
    font-size: 36px;
    background-color: darkblue;
    margin-bottom: 150px;
    color: #fff;
}
.contact-wrapper{
    display: grid;
    grid-template-columns: repeat(2,1fr);
    grid-gap: 30px;
}

input, textarea{
    width: 100%;
    padding: 12px;
    border-radius: 8px;
    border: none;
    background-color: #f8f9fa;
    color: #333;
}


.contact-info{
    text-align: left;
}
.contact-info h3{
    font-size: 28px;
    margin-bottom: 30px;
    color: #333;
}
.contact-info p{
    margin-left: auto;
    margin-right: auto;
   margin-bottom: 10px;
   margin-right: 20px;
   color: #555; 
}
.contact-info i{
    color: #11aeb0;
    margin-right: 20px;
    text-align: center;
}
@media screen and (max-width:768px){
    .container{
        padding: 20px;
    }
    .contact-wrapper{
        grid-template-columns: 1fr;
    }
}


</style>>