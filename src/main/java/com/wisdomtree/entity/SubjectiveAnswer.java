package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SubjectiveAnswer {

	@Id
	@GeneratedValue
	private Integer subjectiveAnswerId;
	
	private String revisor;//修改人
	
	private String myAnswer;
	
	private Integer subjectiveId;
	

}
