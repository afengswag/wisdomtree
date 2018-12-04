package com.wisdomtree.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * 客观题表
 * @author Administrator
 *
 */
@Data
@Table
public class Objective {
	@Id
	@GeneratedValue
	private int objectiveId;
	private int lessonId;
	private String titleDifficulty;
	private String objectiveContent;
	private int objectiveScore;
	private String answer;
	private String creator;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date createTime;
	private String revisor;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date revisorTime;
	private String anditStatus;
	private String anditor;
	private String subjectivePoint;
}
