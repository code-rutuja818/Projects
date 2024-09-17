package org.cargarageservice.admin.service;

import java.util.List;

import org.cargarageservice.admin.model.CarModel;


public interface CarService {
public boolean isAddNewCar(CarModel model);
public  List<CarModel> getAllCustomer();
public boolean isDeleteCarById(int custid);
public boolean isUpdateCustomer(CarModel vmodel);
public int verifyCustomer(String email,String contact);
public CarModel getProfile(int customerId);
}
