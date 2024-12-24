package com.java.designpatterns.proxy;

public class RealImage implements Image {
	private String fileName;
	public RealImage(String fileName) {
		this.fileName=fileName;
		 loadImageFromDisk();
		
	}
	
	public  void loadImageFromDisk() {
		System.out.println("loading from disk" + fileName);
	}

	@Override
	public void display() {
		System.out.println("display image:"+ fileName);
		
		
		
	}

}
