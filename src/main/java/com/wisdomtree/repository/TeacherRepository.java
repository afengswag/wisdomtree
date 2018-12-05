package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomtree.entity.Student;
import com.wisdomtree.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
	Teacher findByTeaNameLike(String teaName);

}
