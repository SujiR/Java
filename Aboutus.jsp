<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}




* {
    box-sizing: border-box;
}





/* Style the container/contact section */
.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 10px;
}

/* Create two columns that float next to eachother */
.column {
    float: left;
    width: 50%;
    margin-top: 6px;
    padding: 20px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .column, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
    
    .back
{
   height: 700px;
   background-image: url("https://upload.wikimedia.org/wikipedia/commons/6/63/2k16_MZ_logo_reduced_resolution.png");
   background-repeat: no-repeat;
   background-size: 50%;
   
   background-position:center;
}
    
    
    
}
</style>
</head>
<body>
<%@include file="header.jsp"%>
<div class="container">
<div class="row">

 
   <center> <h2>About Us</h2>
    <h4>We provide all categories of Hyundai Cars in our showroom</h4></center>
    <center>
  <p>Hyundai Group is a South Korean business conglomerate headquartered in Seoul. It was founded by Chung Ju-yung in 1947 as a construction firm and Chung was directly in control of the company until his death in 2001.
  Following the 1997 East Asian financial crisis and Chung's death, Hyundai underwent a major restructuring and break-up, which reduced the Hyundai Group's business to encompass only container shipping services, the manufacturing of lifts, and tourism. 
  Today, most companies bearing the name Hyundai are not legally connected to Hyundai Group. They include Hyundai Motor Group, Hyundai Department Store Group, Hyundai Heavy Industries Group and Hyundai Development Company. However, most of the former subsidiaries of the Hyundai conglomerate continue to be run by relatives of Chung. 
  If these companies were considered as forming a single broad family business, then it would remain the largest company in South Korea with enormous economic and political power in the country.

    </p>


    
    <div class="col-lg-6 col-sm-12 left">
    <div class="back"></div>
    </div>
     <div class="col-lg-6 col-sm-12 right">
    
            
    </div>
    </div>
    </div>
 

<%@ include file="footer.jsp" %>
</body>
</html>