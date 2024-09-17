package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.*;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpumpadmin.model.MachineModel;

public class MachineRepositoryImpl extends DBConfig implements MachineRepository {
List<MachineModel> list;
	@Override
	public boolean isAddNewMachine(MachineModel model) {
		try {
			
	     	stmt= conn.prepareStatement("insert into machineinfo values('0',?)");
	     	stmt.setString(1,model.getMachineCode());
	     	int value=stmt.executeUpdate();
	     	return value>0?true:false;
		
		}
		
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return false;
		}
		
		
	}

	@Override
	public List<MachineModel> getAllMachines() {
		try {
			list=new ArrayList<MachineModel>();
			stmt=conn.prepareStatement("select * from machineinfo");
			rs=stmt.executeQuery();
			while(rs.next()) {
				MachineModel model= new MachineModel();
				model.setId(rs.getInt(1));
				model.setMachineCode(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
		}
		
		catch(Exception ex){
			System.out.println("Error is"+ex);
			return null;
		}
		
	}

	@Override
	public boolean isDeleteMachineById(int mid) {
		try {
			stmt=conn.prepareStatement("delete from machineinfo where mid=?");
			stmt.setInt(1, mid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex){
			System.out.println("error is"+ex);
			return false;
		}
		
	}

}
