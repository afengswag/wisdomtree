package com.wisdomtree.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 学期课程
 * 
 * @author Administrator
 *
 */
@Data
@Table(name = "lesson_tb")
public class Lesson {
	@Id
	@GeneratedValue
	private int lessonId;
	private String lessonName;
	private int chapterId;
	private int lessonType;
	@OneToOne
	@JsonIgnore
	private Major major;
	@OneToMany
	@JsonIgnore
	@JoinTable(name = "clazz_teacher_tb", joinColumns = {
			@JoinColumn(name = "clazz_teacher_tb_clazz_id") }, inverseJoinColumns = {
					@JoinColumn(name = "clazz_teacher_tb_tea_id") })

	private Set<LessonChapter> chapters = new HashSet<LessonChapter>();

	private String isopen;

	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
