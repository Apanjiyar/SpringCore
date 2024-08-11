package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 9
 * Stereotype Annotation
 * 1. @Component Annotation - To declare a bean using annotation
 * 2. @value Annotation  - to set the value of bean using annotation
 * 3. <context:component-scan base-package="" /> use this tag in xml.
 * 
 * @author arunpanjiyar
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Teacher teacher = (Teacher) appContext.getBean("teacher", Teacher.class);
	 	System.out.println(teacher);
	 	System.out.println(teacher.getFriends());
	}

}
