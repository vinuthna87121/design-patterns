package com.java.designpatterns.strategy;

public class Paypal implements StrategyInterface{
private String email;
public Paypal(String email ) {
	this.email=email;
}
@Override
public void pay(int amount) {
	System.out.println(amount + "paid by" +  email);
	
}
}
