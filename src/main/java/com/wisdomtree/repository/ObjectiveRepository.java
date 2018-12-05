package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wisdomtree.entity.Objective;

public interface ObjectiveRepository extends JpaRepository<Objective, Integer>,JpaSpecificationExecutor<Objective> {

}
