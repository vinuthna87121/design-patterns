package com.java.designpatterns.builder;

public class Phonebuilder {
	private String model;
	private int num;
	private int ram;
	public Phonebuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public Phonebuilder setNum(int num) {
		this.num = num;
		return this;
	}
	public Phonebuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
public Phone getPhone() {
	return new Phone(model,num,ram);
}
}
