package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 公开课具体课程评论字段详细
 * @author Administrator
 *
 */
@Data
@Table
public class PublicComment {
	@Id
	@GeneratedValue
	private String CommentId;
	private String ChapterContext;
	private int lessonId;
	private int studentId;
	private int type;
}
