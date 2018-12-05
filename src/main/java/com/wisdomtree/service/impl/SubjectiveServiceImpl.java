package com.wisdomtree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomtree.repository.SubjectiveRespository;
import com.wisdomtree.service.SubjectiveService;
@Service
public class SubjectiveServiceImpl implements SubjectiveService{
	@Autowired
	private SubjectiveRespository subjectiveRespository;
	@Override
	public int deleteInPage(Integer subjectiveId) {
		// TODO Auto-generated method stub
		return subjectiveRespository.deleteInPage(subjectiveId);
	}

}
