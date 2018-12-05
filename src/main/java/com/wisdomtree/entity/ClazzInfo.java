package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 课表详细
 * @author Administrator
 *
 */

@Data
@Table(name="clazzInfo_tb")
public class ClazzInfo {

	@Id
	@GeneratedValue
	private Integer clazzInfoId;
	
	private String address;
	
	private String clazz;
	
	private String teacherName;
	
	private Integer clazzTimeId;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;


}
