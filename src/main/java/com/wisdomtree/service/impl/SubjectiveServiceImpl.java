package com.wisdomtree.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.wisdomtree.entity.Subjective;
import com.wisdomtree.entity.search.SubjectiveSearch;
import com.wisdomtree.repository.SubjectiveRespository;
import com.wisdomtree.service.SubjectiveService;
@Service
public class SubjectiveServiceImpl implements SubjectiveService{
	@Autowired
	private SubjectiveRespository subjectiveRespository;
	@Override
	public int deleteInPage(Integer subjectiveId) {
		// TODO Auto-generated method stub
		return subjectiveRespository.deleteInPage(subjectiveId);
	}
	@Override
	public Page<Subjective> queryUserPageByCons(SubjectiveSearch catSearch, Pageable pageable) {
		// TODO Auto-generated method stub
		return subjectiveRespository.findAll(this.getWhereClause(catSearch),pageable);
	}
	private Specification<Subjective> getWhereClause(final SubjectiveSearch catSearch) {
		return new Specification<Subjective>() {
			@Override
			public Predicate toPredicate(Root<Subjective> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Predicate predicate = cb.conjunction();// 动态SQL表达式
				List<Expression<Boolean>> exList = predicate.getExpressions();// 动态SQL表达式集合
				if (catSearch.getCreator() != null && !"".equals(catSearch.getCreator())) {
					exList.add(cb.like(root.<String>get("creator"), "%" + catSearch.getCreator() + "%"));
				}
				if (catSearch.getSubjectivePoint() != null && !"".equals(catSearch.getSubjectivePoint())) {
					exList.add(cb.like(root.<String>get("subjectivePoint"), "%" + catSearch.getSubjectivePoint() + "%"));
				}
				
				if (catSearch.getSubjectiveType() != null && !"".equals(catSearch.getSubjectiveType())) {
					exList.add(cb.equal(root.get("subjectiveType").as(String.class), catSearch.getSubjectiveType()));
				}
				if (catSearch.getSubjectiveScore() >0 ) {
					exList.add(cb.equal(root.get("subjectiveScore").as(Integer.class), catSearch.getSubjectiveScore()));
				}
				
//				if (catSearch.getStartCreateTime() != null) {
//					exList.add(
//							cb.greaterThanOrEqualTo(root.get("createTime").as(Date.class), catSearch.getStartCreateTime()));// 大于等于起始日期
//				}
//				if (catSearch.getLastCreateTime() != null) {
//					exList.add(cb.lessThanOrEqualTo(root.get("createTime").as(Date.class),
//							catSearch.getLastCreateTime()));// 小于等于截止日期
//				}
				return predicate;
			}
		};
	}

}
