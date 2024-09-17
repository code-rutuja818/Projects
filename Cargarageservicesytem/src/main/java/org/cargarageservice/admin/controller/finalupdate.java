package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.model.CarModel;
import org.cargarageservice.admin.service.CarService;
import org.cargarageservice.admin.service.CarServiceImpl;
import java.io.*;

@WebServlet("/finalupdate")
public class finalupdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
			int custid=Integer.parseInt(request.getParameter("custid"));
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String contact=request.getParameter("contact");
			String address=request.getParameter("address");
			CarModel model= new CarModel();
			model.setCustid(custid);
			model.setName(name);
			model.setEmail(email);
			model.setContact(contact);
			model.setAddress(address);
			System.out.println(model);
			CarService carService=new CarServiceImpl();
			boolean b=carService.isUpdateCustomer(model);
			if(b) {
				 RequestDispatcher r=request.getRequestDispatcher("viewcustomer.jsp");
				r.forward(request, response);
			}
			else {
				out.println("<h1> not update</h1>");
			}
			


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
