package org.exam.service;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.exam.helper.PathHelper;
import org.exam.model.QuestionModel;
import org.exam.repository.QuestionRepository;

public class QuestionService {

	QuestionRepository qRepo = new QuestionRepository();
	SubjectServivce ss = new SubjectServivce();

	public boolean isAddQuestion(QuestionModel qModel, String subName) {
		return qRepo.isAddQuestion(qModel, subName);
	}

	public boolean createFiles() {
		try {
			String path = "C:\\Users\\rutuj\\OneDrive\\Desktop\\seminar\\questionbank";
			File f = new File(path);
			if (!f.exists()) {
				f.mkdir();

			}
			List<String> subList = ss.getAllSubjects();
			if (subList != null) {
				for (String subName : subList) {

					f = new File(path + "\\" + subName + ".csv");
					if (!f.exists()) {
						f.createNewFile();
					}

				}
			} else {
				System.out.println("subject not found");
			}
		} catch (Exception ex) {

			System.out.println("error is" + ex);
		}
		return true;
	}

	public boolean uploadBulkQuestion(String subName) {
		boolean b = this.createFiles();
		if (b) {
			File f = new File("C:\\Users\\rutuj\\OneDrive\\Desktop\\seminar\\questionbank");
			File[] fileList = f.listFiles();
			boolean flag = false;
			for (File file : fileList) {
				if (file.isFile()) {
					int index = file.toString().indexOf(subName);
					if (index != -1) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				try {
					FileReader fr = new FileReader(PathHelper.filePath+"\\"+subName+".csv");
					BufferedReader br =new BufferedReader(fr);
					String question;
				     flag =false;
					try {
						while((question =br.readLine())!=null) {
							String qwithop[]=question.split(",");
							flag=qRepo.upLoadBulkQuestion(qwithop,subName);
						}
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
			} else {
				System.out.println("subject file not found");
			}
			return true;

		} else {
			return false;
		}

	}
}
