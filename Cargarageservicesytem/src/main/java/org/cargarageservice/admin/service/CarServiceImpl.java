package org.cargarageservice.admin.service;

import java.util.List;

import org.cargarageservice.admin.model.CarModel;
import org.cargarageservice.admin.repository.CarRepository;
import org.cargarageservice.admin.repository.CarRepositoryImpl;

public class CarServiceImpl  implements CarService{
 CarRepository c=new CarRepositoryImpl();
	@Override
	public boolean isAddNewCar(CarModel model) {
		
		return c.isAddNewCar(model);
	}
	@Override
	public List<CarModel> getAllCustomer() {
		// TODO Auto-generated method stub
		return c.getAllCustomer();
	}
	@Override
	public boolean isDeleteCarById(int custid) {
		// TODO Auto-generated method stub
		return c.isDeleteCarById(custid);
	}
	@Override
	public boolean isUpdateCustomer(CarModel model) {
		// TODO Auto-generated method stub
		return c.isUpdateCustomer(model);
	}
	
	public int verifyCustomer(String email, String contact) {
		// TODO Auto-generated method stub
		return c.verifyCustomer(email,contact);
	}
	@Override
	public CarModel getProfile(int customerId) {
		// TODO Auto-generated method stub
		return c.getProfile(customerId);
	}

}
