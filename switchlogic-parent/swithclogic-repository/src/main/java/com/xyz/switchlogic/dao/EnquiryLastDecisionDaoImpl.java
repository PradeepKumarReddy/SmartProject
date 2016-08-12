package com.xyz.switchlogic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xyz.switchlogic.entity.DndCalculatorCheck;

@Repository
public class EnquiryLastDecisionDaoImpl implements EnquiryLastDecisionDao {

	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public String enquiryLastDecision(String input) {

		Query query = getEntityManager().createQuery("select c from DndCalculatorCheck c");
		List<DndCalculatorCheck> resultList = query.getResultList();
		System.out.println(resultList.size());
		DndCalculatorCheck calc = resultList.get(0);

		return calc.getCalculator();
	}

}
