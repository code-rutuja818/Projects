package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.service.SService;
import org.cargarageservice.admin.service.SServiceImpl;

@WebServlet("/deleteservice")
public class deleteservice extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		int serviceid=Integer.parseInt(request.getParameter("serviceid"));
		SService sService =new SServiceImpl();
		boolean b=sService.isDeleteServiceById(serviceid);
		if(b) {
			RequestDispatcher r= request.getRequestDispatcher("viewservice.jsp");
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
