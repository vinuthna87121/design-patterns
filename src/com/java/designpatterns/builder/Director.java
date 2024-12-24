package com.java.designpatterns.builder;

public class Director {
private pizzaBuilder builder;
public Director(pizzaBuilder builder) {
	this.builder=builder;
}

public Pizza construct() {
	
	builder.buildSauce();
	builder.buildDough();
	return builder.getPizza();
	
}
}
