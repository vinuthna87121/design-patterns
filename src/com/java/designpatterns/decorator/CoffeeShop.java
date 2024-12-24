package com.java.designpatterns.decorator;

public class CoffeeShop {
public static void main(String[] args) {
	Coffee basicCoffee= new SimpleCoffee();
	System.out.println(basicCoffee.getDescription() +" "+ basicCoffee.getCost());


Coffee pcoffee = new PumpkinSpice(basicCoffee);
System.out.println(pcoffee.getDescription()+" "+pcoffee.getCost());
Coffee mcoffee = new Milk(pcoffee);
System.out.println(mcoffee.getDescription()+" "+mcoffee.getCost());

}
}