package org.exam.repository;

import java.util.ArrayList;
import java.util.List;

import org.exam.model.SubjectModel;

public class SubjectRepository extends DBConfig {
	List<String> list =new ArrayList<String>();
	 public boolean isAddSubject(SubjectModel model) {
		 try {
			 stmt =conn.prepareStatement("insert into subject values('0',?)");
			 stmt.setString(1,model.getName());
			 return stmt.executeUpdate()>0?true:false;
			 
			 }
		 catch(Exception ex) {
					
			System.out.println("error is"+ex);
			 return false;
		 }
	 }
	 public boolean isSubjectPresent(String subName) {
		 try {
			 stmt=conn.prepareStatement("select * from subject where name=?");
			 stmt.setString(1, subName);
			 rs=stmt.executeQuery();
			 return rs.next();
			 
			 
		 }
		 catch(Exception ex)
		 {
			 return false;
		 }
	 }
	 public List<String> getAllSubjects(){
	  try {
		  
		  stmt=conn.prepareStatement("select name from subject");
		  rs=stmt.executeQuery();
		  while(rs.next()) {
			  list.add(rs.getString("name"));
		  }
		  return list.size()>0?list:null;
	  }
	  catch(Exception ex){
		  System.out.println("error is"+ex);
		  return null;
	  }
		
	 }
}
