package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 年级表
 * @author Administrator
 *
 */
@Data
@Table
public class Grade {
	@Id
	@GeneratedValue
	private Integer gradeId;
	private String gradeName;
	/*@OneToOne
	@JsonIgnore*/
	private Major major;
}
