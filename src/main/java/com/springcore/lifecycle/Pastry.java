package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * To initialize spring life cycle method we can implement InitializingBean, DisposableBean
 * and override its methods afterPropertiesSet, destroy respectively
 * 
 * @author arunpanjiyar
 *
 */
public class Pastry implements InitializingBean, DisposableBean{
	
	private int price;

	public Pastry() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Pastry: afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Pastry: destroy");
	}
	
	@Override
	public String toString() {
		return "Pastry [price=" + price + "]";
	}
}
