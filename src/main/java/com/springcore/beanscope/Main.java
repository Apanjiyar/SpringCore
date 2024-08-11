package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 10
 * 
 * Bean Scope - To define the scope of a bean
 * 1. Singleton (@Scope("singleton")) - By default
 * 2. Prototype (@Scope("prototype"))
 * 3. Request (@Scope("request"))
 * 4. Session (@Scope("session"))
 * 5. Global Session (@Scope("globalSession"))
 * 
 * Note BeanScopeXml.txt (For xml based configuration)
 * 
 * @author arunpanjiyar
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/beanscope/config.xml");
		Teacher teacher = (Teacher) appContext.getBean("teacher", Teacher.class);
	 	System.out.println(teacher);
	 	System.out.println(teacher.getFriends());
	 	
	 	Student student = appContext.getBean("student", Student.class);
	 	System.out.println(student);
	}

}
