package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wisdomtree.entity.Clazz;

public interface ClazzRepository extends JpaRepository<Clazz, Integer>,JpaSpecificationExecutor<Clazz>{

	
}
