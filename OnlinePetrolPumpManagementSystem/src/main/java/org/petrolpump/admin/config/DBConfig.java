package org.petrolpump.admin.config;
import java.sql.*;
import java.util.List;

import org.petrolpumpadmin.model.MachineModel;
public class DBConfig {
    protected Connection conn;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    
     public DBConfig() {
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/petrolpump","root","root");
    	 }
    	 catch(Exception ex){
    		System.out.println("Error is"+ex); 
    	 }
     }

	public List<MachineModel> getAllMachines() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
