package com.wisdomtree.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomtree.entity.Subjective;
import com.wisdomtree.entity.search.SubjectiveSearch;
import com.wisdomtree.repository.SubjectiveRepository;
import com.wisdomtree.service.SubjectiveService;
@RestController
@RequestMapping("subjective")
public class SubjectiveController {
	
	@Autowired
	private SubjectiveService subjectiveService;
	@Autowired
	private SubjectiveRepository subjectiveRepository;
	private Map<String, Object> map = new HashMap<String, Object>();
	/**
	 * http://localhost:8080/subjective/addSubjective?subjectiveContent=请读题&subjectivePoint=java
	 * @param subjective
	 * @return
	 */
	@RequestMapping("addSubjective")
	public Map<String, Object> addSubjective(Subjective subjective){
		
		Subjective k = subjectiveRepository.save(subjective);
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
		
		Subjective subjective = subjectiveRepository.findOne(subjectiveId);
		subjective.setIsDel(0);
		Subjective k = subjectiveRepository.save(subjective);
		if (k!=null&&!k.equals(" ")) {
			map.put("success", true);
			map.put("message", "删除成功!");
		}
		return map;
	}
	/**
	 * http://localhost:8080/subjective/updateSubjective?subjectiveContent=请读题1&subjectivePoint=java1&subjectiveId=6
	 * @param subjective
	 * @return
	 */
	@RequestMapping("updateSubjective")
	public Map<String, Object> updateSubjective(Subjective subjective){
		
		Subjective k = subjectiveRepository.save(subjective);
		System.out.println(k);
		if (k!=null&&!k.equals(" ")) {
			map.put("success", true);
			map.put("message", "添加成功!");
		}
		return map;
	}
	/**
	 * http://localhost:8080/subjective/QuerySubjective?subjectivePoint=java
	 * @param subjectiveSearch
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("QuerySubjective")
	public Map<String, Object> QuerySubjective(SubjectiveSearch subjectiveSearch,int page,int rows){
		
		Pageable pageable = new PageRequest(page-1, rows);
		Page<Subjective> subjectives = subjectiveService.queryUserPageByCons(subjectiveSearch,pageable);
		map.put("total", subjectives.getTotalElements());
		map.put("rows", subjectives.getContent());
		return map;
		
	}

}
