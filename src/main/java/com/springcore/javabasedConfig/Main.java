package com.springcore.javabasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Topic 12
 * Replacing all xml file in Java Based Configuration
 * 
 * @author arunpanjiyar
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	 	Employee employee1 = (Employee) appContext.getBean("employee1");
	 	System.out.println(employee1);
	 	
	 	Employee employee2 = (Employee) appContext.getBean("employee2");
	 	System.out.println(employee2);
	 	
	 	Student student1 = (Student) appContext.getBean("student1");
	 	System.out.println(student1);

	}

}
