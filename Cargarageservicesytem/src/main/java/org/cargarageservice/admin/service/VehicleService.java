package org.cargarageservice.admin.service;


import java.util.List;


import org.cargarageservice.admin.model.VehicleModel;

public interface VehicleService {
	public boolean isAddNewVehicle(VehicleModel model,String contact);
	public List<Object[]> getAllVehicle();
	public boolean isDeleteVehicleById(int car_id);
	public boolean isUpdateVehicle(VehicleModel vmodel);
	 public int isCustContact(String contact);
}
