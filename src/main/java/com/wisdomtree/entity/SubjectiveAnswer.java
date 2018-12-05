package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="subjective_answer_tb")
public class SubjectiveAnswer {

	@Id
	@GeneratedValue
	private Integer subjectiveAnswerId;
	
	private String revisor;//修改人
	
	private Integer stuId;//学生编号,表示该学生回答的答案
	
	private String myAnswer;
	
	private Integer subjectiveId;
	
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
