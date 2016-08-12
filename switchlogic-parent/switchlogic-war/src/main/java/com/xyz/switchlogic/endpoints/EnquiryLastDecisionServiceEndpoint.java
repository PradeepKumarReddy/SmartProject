package com.xyz.switchlogic.endpoints;

import javax.jws.WebService;

import net.apmoller.services.amm.dndlegacyreference.v1.RetriveCalculatorDecisionRequest;
import net.apmoller.services.amm.dndlegacyreference.v1.RetriveCalculatorDecisionResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.switchlogic.services.EnquiryLastDecisionService;


@Service("enquiryLastDecisionServiceEndpoint")
@WebService(serviceName="EnquiryLastDecisionService")
public class EnquiryLastDecisionServiceEndpoint {

	@Autowired
	EnquiryLastDecisionService service;
	
	public RetriveCalculatorDecisionResponse enquiryLastDecision(RetriveCalculatorDecisionRequest request) {
		return service.enquiryLastDecision(request);
	}

	

}
