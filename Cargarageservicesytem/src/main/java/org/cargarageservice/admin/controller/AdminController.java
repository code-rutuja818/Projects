package org.cargarageservice.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cargarageservice.admin.model.AdminModel;
import org.cargarageservice.admin.service.*;


@WebServlet("/login")
public class AdminController extends HttpServlet {
	
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			AdminModel model=new AdminModel();
			model.setUsername(user);
			model.setPassword(pass);
			AdminService as=new AdminServiceImpl();
			boolean b=as.isUserPass(model);
			if(b) {
				RequestDispatcher rd=request.getRequestDispatcher("adminboard.jsp");
			    rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
