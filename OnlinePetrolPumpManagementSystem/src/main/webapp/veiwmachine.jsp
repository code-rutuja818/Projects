<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.petrolpump.admin.service.*,java.util.*,org.petrolpumpadmin.model.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
MachineService machineService = new MachineServiceImpl();
%>
<%@include file="admindashboard.jsp" %>
 <div class="col py-3">
 <br/><br/>
 <h1>Machine Details</h1>
<table class="table">

  <thead>
    <tr>
      <th scope="col">sr no</th>
      <th scope="col">Machine </th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%
  List<MachineModel> list=machineService.getAllMachines();
  int count=0;
  for(MachineModel m:list){
  %>
	  <tr>
	  <th scope="row"><%=++count%> </th>  
	  <td><%=m.getMachineCode()%></td>
	  <td><a href='del?machineid=<%=m.getId()%>'>DELETE</a></td>
	  <td><a href=''>UPDATE</a></td>  
	  </tr>
	  <% 
  }
   %>

  </tbody>
</table>
</body>
</html>




