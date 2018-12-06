package com.wisdomtree.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wisdomtree.entity.Subjective;
import com.wisdomtree.entity.search.SubjectiveSearch;

public interface SubjectiveService {

	int deleteInPage(Integer subjectiveId);

	Page<Subjective> queryUserPageByCons(SubjectiveSearch subjectiveSearch, Pageable pageable);

}
