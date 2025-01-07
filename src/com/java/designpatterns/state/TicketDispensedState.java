package com.java.designpatterns.state;

public class TicketDispensedState implements State {
    TicketMachine ticketMachine;

    public TicketDispensedState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    public void pressButton() {
        System.out.println("Ticket already dispensed.");
    }

    public void insertMoney() {
        System.out.println("Please wait until the ticket is dispensed.");
    }
} 


