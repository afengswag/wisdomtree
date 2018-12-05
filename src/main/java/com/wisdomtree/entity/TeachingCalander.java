package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 教学日历表
 * @author Administrator
 *
 */
@Data
@Table(name="teaching_calander_tb")
public class TeachingCalander {
	@Id
	@GeneratedValue
	private int termId;
	private String majorId;
	private String URL;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
