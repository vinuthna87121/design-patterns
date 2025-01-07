package com.java.designpatterns.strategy;

public class Context {
	private StrategyInterface strategyinterface;
	public Context(StrategyInterface strategyinterface) {
		this.strategyinterface=strategyinterface;
		
	}
	public void payAmount(int amount) {
		if(strategyinterface != null) {
			strategyinterface.pay(amount);
			
		}
	}

}
