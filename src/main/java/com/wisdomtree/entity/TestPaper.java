package com.wisdomtree.entity;
/**
 * 试卷表
 * @author Administrator
 *
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="test_paper_tb")
public class TestPaper {
	@Id
	@GeneratedValue
	private int testPaperId;
	private String testPaperTitle;
	private int testTime;
	private String keyword;
	private String titleDifficulty;
	private String remark;
	private int lessonId;
	private String isPublic;
	private String testPaperStatus;
	private int subjectiveNums;
	private int objectiveNums;
	private double allScore;
	private int allPeople;
	private String creator;
	private Date createTime;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
