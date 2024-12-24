package com.java.designpatterns.factory;

public class Factory {
//	Toyota t= new Toyota();
//	Audi a = new Audi();
	public Vehicle createVehicle(String name) {
		if(name == null) {
			return null;
		}if(name.equalsIgnoreCase("TOYOTA")) {
			return new Toyota();
		}else if(name.equalsIgnoreCase("audi")) {
			return new Audi();
		}return null;
	}

}
