package com.springcore.lifecycle;

/**
 * Spring Provide public void init(){ } and public void destroy(){ }.
 * We can change the name but signature must be same.
 * We can define method in our configuration (init-method="initBean" destroy-method="destroyBean).
 * 
 * @author arunpanjiyar
 *
 */
public class Samosa {
	
	private int price;

	public Samosa() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void initBean() {
		System.out.println("Samosa: initBean");
	}
	
	public void destroyBean() {
		System.out.println("Samosa: destroyBean");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
}
