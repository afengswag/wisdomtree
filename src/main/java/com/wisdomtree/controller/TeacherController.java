package com.wisdomtree.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomtree.entity.Teacher;
import com.wisdomtree.service.TeacherService;

@RestController
@RequestMapping("teacher")
public class TeacherController {

	private Map<String, Object> map = new HashMap<String, Object>();

	@Autowired
	TeacherService teacherService;

	@RequestMapping("teacherLogin")
	private Object teacherLogin(String teaName, String password) {

		String massage = "没有该老师";

		boolean flag = false;

		Teacher teacher = new Teacher();

		teacher = teacherService.selectStudentByName(teaName);

		if (teacher != null) {

			if (teacher.getPassword().equals(password)) {

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
