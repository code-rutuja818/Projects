++<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.cargarageservice.admin.service.*,java.util.*,org.cargarageservice.admin.model.*" %>
    
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
<%!
VehicleService vehicleService = new VehicleServiceImpl();
%>
<%@include file="adminboard.jsp" %>
 <div class="col py-3">
 

 <br/><br/>
 <center><h1>Vehicle Details</h1></center>
<center><table class="table table-bordered mt-5 border-dark border-5" style="width:500px;text-align:center;"></center>



  <thead>
    <tr style="color:black;">
      <th scope="col">Sr.No</th>
      <th scope="col">No.Plate</th>
      <th scope="col">Model</th>
       <th scope="col">Customer Name</th>
        <th scope="col">Customer Contact</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
      

    </tr>
  </thead>
  <tbody>
  <%
  List<Object[]> list=vehicleService.getAllVehicle();
  int count=0;
  if(list!=null){
  for(Object obj[]:list){
	
	  
  %>
	  <tr>
	  <td><%=++count%> </td>  
	  <td><%=obj[0]%></td>
	  <td><%=obj[1]%></td>
	  <td><%=obj[2]%></td>
	  <td><%=obj[3]%></td>
	
	   <td><a href='deletevehicleclass?car_id=<%=obj[4]%>'><ion-icon name="trash-outline"></ion-icon></a></td>
	   <td><a href='updatevehicleclass?car_id=<%=obj[4]%>&no_plate=<%=obj[0].toString()%>&model=<%=obj[1].toString()%>'><ion-icon name="create-outline"></ion-icon></a></td>

	   
	
	  
	  <% 
  }
  }
   %>

  </tbody>
</table>
</body>
</html>







