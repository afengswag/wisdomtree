package com.wisdomtree.entity.search;

import lombok.Data;

@Data
public class SubjectiveSearch {
	
	private int lessonId;
	private String subjectivePoint;
	private String subjectiveType;
	private String titleDifficulty;
	private int subjectiveScore; 
	private String creator;
}
