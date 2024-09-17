package org.cargarageservice.admin.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


public class DBConfig {
	protected Connection conn;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    
     public DBConfig() {
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
    	 }
    	 catch(Exception ex){
    		System.out.println("Error is"+ex); 
    	 }
     }

	
}
