package com.java.designpatterns.singleton;

public class Singleton {
	private  static Singleton instance;
	private Singleton() {
		
	}
	public static Singleton getinstance() {
		if(instance==null) {
			instance = new Singleton();
		}return instance;
	}
 public static void speak() {
	 System.out.println("hi singleton");
 }
}
