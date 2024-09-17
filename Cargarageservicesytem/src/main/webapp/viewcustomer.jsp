<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.cargarageservice.admin.service.*,java.util.*,org.cargarageservice.admin.model.*" %>
    
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
<%!
CarService carService = new CarServiceImpl();
%>
<%@include file="adminboard.jsp" %>
 <div class="col py-3">
 

 <br/><br/>
 <center><h1>Customer Details</h1></center>
<center><table class="table table-bordered mt-5 border-dark border-5" style="width:500px;text-align:center;"></center>


  <thead>
    <tr style="color:black;">
      <th scope="col">Sr.No</th>
      <th scope="col">CustomerName</th>
      <th scope="col">Email</th>
      <th scope="col">Contact</th>
      <th scope="col">Address</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
      

    </tr>
  </thead>
  <tbody>
  <%
  List<CarModel> list=carService.getAllCustomer();
  int count=0;
  if(list!=null){
  for(CarModel m:list){
	  int id=m.getCustid();
	  
  %>
	  <tr>
	  <td><%=++count%> </td>  
	  <td><%=m.getName()%></td>
	  <td><%=m.getEmail()%></td>
	  <td><%=m.getContact()%></td>
	  <td><%=m.getAddress()%></td>
	   <td><a href='del?custid=<%=m.getCustid()%>'><ion-icon name="trash-outline"></ion-icon></a></td>
	  <td><a href='updateservletclass?custid=<%=m.getCustid()%>&name=<%=m.getName()%>&email=<%=m.getEmail()%>&contact=<%=m.getContact()%>&address=<%=m.getAddress()%>'><ion-icon name="create-outline"></ion-icon></a></td>

	  <% 
  }
  }
   %>

  </tbody>
</table>
</body>
</html>







