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
import org.cargarageservice.admin.service.SServiceImpl;



@WebServlet("/ServiceController")

public class ServiceController extends HttpServlet {
	SServiceImpl sService= new SServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String sdate=request.getParameter("a");
		String stype=request.getParameter("b");
		int samount=Integer.parseInt(request.getParameter("c"));
		String model=request.getParameter("d");
	ServiceModel smodel = new ServiceModel();
		System.out.println(sdate);
		smodel.setService_date(sdate);
		smodel.setService_type(stype);
		smodel.setCharge(samount);
		int carid=sService.isCarModel(model);
		if(carid==-1) {
			System.out.println("enter valid car model");
		}
		else {

			boolean b =sService.isAddNewService(smodel,model);
			if(b) {
				RequestDispatcher rd=request.getRequestDispatcher("viewservice.jsp");
				rd.include(request, response);
				
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("addservice.jsp");
				rd.include(request, response);
				out.println("service not added");
			}
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
