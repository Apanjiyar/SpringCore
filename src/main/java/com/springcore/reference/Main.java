package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 3 - Injection of other class object
 * 
 * @author arunpanjiyar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/reference/config.xml");
	 	A objA1 = (A) appContext.getBean("objA1");
	 	System.out.println(objA1);
	 	
	 	A objA2 = (A) appContext.getBean("objA2");
	 	System.out.println(objA2);
	 }
}
