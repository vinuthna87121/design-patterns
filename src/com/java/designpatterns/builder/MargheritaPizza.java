package com.java.designpatterns.builder;

public class MargheritaPizza implements pizzaBuilder {
	private Pizza pizza;
	
	public MargheritaPizza() {
		 this.pizza=new Pizza();
	}

	@Override
	public void buildDough() {
		pizza.setDough("Thick");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Tomato");
		
	}

	@Override
	public Pizza getPizza() {
		
		return pizza;
	}

}
