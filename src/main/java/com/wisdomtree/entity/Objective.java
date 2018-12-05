package com.wisdomtree.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="objective_tb")
@Entity
public class Objective {
	@Id
	@GeneratedValue
	private Integer objectiveId;
	private int lessonId;
	private String titleDifficulty;//难度
	private String objectiveContent;
	private int objectiveScore;
	private String answer;
	private String creator;//创建人
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date createTime;
	private String revisor;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date revisorTime;
	private String anditStatus;//审核状态
	private String anditor;
	private String subjectivePoint;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
