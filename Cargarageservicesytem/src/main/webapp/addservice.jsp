<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.col{
background-image:url(sky2.jpg);
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
       <form class="formarea" name="frm" action="ServiceController" method="POST">
   <br>
  <div class="form-group ">
    <label for="exampleInputEmail1">Service Date</label>
    <br>
    <input type="text" class="form-control control" name="a" id="exampleInputname" aria-describedby="emailHelp" placeholder="enter service date">  
  </div>
  <br>
  
   <div class="form-groupemail ">
    <label for="exampleInputEmail1">Service Type</label>
    <br>
    <input type="text" class="form-control control" name="b" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="enter service type">  
  </div>
 <br>
  
   <div class="form-groupcontact ">
    <label for="exampleInputEmail1">Amount</label>
    <br>
    <input type="text" class="form-control control" name="c" id="exampleInputcontact" aria-describedby="emailHelp" placeholder="enter amount">  
  </div>
  
  <br>
   <div class="form-groupcontact ">
    <label for="exampleInputEmail1">Car Model</label>
    <br>
    <input type="text" class="form-control control" name="d" id="exampleInputcontact" aria-describedby="emailHelp" placeholder="enter car model">  
  </div>
  
  <br>
  <button type="submit" class="btn" style="background-color:#217b7e; color:white">Add New Service</button>
</form>        
      </div>
    </div>
</div>
</body>
</html>