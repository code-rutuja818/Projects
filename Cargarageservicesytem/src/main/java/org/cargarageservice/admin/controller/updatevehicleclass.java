package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatevehicleclass")
public class updatevehicleclass extends HttpServlet {
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		int car_id=Integer.parseInt(request.getParameter("car_id"));
		//System.out.println(custid);
		String model=(request.getParameter("model"));
		String no_plate=(request.getParameter("no_plate"));
	

		RequestDispatcher r= request.getRequestDispatcher("adminboard.jsp");
		r.include(request, response);
		out.println("<div class='col py-3'>");
		 out.println("<form class='formarea' name='frm' action='finalvehicleupdate' method='POST'>");
		out.println("<input type ='hidden' name='car_id' value='"+car_id+"'/></br> <br/>");
		out.println("<input type ='text' name='model' value='"+model+"' /><br/><br/>");
		out.println("<input type ='text' name='no_plate' value='"+no_plate+"' /><br/><br/>");
		out.println("<input type ='submit' name='update' value='update_vehicle' />");
		out.println("</div></div></div>");
		
		
			
		}
		

	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
