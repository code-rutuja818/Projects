package org.cargarageservice.admin.service;

import java.util.List;

import org.cargarageservice.admin.model.ServiceModel;
import org.cargarageservice.admin.repository.ServiceRepository;
import org.cargarageservice.admin.repository.ServiceRepositoryImpl;

public class SServiceImpl implements SService{
	ServiceRepository s=new ServiceRepositoryImpl();
	@Override
	public boolean isAddNewService(ServiceModel smodel, String model) {
		return s.isAddNewService(smodel, model);
	}

	@Override
	public List<Object[]> getAllService() {
		return s.getAllService();
	}

	@Override
	public boolean isDeleteServiceById(int serviceid) {
		return s.isDeleteServiceById(serviceid);
	}

	@Override
	public boolean isUpdateService(ServiceModel smodel) {
		return s.isUpdateService(smodel);
	}

	@Override
	public int isCarModel(String model) {
		// TODO Auto-generated method stub
		return s.isCarModel(model);
	}
	
	}



