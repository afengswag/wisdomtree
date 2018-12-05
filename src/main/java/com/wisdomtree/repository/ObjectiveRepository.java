package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomtree.entity.Objective;

public interface ObjectiveRepository extends JpaRepository<Objective, Integer> {

}
