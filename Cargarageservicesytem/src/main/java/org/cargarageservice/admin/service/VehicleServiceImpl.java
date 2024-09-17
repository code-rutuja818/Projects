package org.cargarageservice.admin.service;

import java.util.List;


import org.cargarageservice.admin.model.VehicleModel;

import org.cargarageservice.admin.repository.VehicleRepository;
import org.cargarageservice.admin.repository.VehicleRepositoryImpl;

public class VehicleServiceImpl  implements VehicleService{
	VehicleRepository d=new VehicleRepositoryImpl();
	@Override
	public boolean isAddNewVehicle(VehicleModel model,String contact) {
		return d.isAddNewVehicle(model,contact);
	}
	@Override
	public List<Object[]> getAllVehicle() {
		// TODO Auto-generated method stub
		return d.getAllVehicle();
	}
	@Override
	public boolean isDeleteVehicleById(int car_id) {
		return d.isDeleteVehicleById(car_id);
	}
	@Override
	public boolean isUpdateVehicle(VehicleModel vmodel) {
		// TODO Auto-generated method stub
		return d.isUpdateVehicle(vmodel);
	}
	@Override
	public int isCustContact(String contact) {
		// TODO Auto-generated method stub
		return d.isCustContact(contact);
	}

	

	
}
		
		
