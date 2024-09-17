package org.cargarageservice.admin.repository;

import java.util.List;


import org.cargarageservice.admin.model.VehicleModel;

public interface VehicleRepository {
	 
	public boolean isAddNewVehicle(VehicleModel model,String contact);
	 public List<Object[]> getAllVehicle();
	 public boolean isDeleteVehicleById(int custid);
	 public boolean isUpdateVehicle(VehicleModel vmodel);
	 public int isCustContact(String contact);
	 

}
