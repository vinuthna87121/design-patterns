package com.java.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {
		Car car1= new SportsCar("Toyota","Red");
		car1.display();
		Car car2= car1.clone();
		
		car2 = new SportsCar("lamborghini" , "white");
		car2.display();
		
	}

}
