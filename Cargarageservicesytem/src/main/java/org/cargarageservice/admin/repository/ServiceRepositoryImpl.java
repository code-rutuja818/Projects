package org.cargarageservice.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.cargarageservice.admin.DBConfig.DBConfig;
import org.cargarageservice.admin.model.CarModel;
import org.cargarageservice.admin.model.ServiceModel;



public class ServiceRepositoryImpl extends DBConfig implements ServiceRepository{
	List<Object[]> list;
	@Override
	public boolean isAddNewService(ServiceModel smodel,String model) {
try {
		int car_id=this.isCarModel(model);
	     	stmt= conn.prepareStatement("insert into service values('0',?,?,?,?)");
	     	
	     	stmt.setString(1,smodel.getService_date());
	     	stmt.setString(2,smodel.getService_type());
	     	stmt.setInt(3,smodel.getCharge());
	     	stmt.setInt(4, car_id);
	     	int value=stmt.executeUpdate();
	     	return value>0?true:false;
		
		}
		
		catch(Exception ex) {
			System.out.println("Error in isAddNewService "+ex);
			return false;
		}
	}
	

	 public int isCarModel(String model) {
		try {
			stmt=conn.prepareStatement("select car_id from vehicle where model=?");
			stmt.setString(1, model);
			rs=stmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			else {
				return -1;
			}
		}
	
	catch(Exception ex) {
		System.out.println("Error iscustcontact"+ex);
		return 0;
	}
	 }

	@Override
	public List<Object[]> getAllService() {
		try {
			list=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select s.service_date,s.service_type,s.charge,v.no_plate,s.service_id from service s inner join vehicle v on v.car_id=s.car_id");
			rs=stmt.executeQuery();
			while(rs.next()) {
				Object []obj=new Object[] {rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5)};
				list.add(obj);
			}
			return list.size()>0?list:null;
		}
		
		catch(Exception ex){
			System.out.println("Error isgetAllService"+ex);
			return null;
		}
	}

	@Override
	public boolean isDeleteServiceById(int serviceid) {
		try {
			stmt=conn.prepareStatement("delete from service where service_id=?");
			stmt.setInt(1, serviceid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex){
			System.out.println("error is"+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateService(ServiceModel smodel) {
		System.out.println(smodel);
		try {
			stmt=conn.prepareStatement("update service set service_date=?,service_type=?,amount=? where service_id=?");
			stmt.setString(1, smodel.getService_date());
			stmt.setString(2, smodel.getService_type());
			stmt.setInt(3, smodel.getCharge());
			stmt.setInt(5, smodel.getService_id());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is isUpdateCustomer"+ex);
			return false;
		}
	}
	
}