package org.cargarageservice.admin.repository;

import java.util.List;

import org.cargarageservice.admin.model.CarModel;


public interface CarRepository {
  public boolean isAddNewCar(CarModel model);
  public List<CarModel> getAllCustomer();
  public boolean isDeleteCarById(int custid);
  public boolean isUpdateCustomer(CarModel model);
  public int verifyCustomer(String email,String contact);
  public CarModel getProfile(int customerId);
}
