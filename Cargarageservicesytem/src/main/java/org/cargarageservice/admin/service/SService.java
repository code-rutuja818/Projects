package org.cargarageservice.admin.service;

import java.util.List;

import org.cargarageservice.admin.model.ServiceModel;


public interface SService {
public boolean isAddNewService(ServiceModel smodel, String model);
public  List<Object[]> getAllService();
public boolean isDeleteServiceById(int serviceid);
public boolean isUpdateService(ServiceModel smodel);
public int isCarModel(String model);
}
