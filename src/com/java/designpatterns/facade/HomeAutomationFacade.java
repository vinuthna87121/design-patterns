package com.java.designpatterns.facade;

public class HomeAutomationFacade {
	private Light lighting;
    private Fans fan;

    public HomeAutomationFacade() {
        lighting = new Light();
        fan = new Fans();
    }

    public void startDayRoutine() {
        lighting.turnOnLight();
        fan.turnOnFan();
        System.out.println("Day routine started.");
    }

    public void endDayRoutine() {
        lighting.turnOffLight();
        fan.turnOffFan();
        System.out.println("Day routine ended.");
    }


		
	}


