package com.wisdomtree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomtree.repository.ClazzRepository;
import com.wisdomtree.service.ClazzService;
@Service
public class ClazzServiceImpl implements ClazzService{

	
	@Autowired
	private ClazzRepository clazzrepository;
}
