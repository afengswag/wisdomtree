package com.wisdomtree.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 班级表
 * 
 * @author Administrator
 *
 */
@Data
@Table(name = "clazz_tb")
public class Clazz {

	@Id
	@GeneratedValue
	private int clazzId;
	private String clazzName;
	private String clazzDescription;
	private int clazzNum;
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "clazz_teacher_tb", joinColumns = {
			@JoinColumn(name = "clazz_teacher_tb_clazz_id") }, inverseJoinColumns = {
					@JoinColumn(name = "clazz_teacher_tb_tea_id") })
	private Set<Teacher> teachers = new HashSet<Teacher>();
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date clazzCreateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date clazzUpdateTime;
	private String creator;
	private Major major;

	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "clazz_student_tb", joinColumns = {
			@JoinColumn(name = "clazz_student_tb_clazz_id") }, inverseJoinColumns = {
					@JoinColumn(name = "clazz_student_tb_stu_id") })
	private Set<Student> set = new HashSet<Student>();

}
