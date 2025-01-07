package com.java.designpatterns.command;

public class Client {
	public static void main(String[] args) {
		Light light= new Light();
		LightOn On= new LightOn(light);
		LightOff Off= new LightOff(light);
		RemoteControl remote = new RemoteControl();
		remote.setCommand(Off);
		remote.pressButton();
		remote.setCommand(On);
		remote.pressButton();
		
	
	
	}

}
