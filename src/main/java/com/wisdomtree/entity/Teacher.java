package com.wisdomtree.entity;
/**
 * 教师表
 * @author Administrator
 *
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="teacher_tb")
@Entity
public class Teacher {
	@Id
	@GeneratedValue
	private int teaId;
	private String teaName;
	private String password;
	private String teaSex;
	private String teaTel;
	private String teaQq;
	private String teaIDcard;
	private Date teaBirthday;
	private String teaEmail;
	private int dapartmentId;
	private Date lastudentpdateTime;
	private String lastudentpdateName;
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
