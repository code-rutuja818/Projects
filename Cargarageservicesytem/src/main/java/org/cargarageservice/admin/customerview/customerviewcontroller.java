package org.cargarageservice.admin.customerview;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cargarageservice.admin.service.CarServiceImpl;
import org.cargarageservice.admin.service.CarService;
@WebServlet("/customerviewcontroller")
public class customerviewcontroller extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		
		CarService cService= new CarServiceImpl();
		int result=cService.verifyCustomer(email,contact);
		if(result!=0) {
			HttpSession session = request.getSession(true);
			session.setAttribute("customerId", result);
			RequestDispatcher r=request.getRequestDispatcher("customerdash.jsp");
			r.forward(request, response);
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
