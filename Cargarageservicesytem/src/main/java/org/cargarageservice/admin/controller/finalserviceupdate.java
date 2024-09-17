package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.model.ServiceModel;
import org.cargarageservice.admin.service.SService;
import org.cargarageservice.admin.service.SServiceImpl;

@WebServlet("/finalserviceupdate")
public class finalserviceupdate extends HttpServlet {
	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
			int service_id=Integer.parseInt(request.getParameter("service_id"));
			String service_date=request.getParameter("service_date");
			String service_type=request.getParameter("service_type");
			int charge=Integer.parseInt(request.getParameter("charge"));
			
			
			ServiceModel model= new ServiceModel();
			model.setService_id(service_id);
			model.setService_date(service_date);
			model.setService_type(service_type);
			model.setCharge(charge);
			System.out.println(model);
			SService sService=new SServiceImpl();
			boolean b=sService.isUpdateService(model);
			if(b) {
				 RequestDispatcher r=request.getRequestDispatcher("viewservice.jsp");
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
