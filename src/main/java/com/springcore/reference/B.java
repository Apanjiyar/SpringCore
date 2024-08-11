package com.springcore.reference;

public class B {
	
	private int b;

	public B() {
		super();
	}

	public B(int b) {
		super();
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "B [b=" + b + "]";
	}
}
