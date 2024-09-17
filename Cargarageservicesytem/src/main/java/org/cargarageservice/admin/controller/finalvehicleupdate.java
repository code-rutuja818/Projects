package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.cargarageservice.admin.model.VehicleModel;
import org.cargarageservice.admin.service.VehicleService;
import org.cargarageservice.admin.service.VehicleServiceImpl;


@WebServlet("/finalvehicleupdate")
public class finalvehicleupdate extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
			int car_id=Integer.parseInt(request.getParameter("car_id"));
			String noplate=request.getParameter("no_plate");
			String vmodel=request.getParameter("model");
			
			VehicleModel model= new VehicleModel();
			model.setCar_id(car_id);
			model.setNo_plate(noplate);
	
			model.setModel(vmodel);
			System.out.println(model);
			VehicleService vehicleService=new VehicleServiceImpl();
			boolean b=vehicleService.isUpdateVehicle(model);
			if(b) {
				 RequestDispatcher r=request.getRequestDispatcher("viewvehicle.jsp");
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
