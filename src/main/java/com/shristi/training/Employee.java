package com.shristi.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component // to inject the class to the ioC
@PropertySource("classpath:application.properties")
public class Employee {
	
	private String employeeName;
	@Value("${employee.empname}")
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}

	public String greet() {
		return "Welcome "+employeeName;
	}
}
