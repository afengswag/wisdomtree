package com.wisdomtree.entity;
/**
 * 教师模块
 * @author Administrator
 *
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
@Table(name="module_tb")
public class Module {
	@Id
	@GeneratedValue
	private int moduleId;
	private String moduleName;
	private String modulePath;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date createTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
	private Date updateTime;
	private int weight;
	private int parentId;
	private String icon;
	private String top_tab;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
