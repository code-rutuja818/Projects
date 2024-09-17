package org.cargarageservice.admin.service;

import org.cargarageservice.admin.DBConfig.DBConfig;
import org.cargarageservice.admin.model.AdminModel;
import org.cargarageservice.admin.repository.*;

public class AdminServiceImpl extends DBConfig implements AdminService {
	AdminLogin arepo=new AdminLoginImpl();
	@Override
	public boolean isUserPass(AdminModel model) {
		return arepo.isUserPass(model)?true:false;
		
	}
}
	