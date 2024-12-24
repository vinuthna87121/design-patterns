package com.java.designpatterns.builder;

public class veggiePizza implements pizzaBuilder {
	private Pizza pizza;

	public veggiePizza() {
		this.pizza = new Pizza();
	}

	@Override
	public void buildDough() {
		pizza.setDough("handtossed");

	}

	

	@Override
	public Pizza getPizza() {

		return pizza;
	}

	@Override
	public void buildSauce() {
	return;
		
	}

}
