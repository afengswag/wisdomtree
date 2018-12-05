package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 学生答案表
 * @author Administrator
 *
 */
@Data
@Table(name="student_answer_tb")
public class StudentAnswer {
	@Id
	@GeneratedValue
	private Integer answerId;
	private Integer stuId;
	private Integer examId;
	private Integer objectiveId;
	private String myChoose;
	private Integer score;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
