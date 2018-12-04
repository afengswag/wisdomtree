package com.wisdomtree.entity;
/**
 * 考试表
 * @author Administrator
 *
 */

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Table(name="exam_tb")
public class Exam {
	@Id
	@GeneratedValue
	private int examId;
	private String examTitle;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date startExamTime;
	private String invigilator;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date answerTime;
	private String house;
	private String examDescription;
	@OneToMany
	@JsonIgnore
	@JoinTable(name = "exam_clazz_tb", joinColumns = {
			@JoinColumn(name = "exam_clazz_tb_exam_id") }, inverseJoinColumns = {
					@JoinColumn(name = "exam_clazz_tb_clazz_id") })
	private Set<Clazz> clazzs = new HashSet<Clazz>();
	@OneToOne
	@JsonIgnore
	private TestPaper paper;
}
