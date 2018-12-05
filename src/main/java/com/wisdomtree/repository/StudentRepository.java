package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomtree.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	Student findByStuTrueNameLike(String stuTrueName);

}
