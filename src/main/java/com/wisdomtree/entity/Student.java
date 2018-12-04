package com.wisdomtree.entity;
/**
 * 学生表
 * @author Administrator
 *
 */

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="student_tb")
public class Student {
	@Id
	@GeneratedValue
	private Integer stuId;
	private String password;
	private String stuTrueName;
	private String stuIDcard;
	private String stuSex;
	private String stuStatusId;
	private String stuAddress;
	private String stuTel;
	private String stuQq;
	private Date stuBirthday;
	private String stuEmail;
	private String stuMarried;
	private String politicalStatus;
	private String educationalSystem;
	private Date stuYears;
	private String stuParentTel;
	private Date lastUpdateTime;
	private Integer teacherId;
	/*private Set<Teacher> set = new HashSet<Teacher>();*/
	private String lastUpdateName;
}
