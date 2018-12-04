package com.wisdomtree.entity;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 院系表
 * @author Administrator
 *
 */
@Data
@Table(name="college_tb")
public class College {
	@Id
	@GeneratedValue
	private int collegeId;
	private String collegeName;
	private int parentId;	
	@OneToMany()
	@JsonIgnore
	@JoinTable(name = "college_department_tb", joinColumns = {
			@JoinColumn(name = "college_department_tb_college_id") }, inverseJoinColumns = {
					@JoinColumn(name = "college_department_tb_dep_id") })
	private Set<Department> departments = new HashSet<Department>();
	
	@OneToMany()
	@JsonIgnore
	@JoinTable(name = "college_major_tb", joinColumns = {
			@JoinColumn(name = "college_major_tb_college_id") }, inverseJoinColumns = {
					@JoinColumn(name = "college_major_tb_major_id") })
	private Set<Major> majors = new HashSet<Major>();
	
}
