package com.java.designpatterns.proxy;

public class Client {
	public static void main(String[] args) {
		Image image = new ProxyImage("highres_image.jpg");
		image.display();
		image.display();
	}

}
