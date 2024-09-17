package org.cargarageservice.admin.repository;

import org.cargarageservice.admin.DBConfig.DBConfig;
import org.cargarageservice.admin.model.AdminModel;

public class AdminLoginImpl extends DBConfig implements AdminLogin{

	@Override
	public boolean isUserPass(AdminModel model) {
		try {
			stmt=conn.prepareStatement("select *from admin where username=? and password=?");
			stmt.setString(1, model.getUsername());
			stmt.setString(2, model.getPassword());
			rs=stmt.executeQuery();
			return rs.next()?true:false;
		}catch(Exception ex) {
			System.out.println("Exception in AdminLoginImpl Repository is"+ex);
			return false;
		}
	}
	}