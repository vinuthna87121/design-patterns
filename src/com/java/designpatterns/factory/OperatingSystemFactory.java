package com.java.designpatterns.factory;

public class OperatingSystemFactory {

	public Os getinstance(String str) {
		if(str.equals("Open")) {
			return new Android();
		}else if(str.equals("Close")) {
			return new Ios();
		}else
return new Windows();
	}
}
