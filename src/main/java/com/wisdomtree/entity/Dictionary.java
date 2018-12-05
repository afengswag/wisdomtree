package com.wisdomtree.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "dictionary_tb")
public class Dictionary {

	@Id
	@GeneratedValue
	private Integer dictionaryId;

	private String status;

	private String type;
	
	/**
	 * chaptersDifficulty:掌握-困难，了解-普通、会用-普通、理解-较难、了解-容易、掌握-较易
	 * 
	 * titleDifficulty：困难、较难、普通、简易
	 * 
	 * stuStatus：退学、请假、休学、所有、报道、正常、毕业
	 * 
	 * testPaperStatus：正常、组卷中、停用
	 * 
	 */
	@Column(insertable=false,columnDefinition="int default 1")
	private int isDel;


}
