package com.java.designpatterns.proxy;

public class ProxyImage  implements Image{
	private RealImage realImage;
	private String fileName;
	public ProxyImage(String FileName) {
		this.fileName=fileName;
	}
	

	@Override
	public void display() {
		if (realImage==null) {
			realImage= new RealImage(fileName);
		}
	  realImage.display();
		
	}

}
