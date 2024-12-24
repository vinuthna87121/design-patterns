package com.java.designpatterns.adapter;

public class Traveller {
	private UsPowerSocket uspowersocket;
	public Traveller(UsPowerSocket uspowersocket) {
		this.uspowersocket=uspowersocket;
		
	}
	void chargeDevice() {
		System.out.println("charging with us socket");
		uspowersocket.connectUsPlug();
	}

}
