package org.cargarageservice.admin.repository;

import java.util.ArrayList;

import java.util.List;

import org.cargarageservice.admin.DBConfig.DBConfig;
import org.cargarageservice.admin.model.CarModel;
import org.cargarageservice.admin.model.VehicleModel;

public class VehicleRepositoryImpl extends DBConfig implements VehicleRepository {
	String contact;
		List<Object[]> list;
		 @Override
		public boolean isAddNewVehicle(VehicleModel model,String contact) {
			
	    try {
	
				int cid=this.isCustContact(contact);
		     	stmt= conn.prepareStatement("insert into vehicle values('0',?,?,?)");
		     	stmt.setString(1,model.getNo_plate());
		     	stmt.setString(2,model.getModel());
		     	stmt.setInt(3,cid );
		     	int value=stmt.executeUpdate();
		     	return value>0?true:false;
			
			}
			
			catch(Exception ex) {
				System.out.println("Error in isAddNewVehicle "+ex);
				return false;
			}
			
		}
		
		 public int isCustContact(String contact) {
			try {
				stmt=conn.prepareStatement("select cust_id from customer where cust_contact=?");
				stmt.setString(1, contact);
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
		public List<Object[]> getAllVehicle() {
			try {
				list=new ArrayList<Object[]>();
				stmt=conn.prepareStatement("select v.no_plate, v.model, c.cust_name, c.cust_contact,v.car_id from vehicle v inner join customer c on c.cust_id=v.cust_id");
				rs=stmt.executeQuery();
				while(rs.next()) {
					Object []obj=new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)};
					list.add(obj);
				}
				return list.size()>0?list:null;
			}
			
			catch(Exception ex){
				System.out.println("Error isgetAllVehicle"+ex);
				return null;
			}
			
		}
		@Override
		public boolean isDeleteVehicleById(int car_id) {
			try {
				stmt=conn.prepareStatement("delete from vehicle where car_id=?");
				stmt.setInt(1, car_id);
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch(Exception ex){
				System.out.println("error is"+ex);
				return false;
			}
		}
		@Override
		public boolean isUpdateVehicle(VehicleModel model) {
			
			System.out.println(model);
			try {
				stmt=conn.prepareStatement("update vehicle set no_plate=?,model=? where car_id=?");
				stmt.setString(1, model.getNo_plate());
				stmt.setString(2, model.getModel());
				stmt.setInt(3, model.getCar_id());
				int value=stmt.executeUpdate();
				return value>0?true:false;
			}
			catch(Exception ex) {
				System.out.println("Error is isUpdateVehicle"+ex);
				return false;
			}
			
		}

	}

	

