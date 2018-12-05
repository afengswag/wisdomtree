package com.wisdomtree.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 教室表
 * @author Administrator
 *
 */
@Data
@Table(name="clazzRoom_tb")
public class ClazzRoom {

	@Id
	@GeneratedValue
	private Integer clazzRoomId;
	
	private String clazzRoomName;
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "clazzRoom_clazzInfo_tb", joinColumns = {
			@JoinColumn(name = "clazzRoom_clazzInfo_tb_clazzRoom_id") }, inverseJoinColumns = {
					@JoinColumn(name = "clazzRoom_clazzInfo_tb_clazzInfo_id") })
	
	private Set<ClazzInfo> set = new HashSet<ClazzInfo>();
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
