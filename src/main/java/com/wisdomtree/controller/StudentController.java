package com.wisdomtree.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomtree.entity.Student;
import com.wisdomtree.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	private Map<String, Object> map = new HashMap<String, Object>();

	@Autowired
	StudentService stu;

	@RequestMapping("studentLogin")
	public Object studentLogin(String stuTrueName, String password) {

		String massage = "没有该学生";

		boolean flag = false;

		Student student = new Student();
		student = stu.selectStudentByName(stuTrueName);

		if (student != null) {

			if (student.getPassword().equals(password)) {

				massage = "html";
				flag = true;

			} else {

				massage = "密码错误";
				flag = false;
				
			}
		}
		map.put("success", flag);

		map.put("massage", massage);

		return map;
	}

}
