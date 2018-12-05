package com.wisdomtree.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 视频表
 * @author Administrator
 *
 */
@Data
@Table(name="rideo_tb")
public class Rideo {
	@Id
	@GeneratedValue
	private Integer rideoId;
	
	private String rideoUrl;
	
	private String rideoType;
	
	private String saveRideoPeo;//上传人
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;

}
