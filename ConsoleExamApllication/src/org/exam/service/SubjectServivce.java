package org.exam.service;

import java.util.List;
import java.util.*;
import org.exam.model.SubjectModel;
import org.exam.repository.SubjectRepository;

public class SubjectServivce {
	SubjectRepository subRepo= new SubjectRepository();
	public int addSubject(SubjectModel model) {
		
		return (subRepo.isSubjectPresent(model.getName()))?-1:subRepo.isAddSubject(model)?1:0;
	}
	public List<String>getAllSubjects(){
		return  this.subRepo.getAllSubjects();
		
	}

	}

