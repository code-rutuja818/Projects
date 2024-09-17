package org.exam.service;

import java.util.List;
import org.exam.model.ExamModel;
import org.exam.model.ScheduleModel;
import org.exam.repository.ExamRepository;
import java.util.*
;public class ExamService {

	ExamRepository examRepo = new ExamRepository();
	public int isAddExam(ExamModel model) {
		
		return  (examRepo.isExamPresent(model.getName()))?-1:(examRepo.isAddExam(model))?1:0;	
		
	}
	public List<ExamModel> getAllExams() {
		return examRepo.getAllExams();
	}
	
	public ExamModel getExamIdByName(String name) {
		return examRepo.getExamIdByName(name);
	}
	public boolean isSetSchedule(ExamModel model,String subName) {
		
		Date d=new Date();
	    String []s=d.toLocaleString().split(",");
	   String dsplit[]=s[0].split("-");
	   ScheduleModel smodel=model.getScheduleModel();
	   Date userDate=smodel.getExamDate();
	   String userDateArr[]=userDate.toLocaleString().split(",");
	   String userDates[]=userDateArr[0].split("-");
	   if(Integer.parseInt(userDates[2])>=Integer.parseInt(dsplit[2]) && userDates[1].equals(dsplit[1])) {
	   if(Integer.parseInt(userDates[0])>=Integer.parseInt(dsplit[0])) {
			  System.out.println("you can schedule exam...");
			  return examRepo.isSetSchedule(model,subName)?true:false;
	   }
	   else {
		   System.out.println("you may inert date before exam...");
	   }
	   }
	   else {
		   System.out.println("you may insert previous year or may be previous month");
	   }
	    
	   return false;
}
}

