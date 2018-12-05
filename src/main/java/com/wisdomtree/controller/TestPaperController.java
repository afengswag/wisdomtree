package com.wisdomtree.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomtree.entity.Objective;
import com.wisdomtree.service.TestPaperService;

@RestController
@RequestMapping("testPaper")
public class TestPaperController {

	private Map<String, Object> map = new HashMap<String, Object>();
	@Autowired
	TestPaperService tps;
	
	@RequestMapping("saveObjective")
	private Object saveObjective(Objective objective) {
		
		String massage ;
		if(objective.getObjectiveId()==null) {
			
			massage = "添加";
		}
		else {
			massage = "修改";
			
		}
		Objective objective2 = new Objective();
		
		objective2 = tps.saveObjective(objective);
		
		if(objective2!=null) {
			
			map.put("success", true);
			map.put("massage",massage+"成功");
		}
		else {

		    map.put("success", false);
		    map.put("massage", massage+"失败");
		}
		return map;
	}
	
}
