package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="headPortait_tb")
public class HeadPortait {
	
	private Integer headPortaitId;
	
	private String url;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;


}
