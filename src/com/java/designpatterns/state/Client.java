package com.java.designpatterns.state;

public class Client {
	public static void main(String[] args) {
		TicketMachine tm = new TicketMachine();
		tm.insertMoney();
		tm.pressButton();
		tm.insertMoney();
		tm.pressButton();
		tm.insertMoney();
		tm.pressButton();
		tm.insertMoney();
		tm.pressButton();
		tm.setState(tm.getNoMoneyState());
		tm.pressButton();
		tm.insertMoney();
		tm.pressButton();
		tm.insertMoney();
		tm.pressButton();
		tm.insertMoney();
	}

}
