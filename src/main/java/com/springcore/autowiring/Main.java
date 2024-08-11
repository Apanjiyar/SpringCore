package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic 7
 * 
 * Autowiring - Automatic DI
 * 
 * Types of Autowiring
 * A) XML
 * 		1. no - by Default
 * 		2. byName - DI using name of the property - Setter Injection
 * 		3. byType - DI using Data Type of the property - Setter Injection
 * 		4. Constructor - DI using constructor - Constructor Injection
 * 		5. autodetect (Deprecated since Spring 3)
 * 
 * B) @Autowired Annotation
 * 		1. Use On Property - Setter Injection
 * 		2. Use on setter method - Setter Injection
 * 		3. Use on Constructor - Constructor Injection
 * 		4. @Qualifier Annotation - To identify particular bean
 * 
 * @author arunpanjiyar
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/autowiring/config.xml");
	 	Employee employee1 = (Employee) appContext.getBean("employee1");
	 	System.out.println(employee1);
	 	
	 	Employee employee2 = (Employee) appContext.getBean("employee2");
	 	System.out.println(employee2);
	 	
	 	Employee employee3 = (Employee) appContext.getBean("employee3");
	 	System.out.println(employee3);
	 	
	 	Student student1 = (Student) appContext.getBean("student1");
	 	System.out.println(student1);

	}

}
