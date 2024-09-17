<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.col{
background-image:url(carx.avif);
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
       <form class="formarea" name="frm" action="newcar" method="POST">
   <br>
  <div class="form-group ">
    <label for="exampleInputEmail1">Name</label>
    <br>
    <input type="text" class="form-control control" name="name" id="exampleInputname" aria-describedby="emailHelp" placeholder="enter cust name">  
  </div>
  <br>
  
   <div class="form-groupemail ">
    <label for="exampleInputEmail1">Email</label>
    <br>
    <input type="text" class="form-control control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="enter cust email">  
  </div>
 <br>
  
   <div class="form-groupcontact ">
    <label for="exampleInputEmail1">Contact</label>
    <br>
    <input type="text" class="form-control control" name="contact" id="exampleInputcontact" aria-describedby="emailHelp" placeholder="enter custcontact">  
  </div>
  
  <br>
  <div class="form-groupaddress ">
    <label for="exampleInputEmail1">Address</label>
    <br>
    <input type="text" class="form-control control" name="address" id="exampleInputaddress" aria-describedby="emailHelp" placeholder="enter cust address">  
  </div>
  <br>
  <button type="submit" class="btn" style="background-color:#217b7e; color:white">Add new customer</button>
</form>        
      </div>
    </div>
</div>
</body>
</html>