package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.service.CarService;
import org.cargarageservice.admin.service.CarServiceImpl;


@WebServlet("/del")
public class deleteservletclass extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		int cid=Integer.parseInt(request.getParameter("custid"));
		CarService mService =new CarServiceImpl();
		boolean b=mService.isDeleteCarById(cid);
		if(b) {
			RequestDispatcher r= request.getRequestDispatcher("viewcustomer.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>some problem is there</h1>");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
