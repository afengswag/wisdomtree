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
 * 学期表
 * @author Administrator
 *
 */
@Data
@Table(name="term_tb")
public class Term {
	@Id
	@GeneratedValue
	private int termId;
	private String termName;
	@OneToMany
	@JsonIgnore
	@JoinTable(name = "term_lesson_tb", joinColumns = {
			@JoinColumn(name = "term_lesson_tb_term_id") }, inverseJoinColumns = {
					@JoinColumn(name = "term_lesson_tb_lesson_id") })
	private Set<Lesson> lessons = new HashSet<Lesson>();
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
