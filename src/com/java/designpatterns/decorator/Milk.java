package com.java.designpatterns.decorator;

public class Milk extends CoffeeDecorator {
	
	    public Milk(Coffee coffee) {
	        super(coffee);
	    }

	    @Override
	    public String getDescription() {
	        return coffee.getDescription() + ", Milk";
	    }

	    @Override
	    public double getCost() {
	        return coffee.getCost() + 0.50; 
	    }
	}


