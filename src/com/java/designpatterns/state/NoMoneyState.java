package com.java.designpatterns.state;

public class NoMoneyState implements State{
	TicketMachine ticketMachine;

    public NoMoneyState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    public void pressButton() {
        System.out.println("Insert money first.");
    }

    public void insertMoney() {
        System.out.println("Money inserted.");
        ticketMachine.setState(ticketMachine.getHasMoneyState());
    }
}


