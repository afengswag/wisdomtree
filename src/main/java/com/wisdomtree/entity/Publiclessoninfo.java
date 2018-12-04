package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 公开课详细的表字段详细
 * 
 * @author Administrator
 *
 */
@Data
@Table
public class Publiclessoninfo {
	@Id
	@GeneratedValue
	private int publicLessonId;
	private int publicLessonInfo;
	private String PublicLessonInfoContextLink;
	private String publicLessonInfoDifficulty;
	private String publicLessonInfoName;
	private int teacherId;
	private int gradeId;

}
