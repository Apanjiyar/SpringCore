package com.springcore.javabasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	//@Autowired
	//@Qualifier("address")
	private Address address;

	public Student() {
		super();
	}

	//@Autowired
	//@Qualifier("address")
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
