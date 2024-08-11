package com.springcore.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 8
 * Stand-alone Collection - To define a collection in xml at global level and use
 * that collection at multiple place. 
 * 
 * @author arunpanjiyar
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/standaloneCollection/config.xml");
		Person p1 = (Person) appContext.getBean("p1");
	 	System.out.println(p1.getFriends());
	 	System.out.println(p1.getFriends().getClass().getName());
	 	System.out.println(p1.getSkills());
	 	System.out.println(p1.getSkills().getClass().getName());
	 	System.out.println(p1.getCourses());
	 	System.out.println(p1.getCourses().getClass().getName());
	 	System.out.println(p1.getEduInfo());
	 	System.out.println(p1.getEduInfo().getClass().getName());
	}

}
