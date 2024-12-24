package com.java.designpatterns.adapter;
//adapter
public class SocketAdapter implements UsPowerSocket {
	private EuropeanPowerSocket europeanSocket;
	
	public SocketAdapter(EuropeanPowerSocket europeanSocket) {
		this.europeanSocket=europeanSocket;
	}

	@Override
	public void connectUsPlug() {
		System.out.println("Adapting us plug to european socket");
		europeanSocket.connectEuropeanPlug();
		
	}

}
