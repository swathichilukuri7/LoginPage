package com.mss.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.mss.app.model.Employee;

@Lazy
@Service("firstService")
public class FirstService {

	private static final Logger LOGGER=LoggerFactory.getLogger(FirstService.class);
	@Autowired
	@Qualifier("employee")
	private Employee abc;
	
	@Autowired
	@Qualifier("employee1")
	private Employee xyz;
	
	public FirstService(){
		LOGGER.info("first level constructor in first service");
	}
	
	public void sampleService() {
		LOGGER.info("employee object details: ----------------"+abc +"I am in service method");
		LOGGER.info(abc.getEmployeeName());
		LOGGER.info(abc.getCompany());
		LOGGER.info(""+abc.getEmployeeId());
		LOGGER.info("employee1 object details: ---------------- "+xyz +"I am in service method");
		LOGGER.info(xyz.getEmployeeName());
		LOGGER.info(xyz.getCompany());
		LOGGER.info(""+xyz.getEmployeeId());
	}
}
