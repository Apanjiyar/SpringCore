package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 2 - Injection Collection Data
 * 1. List
 * 2. Set
 * 3. Map
 * 4. Properties
 * 
 * @author arunpanjiyar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
	 	Employee emp1 = (Employee) appContext.getBean("emp1");
	 	
	 	System.out.println(emp1.getName());
	 	System.out.println(emp1.getPhoneNumber());
	 	System.out.println(emp1.getAddress());
	 	System.out.println(emp1.getCourses());
	 	System.out.println(emp1.getCertificates());
	 }
}
