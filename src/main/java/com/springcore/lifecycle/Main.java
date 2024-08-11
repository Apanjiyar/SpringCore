package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Read Notes1.txt
 * 
 * Topic 6
 * @author arunpanjiyar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa samosa = (Samosa) appContext.getBean("samosa");
		appContext.registerShutdownHook();
	 	System.out.println(samosa);
	 	
	 	Pastry pastry = (Pastry) appContext.getBean("pastry");
	 	System.out.println(pastry);
	 	
	 	Momos momos = (Momos) appContext.getBean("momos");
	 	System.out.println(momos);
	 }
}
