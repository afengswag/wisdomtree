package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="headPortait_tb")
@Entity
public class HeadPortait {
	@Id
	@GeneratedValue
	private Integer headPortaitId;
	
	private String url;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;


}
