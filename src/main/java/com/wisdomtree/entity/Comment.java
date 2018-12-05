package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 评论表
 * @author Administrator
 *
 */
@Data
@Table(name="comment_tb")
public class Comment {
	@Id
	@GeneratedValue
	private int commentId;
	private String commentContent;
	@OneToOne()
	@JsonIgnore
	private Student student;
	private int parentId;
	@OneToOne()
	@JsonIgnore
	private Lesson lesson;
	private String type;
	
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
