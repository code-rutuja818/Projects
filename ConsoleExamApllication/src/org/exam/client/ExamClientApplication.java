package org.exam.client;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import org.exam.model.ExamModel;
import org.exam.model.QuestionModel;
import org.exam.model.ScheduleModel;
import org.exam.model.SubjectModel;
import org.exam.service.ExamService;
import org.exam.service.QuestionService;
import org.exam.service.SubjectServivce;

public class ExamClientApplication {

	public static void main(String[] args) {
		SubjectServivce sv= new SubjectServivce();
		QuestionService qService=new QuestionService();
		ExamService examService =new ExamService();
		do {
			System.out.println("1.Add new Subject");
			System.out.println("2.Add single question");
			System.out.println("3.Add bulk question");
			System.out.println("4.add exam");
			System.out.println("5.create Exam Schedule");
			
			System.out.println("enter your choice");
			Scanner xyz= new Scanner(System.in);
			int choice = xyz .nextInt();
			switch(choice) {
			case 1:
				xyz.nextLine();
				System.out.println("enter subject name");
				String subName = xyz.nextLine();
				SubjectModel model=new SubjectModel();
				model.setName(subName);
				int result =sv.addSubject(model);
				if(result==1) {
					System.out.println("subject added success......");
				}
				else if(result==-1) {
					System.out.println("subject already present......");
				}
				else {
					System.out.println("some probelm is there");
				}
				break;
				
			case 2:
				xyz.nextLine();
				System.out.println("Enter Question");
				String question =xyz.nextLine();
				System.out.println("enter option 1");
				String op1=xyz.nextLine();
				System.out.println("enter option 2");
				String op2=xyz.nextLine();
				System.out.println("enter option 3");
				String op3=xyz.nextLine();
				System.out.println("enter option 4");
				String op4=xyz.nextLine();
				System.out.println("enter option as answer..");
				int ans=xyz.nextInt();
				xyz.nextLine();
				System.out.println("enter subject name");
				subName=xyz.nextLine();
				QuestionModel qModel=new QuestionModel(question,op1,op2,op3,op4,ans);
				boolean b=qService.isAddQuestion(qModel, subName);
				if(b) {
					System.out.println("question added successfully...");
				}
				else {
					System.out.println("some problem is there...");
				}
			     break;
			case 3:
				xyz.nextLine();
				System.out.println("enter subject name for store bulk question");
				String subname=xyz.nextLine();
				qService.uploadBulkQuestion(subname);
				break;
				
			case 4:
				xyz.nextLine();
				System.out.println("Enter exam name total marks and passing marks");
				String examName =xyz.nextLine();
				int totalMarks=xyz.nextInt();
				int passingMarks=xyz.nextInt();
                ExamModel examModel=new ExamModel(examName,totalMarks,passingMarks);
                result= examService.isAddExam(examModel);
                if(result==1) {
                	System.out.println("exam added Sucessfully...");
                }
                
                else if(result==-1) {
                	System.out.println("exam already present...");
                }
                else {
                	System.out.println("some problem is there...");
                }
                
				break;
				
			case 5:
				xyz.nextLine();
				List<ExamModel> list =examService.getAllExams();
				System.out.println("hey user you have list of exam and select one for schedule");
				System.out.println("===================================================");
				for(ExamModel m:list) {
					System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getTotalMarks()+"\t"+m.getPassingMarks());
				}
				System.out.println("===================================================");
				System.out.println("enter exam name for schedule");
				 examName =xyz.nextLine();
				 ExamModel emodel=examService.getExamIdByName(examName);
				if(emodel!=null)  {
					System.out.println("Enter exam date starttime and endtime");
					  System.out.println("enter year month and date");
					  String dateFormat =xyz.nextLine();
					  Date d1= new Date(dateFormat);
					  String startTime= xyz.nextLine();
					  String endTime= xyz.nextLine();
					  ScheduleModel smodel = new ScheduleModel();
					  smodel.setExamDate(d1);
                      smodel.setStartTime(startTime);
                      smodel.setEndTime(endTime);
                      smodel.setExamid(emodel.getId());
                      emodel.setScheduleModel(smodel);
                      System.out.println("Enter subject name for exam....");
                       subName=xyz.nextLine();
                       b= examService.isSetSchedule(emodel,subName);
                       if(b) {
                    	   System.out.println("Exam schedule successfully......");
                       }
                       else {
                    	   System.out.println("Exam not schedule........");
                       }
				}
		     	else {
					System.out.println("Enter Correct exam");
				}
				 break;
				 
				default:
					System.out.println("wrong choice");
			}
			
		}
		while(true);

	}

}

