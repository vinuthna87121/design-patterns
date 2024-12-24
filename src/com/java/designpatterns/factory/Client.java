package com.java.designpatterns.factory;

public class Client {
	public static void main(String[] args) {
		
	
	Factory f= new Factory();
	Vehicle v1 = f.createVehicle("toyota");

	v1.brand();
	Vehicle v2= f.createVehicle("Audi");
	v2.brand();
	
	}

	
}
