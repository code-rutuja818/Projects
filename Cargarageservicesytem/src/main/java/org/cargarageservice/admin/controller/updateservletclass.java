package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.model.CarModel;
import org.cargarageservice.admin.service.CarService;
import org.cargarageservice.admin.service.CarServiceImpl;

@WebServlet("/updateservletclass")
public class updateservletclass extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		int custid=Integer.parseInt(request.getParameter("custid"));
		System.out.println(custid);
		String name=(request.getParameter("name"));
		String email=(request.getParameter("email"));
		String contact=(request.getParameter("contact"));
		String address=(request.getParameter("address"));

		RequestDispatcher r= request.getRequestDispatcher("adminboard.jsp");
		r.include(request, response);
		out.println("<div class='col py-3'>");
		 out.println("<form class='formarea' name='frm' action='finalupdate' method='POST'>");
		out.println("<input type ='hidden' name='custid' value='"+custid+"'/></br> <br/>");
		out.println("<input type ='text' name='name' value='"+name+"' /><br/><br/>");
		out.println("<input type ='text' name='email' value='"+email+"'/> <br/><br/>");
		out.println("<input type ='text' name='contact' value='"+contact+"'/><br/> <br/>");
		out.println("<input type ='text' name='address' value='"+address+"'/><br/> <br/>");
		out.println("<input type ='submit' name='update' value='update_customer' />");
		out.println("</div></div></div>");
		
		
			
		}
		

	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
