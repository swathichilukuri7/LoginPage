package com.mss.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SampleSpringBootApplication {
	
	public static void main(String [] args) {
		
		SpringApplication.run(SampleSpringBootApplication.class, args);
		
	}

}
