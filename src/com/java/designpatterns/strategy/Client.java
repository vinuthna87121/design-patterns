package com.java.designpatterns.strategy;

public class Client {
	public static void main(String[] args) {
		StrategyInterface paypal= new Paypal("1234");
		StrategyInterface creditcard= new CreditCard("vinu@gmail.com");
		Context context= new Context(paypal);
		context.payAmount(1000);
		Context context1= new Context(creditcard);
		context1.payAmount(1000);
		
	}
}
