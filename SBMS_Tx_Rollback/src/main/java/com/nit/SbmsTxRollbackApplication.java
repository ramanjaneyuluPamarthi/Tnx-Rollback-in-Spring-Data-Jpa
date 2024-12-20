package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.EmployeeService;

@SpringBootApplication
public class SbmsTxRollbackApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbmsTxRollbackApplication.class, args);
		EmployeeService bean = run.getBean(EmployeeService.class);
		bean.saveData();
		System.out.println("Data is Saved...");
		
		
	
		
	}

}
