package org.cargarageservice.admin.repository;

import java.util.ArrayList;

import java.util.List;

import org.cargarageservice.admin.DBConfig.DBConfig;
import org.cargarageservice.admin.model.CarModel;



public class CarRepositoryImpl extends DBConfig implements CarRepository{
	List<CarModel> list;
	@Override
	public boolean isAddNewCar(CarModel model) {
		
try {
			
	     	stmt= conn.prepareStatement("insert into customer values('0',?,?,?,?)");
	     	
	     	stmt.setString(1,model.getName());
	     	stmt.setString(2,model.getEmail());
	     	stmt.setString(3,model.getContact());
	     	stmt.setString(4,model.getAddress());
	     	int value=stmt.executeUpdate();
	     	return value>0?true:false;
		
		}
		
		catch(Exception ex) {
			System.out.println("Error in isAddNewCar "+ex);
			return false;
		}
		
	}
	
	public List<CarModel> getAllCustomer()  {
		try {
			list=new ArrayList<CarModel>();
			stmt=conn.prepareStatement("select * from customer");
			rs=stmt.executeQuery();
			while(rs.next()) {
				CarModel model= new CarModel();
				model.setCustid(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setEmail(rs.getString(3));
				model.setContact(rs.getString(4));
				model.setAddress(rs.getString(5));
				list.add(model);
			}
			return list.size()>0?list:null;
		}
		
		catch(Exception ex){
			System.out.println("Error isgetAllCustomer"+ex);
			return null;
		}
		
	}

	@Override
	public boolean isDeleteCarById(int custid) {
		
		try {
			stmt=conn.prepareStatement("delete from customer where cust_id=?");
			stmt.setInt(1, custid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex){
			System.out.println("error is"+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateCustomer(CarModel model) {
		System.out.println(model);
		try {
			stmt=conn.prepareStatement("update customer set cust_name=?,cust_email=?,cust_contact=?,address=? where cust_id=?");
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getEmail());
			stmt.setString(3, model.getContact());
			stmt.setString(4, model.getAddress());
			stmt.setInt(5, model.getCustid());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is isUpdateCustomer"+ex);
			return false;
		}
		
	}

	
	public int verifyCustomer(String email, String contact) {
		
		try {
			stmt=conn.prepareStatement("select * from customer where cust_email=? and cust_contact=?");
			stmt.setString(1, email);
			stmt.setString(2, contact);
			rs=stmt.executeQuery();
			CarModel model= new CarModel();
			if(rs.next()) {
				return rs.getInt(1);
			}
			else {
				return 0;
			}
			
		}
		catch(Exception ex){
			System.out.println("Error is isverifyCustomer"+ex);
			return 0;
		}
	}

	@Override
	public CarModel getProfile(int customerId) {
		try {
			
			stmt=conn.prepareStatement("select * from customer where cust_id=?");
			stmt.setInt(1, customerId);
			rs=stmt.executeQuery();
			CarModel c=null;
			if(rs.next()) {
				c=new CarModel();
				c.setCustid(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setContact(rs.getString(4));
				c.setAddress(rs.getString(5));
			}
			return c;
		}
		catch(Exception ex) {
			return null;
		}
	
	}

}
