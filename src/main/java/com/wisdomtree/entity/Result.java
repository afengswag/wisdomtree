package com.wisdomtree.entity;

import javax.persistence.Column;
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
@Table(name="result_tb")
public class Result {
	@Id
	@GeneratedValue
	private int resultId;
	private Student student;
	private int testPaperId;
	private double result;
	/*private String Name;*/
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
