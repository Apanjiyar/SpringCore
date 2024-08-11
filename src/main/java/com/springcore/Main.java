package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 1
 * @author arunpanjiyar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/config.xml");
	 	Student student1 = (Student) appContext.getBean("student1");
	 	System.out.println(student1);
	 	
	 	Student student2 = (Student) appContext.getBean("student2");
	 	System.out.println(student2);
	 	
	 	Student student3 = (Student) appContext.getBean("student3");
	 	System.out.println(student3);
	}
}
