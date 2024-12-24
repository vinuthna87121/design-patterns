package com.java.designpatterns.builder;

public class Pizza {
	private String dough;
	private String sauce;
	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + "]";
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

}
