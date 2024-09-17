<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.cargarageservice.admin.service.*" %>
    <%@page import="org.cargarageservice.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input{
margin-top:50px;
margin-left:520px;
padding:10px;
text-align:center;
}

</style>
</head>
<%@include file="customerdash.jsp" %>
<body>
<%!                                                           

CarModel c;
%>
<%
	int customerId=Integer.parseInt(session.getAttribute("customerId").toString());
	CarService cService = new CarServiceImpl();
	c = cService.getProfile(customerId);
	
%>
<input type='text' name='name' value='<%=c.getName()%>'/><br/>
<input type='text' name='email' value='<%=c.getEmail()%>'/><br/>
<input type='text' name='contact' value='<%=c.getContact()%>'/><br/>
<input type='text' name='address' value='<%=c.getAddress()%>'/><br/>


</body>
</html>