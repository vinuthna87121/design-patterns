package com.java.designpatterns.builder;

public class pepperoniPizza  implements pizzaBuilder{
 private Pizza pizza;
 
 public pepperoniPizza () {
	 this.pizza= new Pizza();
 }
	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		pizza.setDough("thin crust");
		
	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		pizza.setSauce("alfredo");
	}

	@Override
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		return pizza;
	}

}
