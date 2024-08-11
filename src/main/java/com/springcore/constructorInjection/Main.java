package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 4
 * @author arunpanjiyar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/config.xml");
		Person p1 = (Person) appContext.getBean("p1");
	 	System.out.println(p1);
	 }
}
