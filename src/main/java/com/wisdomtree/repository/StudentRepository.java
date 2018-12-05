package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wisdomtree.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student>{
	
	Student findByStuTrueNameLike(String stuTrueName);

}
