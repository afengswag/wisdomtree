package com.wisdomtree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wisdomtree.entity.Objective;
import com.wisdomtree.entity.Teacher;
import com.wisdomtree.entity.TestPaper;
import com.wisdomtree.repository.ObjectiveRepository;
import com.wisdomtree.repository.SubjectiveRespository;
import com.wisdomtree.repository.TestPaperRepository;
import com.wisdomtree.service.TestPaperService;

public class TestPepaerServiceImpl implements TestPaperService{
	
	@Autowired
	TestPaperRepository testPaper;
	
	@Autowired
	ObjectiveRepository object;
	
	@Autowired
	SubjectiveRespository subje;

	@Override
	public Objective saveObjective(Objective objective) {
		// TODO Auto-generated method stub
		return object.save(objective);
	}





}
