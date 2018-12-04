package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 部门表
 * @author Administrator
 *
 */
@Data
@Table(name="department_tb")
public class Department {
	@Id
	@GeneratedValue
	private int depId;
	private String depName;
	/*private int collegeId;*/
}
