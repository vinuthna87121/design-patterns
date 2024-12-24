package com.java.designpatterns.decorator;

public class PumpkinSpice extends CoffeeDecorator {
	public PumpkinSpice(Coffee coffee) {
		super(coffee);
	}
	@Override
    public String getDescription() {
        return coffee.getDescription() +",pumpkingpowder";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 4.00;
    }
}

