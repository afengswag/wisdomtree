package com.wisdomtree.entity;
/**
 * 主观题表
 * @author Administrator
 *
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="subjective_tb")
@Entity
public class Subjective implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int subjectiveId;
	private int lessonId;
	private String subjectivePoint;
	private String subjectiveType;
	private String titleDifficulty;
	private int subjectiveScore; 
	private String answer;
	private String creator;
	private String subjectiveContent;
	private Date createTime; 
	private String lastRevisor;
	private Date revisorTime;
	private String assessStatus;
	private String assessor;
	
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
