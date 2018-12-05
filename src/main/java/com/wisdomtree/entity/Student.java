package com.wisdomtree.entity;
/**
 * 学生表
 * @author Administrator
 *
 */

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;
@Data
@Table(name="student_tb")
@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer stuId;
	private String password;
	private String stuTrueName;
	private String stuIDcard;
	private String stuSex;
	private String stuStatus;
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
	
	private Integer headPortaitId;
	
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
