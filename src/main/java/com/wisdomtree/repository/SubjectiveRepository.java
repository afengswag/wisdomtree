package com.wisdomtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.wisdomtree.entity.Subjective;

public interface SubjectiveRepository extends JpaRepository<Subjective, Integer>,JpaSpecificationExecutor<Subjective>{

	@Query(value="UPDATE wisdomtreedb.subjective_tb SET is_del = 0 WHERE subjective_id =?1 ;",nativeQuery=true)
	int deleteInPage(Integer subjectiveId);

}
