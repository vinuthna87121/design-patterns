package com.java.designpatterns.strategy;

public class CreditCard implements StrategyInterface {
	private String cardnumber;
	public CreditCard(String cardnumber) {
		this.cardnumber=cardnumber;
		
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + "paid by" +  cardnumber);
		
	}

}
