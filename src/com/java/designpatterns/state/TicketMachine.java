package com.java.designpatterns.state;

public class TicketMachine {
	
	  
	    private State noMoneyState;
	    private State hasMoneyState;
	    private State ticketDispensedState;
	    private State currentState;

	    public TicketMachine() {
	        noMoneyState = new NoMoneyState(this);
	        hasMoneyState = new HasMoneyState(this);
	        ticketDispensedState = new TicketDispensedState(this);
	        currentState = noMoneyState;
	    }

	    public void setState(State state) {
	        this.currentState = state;
	    }

	    public State getNoMoneyState() {
	        return noMoneyState;
	    }

	    public State getHasMoneyState() {
	        return hasMoneyState;
	    }

	    public State getTicketDispensedState() {
	        return ticketDispensedState;
	    }

	    public void pressButton() {
	        currentState.pressButton();
	    }

	    public void insertMoney() {
	        currentState.insertMoney();
	    }
	}


