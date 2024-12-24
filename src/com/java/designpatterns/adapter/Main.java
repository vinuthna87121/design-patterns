package com.java.designpatterns.adapter;

public class Main {
	public static void main(String[] args) {
		EuropeanPowerSocket european= new EuropeanPowerSocket();
		SocketAdapter adapter= new SocketAdapter(european);
		Traveller traveller= new Traveller(adapter);
		traveller.chargeDevice();
	}

}
