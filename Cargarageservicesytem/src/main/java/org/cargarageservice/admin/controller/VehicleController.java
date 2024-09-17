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
import org.cargarageservice.admin.service.CarServiceImpl;
import org.cargarageservice.admin.service.VehicleServiceImpl;


@WebServlet("/VehicleController")

public class VehicleController extends HttpServlet {
	VehicleServiceImpl vehicleService= new VehicleServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String noplate=request.getParameter("no_plate");
		String model=request.getParameter("model");
		String contact=request.getParameter("contact");
		
		VehicleModel vmodel= new VehicleModel();
		System.out.println(noplate);
		vmodel.setNo_plate(noplate);
		vmodel.setModel(model);
		int cid=vehicleService.isCustContact(contact);
				if(cid==-1) {
					System.out.println("enter valid contact");
				}
				else {

					boolean b =vehicleService.isAddNewVehicle(vmodel,contact);
					if(b) {
						RequestDispatcher rd=request.getRequestDispatcher("viewvehicle.jsp");
						rd.include(request, response);
					}
					else {
						RequestDispatcher rd=request.getRequestDispatcher("addvehicle.jsp");
						rd.include(request, response);
						out.println("cust not added");
					}
					
				}
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
