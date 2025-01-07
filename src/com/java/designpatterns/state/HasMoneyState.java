package com.java.designpatterns.state;

public class HasMoneyState implements State {
    TicketMachine ticketMachine;

    public HasMoneyState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    public void pressButton() {
        System.out.println("Button pressed. Dispensing ticket...");
        ticketMachine.setState(ticketMachine.getTicketDispensedState());
    }

    public void insertMoney() {
        System.out.println("Money already inserted.");
    }

}
