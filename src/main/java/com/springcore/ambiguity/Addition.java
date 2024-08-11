package com.springcore.ambiguity;

/**
 * Ambiguity Problem with Constructor injection
 * 1. By Default, Spring container calls String arg constructor.
 * 2. If String arg constructor is not present then it will call from top to bottom.
 * 
 * How to Resolve Ambiguity Problem?
 * 1. we can define data type of arg using type attribute.
 * 2. We can give index number to the arg.
 * 
 * @author arunpanjiyar
 *
 */
public class Addition {
	
	private int a;
	private int b;
	
	public Addition() {
		super();
	}

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("int int");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double double");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("string string");
	}
	
	public void doSum() {
		System.out.println("Sum : " + (this.a + this.b));
	}

}
