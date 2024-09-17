package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.service.VehicleService;
import org.cargarageservice.admin.service.VehicleServiceImpl;


@WebServlet("/deletevehicleclass")
public class deletevehicleclass extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		int car_id=Integer.parseInt(request.getParameter("car_id"));
		VehicleService dService =new VehicleServiceImpl();
		boolean b=dService.isDeleteVehicleById(car_id);
		if(b) {
			RequestDispatcher r= request.getRequestDispatcher("viewvehicle.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>some problem is there</h1>");
		}
		
		
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
