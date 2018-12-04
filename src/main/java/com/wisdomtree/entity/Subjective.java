package com.wisdomtree.entity;
/**
 * 主观题表
 * @author Administrator
 *
 */

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table
public class Subjective {
	@Id
	@GeneratedValue
	private int subjectiveId;
	private int lessonId;
	private String subjectiveType;
	private String titleDifficulty;
	private String subjectiveContent;
	private int subjectiveScore; 
	private String answer;
	private String creator;
	private Date createTime; 
	private String lastRevisor;
	private Date revisorTime;
	private String assessStatus;
	private String assessor;
	private String subjectivePoint;
}
