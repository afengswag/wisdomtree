package com.wisdomtree.entity;

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
@Table
public class StudentAnswer {
	@Id
	@GeneratedValue
	private Integer answerId;
	private Integer stuId;
	private Integer examId;
	private Integer objectiveId;
	private String myChoose;
	private Integer score;
}
