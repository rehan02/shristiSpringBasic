package com.shristi.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
//		Employee employee=new Employee();
//		employee.setEmployeeName("Priya");
//		String msg=employee.greet();
//		System.out.println(msg);
		
		//create the IoC container 
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi");
			String[] beannames=context.getBeanDefinitionNames();
			for( String bean:beannames) {
				System.out.println(bean);
			}
		
		//spring bean is singleton in nature	
		Employee employee =(Employee) context.getBean("employee");
		String msg=employee.greet();
		
		employee= context.getBean(Employee.class);
		msg=employee.greet();
		System.out.println(msg);
		
		context.getBean("employee",Employee.class);
		msg=employee.greet();
		System.out.println(msg);
	}
}
