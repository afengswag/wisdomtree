package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 公开课表字段
 * @author Administrator
 *
 */
@Data
@Table(name="public_lesson_tb")
public class PublicLesson {
	@Id
	@GeneratedValue
	private int publicLessonId;
	private String publicLessonName;
	private int teacherId;

}
