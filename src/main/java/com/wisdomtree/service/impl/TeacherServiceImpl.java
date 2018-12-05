package com.wisdomtree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wisdomtree.entity.Teacher;
import com.wisdomtree.repository.TeacherRepository;
import com.wisdomtree.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository tea;

	@Override
	public Teacher selectStudentByName(String teaName) {
		// TODO Auto-generated method stub
		return tea.findByTeaNameLike(teaName);
	}

}
