package com.springcore.javabasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.springcore.autowiring")
public class AppConfig {
	
	@Bean("address")
    public Address address() {
        Address address = new Address();
        address.setState("Delhi");
        address.setPincode(110096);
        return address;
    }

    @Bean(name = "employee1")
    @Scope("prototype")
    public Employee employee1(Address address) {
        Employee employee = new Employee();
        employee.setAddress(address); 
        return employee;
    }

    @Bean(name = "employee2")
    @Scope("prototype")
    public Employee employee2(Address address) {
        return new Employee(address); 
    }
    
    @Bean
    public Student student1() {
        return new Student();  // autowire by annotation
    }
}
