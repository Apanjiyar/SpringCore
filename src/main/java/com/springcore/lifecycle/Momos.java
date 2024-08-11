package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * We can use @PostConstruct and @PreDestroy annotation
 * Read Notes2.txt
 * 
 * @author arunpanjiyar
 *
 */
public class Momos {
	
	private int price;

	public Momos() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Momos: start");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Momos: end");
	}
	
	@Override
	public String toString() {
		return "Momos [price=" + price + "]";
	}
}
