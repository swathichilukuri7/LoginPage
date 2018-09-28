package com.mss.app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.mss.app.model.Employee;


@Configuration
public class SpringConfiguration {

	private static final Logger LOGGER=LoggerFactory.getLogger(SpringConfiguration.class);
	
	@Bean
	@Qualifier("employee")
	@Scope("singleton")
	public Employee employee() {
		
		Employee employee = new Employee();
		employee.setEmployeeName("swathi");
		employee.setEmployeeId(4210);
		employee.setCompany("mss");
		return employee;	
		             
	}	
	
	@Bean
	@Qualifier("employee1")
	@Scope("singleton")
	public Employee employee1() {
		Employee employee = new Employee();
//	 	employee.setEmployeeName("swathi");
//		employee.setEmployeeId(4210);
		employee.setCompany("mss");
		return employee;	
	}
}