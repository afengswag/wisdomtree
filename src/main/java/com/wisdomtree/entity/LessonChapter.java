package com.wisdomtree.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 章节
 * @author Administrator
 *
 */

@Data
@Table
public class LessonChapter {
	@Id
	@GeneratedValue
	private int chaptersId;
	private String chapterName;
	private String chaptersURL;
	
	private String chaptersDifficulty;
	private String creator;
}
