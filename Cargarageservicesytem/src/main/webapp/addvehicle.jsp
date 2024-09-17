<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.col{
background-image:url(sky1.jpg);
width:80%;
height:100vh
background-repeat:no-repeat;
background-size:cover;
}

</style>
</head>
<body>
<%@include file="adminboard.jsp" %>
 <div class="col py-3">
       <form class="formarea" name="frm" action="VehicleController" method="POST">
   <br>
  <div class="form-group ">
    <label for="exampleInputEmail1">Number Plate</label>
    <br>
    <input type="text" class="form-control control" name="no_plate" id="exampleInputname" aria-describedby="emailHelp" placeholder="enter car number">  
  </div>
  <br>
  

  
   <div class="form-groupcontact ">
    <label for="exampleInputEmail1">Model</label>
    <br>
    <input type="text" class="form-control control" name="model" id="exampleInputcontact" aria-describedby="emailHelp" placeholder="enter model name">  
  </div>
  
  <br>
  <div class="form-groupcontact ">
    <label for="exampleInputEmail1">Customer Contact</label>
    <br>
    <input type="text" class="form-control control" name="contact" id="exampleInputcontact" aria-describedby="emailHelp" placeholder="enter cust contact">  
  </div>
  
  <br>
  
  <button type="submit" class="btn" style="background-color:#217b7e; color:white">Add New vechicle</button>
</form>        
      </div>
    </div>
</div>
</body>
</html>