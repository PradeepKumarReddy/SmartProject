package com.xyz.switchlogic.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.switchlogic.services.GreetingService;

@Service("greetingServiceEndpoint")
@WebService(serviceName="GreetingService")
public class GreetingServiceEndpoint {
	
	 @Autowired
	 private GreetingService greetingService;
	 
	 @WebMethod
	 public String sayHello() {
	  return greetingService.sayHello();
	 }
}
