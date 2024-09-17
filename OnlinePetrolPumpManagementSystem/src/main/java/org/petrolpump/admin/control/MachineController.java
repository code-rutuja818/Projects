package org.petrolpump.admin.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.service.MachineService;
import org.petrolpump.admin.service.MachineServiceImpl;
import org.petrolpumpadmin.model.MachineModel;


@WebServlet("/newmachine")
public class MachineController extends HttpServlet {
	MachineService machineService = new MachineServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String machineCode=request.getParameter("machineCode");
		MachineModel model= new MachineModel();
		model.setMachineCode(machineCode);
		boolean b= machineService.isAddNewMachine(model);
		if(b) {
			out.println("<h1> Machine Added success</h1>");
		}
		else {
			out.println("<h1>some problem is there</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
