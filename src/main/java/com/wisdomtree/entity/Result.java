package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 成绩表
 * @author Administrator
 *
 */
@Data
@Table
public class Result {
	@Id
	@GeneratedValue
	private int resultId;
	private Student student;
	private int testPaperId;
	private double result;
	/*private String Name;*/
}
