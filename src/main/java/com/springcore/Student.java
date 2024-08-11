package com.springcore;

public class Student {
	
	private int id;
	private String name;
	private String address;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		//System.out.println("setId");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//System.out.println("setName");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		//System.out.println("setAddress");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
