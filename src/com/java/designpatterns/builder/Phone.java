package com.java.designpatterns.builder;

public class Phone {
	private String model;
	private int num;
	private int ram;
	public Phone(String model, int num, int ram) {
		super();
		this.model = model;
		this.num = num;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", num=" + num + ", ram=" + ram + "]";
	}
}
