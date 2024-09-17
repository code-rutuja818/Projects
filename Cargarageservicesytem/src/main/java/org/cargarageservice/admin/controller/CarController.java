package org.cargarageservice.admin.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.model.CarModel;
import org.cargarageservice.admin.service.CarServiceImpl;



@WebServlet("/newcar")
public class CarController extends HttpServlet {
	CarServiceImpl carService= new CarServiceImpl();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String contact=request.getParameter("contact");
			String address=request.getParameter("address");
			CarModel model= new CarModel();
			model.setName(name);
			model.setEmail(email);
			model.setContact(contact);
			model.setAddress(address);
			boolean b =carService.isAddNewCar(model);
			if(b) {
				out.println("<h3> customer added success</h3>");
			}
			else {
				out.println("<h3> some problem is there</h3>");
			}
			
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
