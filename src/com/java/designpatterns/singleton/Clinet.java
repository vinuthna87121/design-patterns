package com.java.designpatterns.singleton;

public class Clinet {
	public static void main(String[] args) {
	
	
	Singleton obj1 = Singleton.getinstance();
	Singleton obj2 = Singleton.getinstance();
	obj1.speak();
	obj1.speak();
	System.out.println(obj1==obj2);

}
}