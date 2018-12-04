package com.wisdomtree.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 专业表
 * @author Administrator
 *
 */
@Data
@Table(name="major_tb")
public class Major {
	@Id
	@GeneratedValue
	private int majorId;
	private String majorName;
	/*private int collegeId;*/
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "major_clazz_tb", joinColumns = {
			@JoinColumn(name = "major_clazz_tb_major_id") }, inverseJoinColumns = {
					@JoinColumn(name = "major_clazz_tb_clazz_id") })
	private Set<Clazz> set = new HashSet<Clazz>();
}
