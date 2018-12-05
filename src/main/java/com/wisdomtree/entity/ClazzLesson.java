package com.wisdomtree.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 课表
 * @author Administrator
 *
 */
@Data
@Table(name="clazzLesson_tb")
public class ClazzLesson {
	
	private Integer clazzLessonId;
	
	private Date clazzTime;//日期
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "clazzLesson_clazzRoom_tb", joinColumns = {
			@JoinColumn(name = "clazzLesson_clazzRoom_tb_clazzLesson——id") }, inverseJoinColumns = {
					@JoinColumn(name = "clazzLesson_clazzRoom_tb_clazzRoom_id") })
	
	private Set<ClazzRoom> set = new HashSet<ClazzRoom>();
	
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

	
	
}
