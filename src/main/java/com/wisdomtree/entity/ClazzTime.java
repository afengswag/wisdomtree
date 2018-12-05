package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 時間段表
 * @author Administrator
 *
 */
public class ClazzTime {
	

	@Id
	@GeneratedValue
	private Integer clazzTimeId;
	
	private  String  clazzTime;
	
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
