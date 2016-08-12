package com.xyz.switchlogic.services;

import net.apmoller.services.amm.dndlegacyreference.v1.RetriveCalculatorDecisionRequest;
import net.apmoller.services.amm.dndlegacyreference.v1.RetriveCalculatorDecisionResponse;
import net.apmoller.services.amm.dndlegacyreference.v1.RetriveCalculatorDecisionResponseType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.switchlogic.dao.EnquiryLastDecisionDao;

@Service("enquiryLastDecisionService")
public class EnquiryLastDecisionService {
	@Autowired
	EnquiryLastDecisionDao decisionDao;

	public RetriveCalculatorDecisionResponse enquiryLastDecision(
			RetriveCalculatorDecisionRequest request) {
		System.out.println("RetriveCalculatorDecisionResponse called");
		String result = decisionDao.enquiryLastDecision("test");
		RetriveCalculatorDecisionResponse responce = new RetriveCalculatorDecisionResponse();
		RetriveCalculatorDecisionResponseType value = new RetriveCalculatorDecisionResponseType();
		value.setApplicationName(result);
		responce.setRetriveCalculatorDecisionResponseType(value);
		return responce;
	}
}
