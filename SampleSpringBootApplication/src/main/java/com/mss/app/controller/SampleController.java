package com.mss.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mss.app.model.Employee;
import com.mss.app.service.FirstService;

@Lazy
@Controller
@RequestMapping(value="/firstcontroller")
@ResponseBody
public class SampleController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(SampleController.class);
	
	@Autowired
	@Qualifier("employee")
	private Employee abc;
	@Autowired
	private FirstService firstService;
	
	@Autowired
	@Qualifier("employee1")
	private Employee xyz;
	public SampleController(){
		LOGGER.info("first level constructor in controller");
	}
	
	@RequestMapping(value="/firstmethod",method=RequestMethod.GET)
	public String getEmployee() {
		LOGGER.info("employee object details: --------------"+abc +"I am in controller method");
		LOGGER.info(abc.getEmployeeName());
		LOGGER.info(abc.getCompany());
		LOGGER.info(""+abc.getEmployeeId());
		LOGGER.info("employee1 object details: --------------- "+xyz +"I am in controller method");
		LOGGER.info(xyz.getEmployeeName());
		LOGGER.info(xyz.getCompany());
		LOGGER.info(""+xyz.getEmployeeId());
		firstService.sampleService();
		return "First";
		
	}

}
