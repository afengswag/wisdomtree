package com.wisdomtree.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomtree.entity.Subjective;
import com.wisdomtree.repository.SubjectiveRespository;
import com.wisdomtree.service.SubjectiveService;
@RestController
@RequestMapping("subjective")
public class SubjectiveController {
	
	@Autowired
	private SubjectiveService subjectiveService;
	@Autowired
	private SubjectiveRespository subjectiveRespository;
	private Map<String, Object> map = new HashMap<String, Object>();
	/**
	 * http://localhost:8080/subjective/addSubjective?subjective_content=请读题&subjective_point=java&lesson_id=
	 * @param subjective
	 * @return
	 */
	@RequestMapping("addSubjective")
	public Map<String, Object> addSubjective(Subjective subjective){
		
		Subjective k = subjectiveRespository.save(subjective);
		System.out.println(k);
		if (k!=null&&!k.equals(" ")) {
			map.put("success", true);
			map.put("message", "添加成功!");
		}
		return map;
	}
	/**
	 * http://localhost:8080/subjective/deleteSubjective?subjectiveId=1
	 * @param subjectiveId
	 * @return
	 */
	@RequestMapping("deleteSubjective")
	public Map<String, Object> deleteSubjective(Integer subjectiveId){
		
		Subjective subjective = subjectiveRespository.findOne(subjectiveId);
		subjective.setIsDel(0);
		Subjective k = subjectiveRespository.save(subjective);
		if (k!=null&&!k.equals(" ")) {
			map.put("success", true);
			map.put("message", "删除成功!");
		}
		return map;
	}

}
