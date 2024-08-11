package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> phoneNumber;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties certificates;
	
	public Employee() {
		super();
	}

	public Employee(String name, List<String> phoneNumber, Set<String> address, Map<String, String> courses, Properties certificates) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.courses = courses;
		this.certificates = certificates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getCertificates() {
		return certificates;
	}

	public void setCertificates(Properties certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", courses="
				+ courses + ", certificates=" + certificates + "]";
	}
}
