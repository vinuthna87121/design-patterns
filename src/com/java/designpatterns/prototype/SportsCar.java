package com.java.designpatterns.prototype;

public class SportsCar  implements Car{
private String name;
private String color;

	public SportsCar(String name, String color) {
	super();
	this.name = name;
	this.color = color;
}
	@Override
	public Car clone() {
		return new SportsCar(this.name,this.color);
		
	}

	@Override
	public void display() {
		
		System.out.println(name + color);
	}

}
