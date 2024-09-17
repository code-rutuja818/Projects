package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateservice")
public class updateservice extends HttpServlet {
	
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		int service_id=Integer.parseInt(request.getParameter("service_id"));
		//System.out.println(custid);
		String service_date=(request.getParameter("service_date"));
		String service_type=(request.getParameter("service_type"));
		String charge=(request.getParameter("charge"));

		RequestDispatcher r= request.getRequestDispatcher("adminboard.jsp");
		r.include(request, response);
		out.println("<div class='col py-3'>");
		 out.println("<form class='formarea' name='frm' action='finalserviceupdate' method='POST'>");
		out.println("<input type ='hidden' name='service_id' value='"+service_id+"'/></br> <br/>");
		out.println("<input type ='text' name='service_type' value='"+service_type+"' /><br/><br/>");
		out.println("<input type ='text' name='charge' value='"+charge+"' /><br/><br/>");
		out.println("<input type ='submit' name='update' value='update_service' />");
		out.println("</div></div></div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
