package com.wisdomtree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wisdomtree.entity.Student;
import com.wisdomtree.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentService stu;

	@Override
	public Student selectStudentByName(String stuTrueName) {
		// TODO Auto-generated method stub
		return stu.selectStudentByName(stuTrueName);
	}

}
