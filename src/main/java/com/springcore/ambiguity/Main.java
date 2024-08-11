package com.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 5
 * @author arunpanjiyar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/ambiguity/config.xml");
	 	Addition add = (Addition) appContext.getBean("add");
	
	 	add.doSum();
	 }
}
