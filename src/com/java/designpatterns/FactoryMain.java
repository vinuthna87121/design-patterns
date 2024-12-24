package com.java.designpatterns;

import com.java.designpatterns.factory.OperatingSystemFactory;
import com.java.designpatterns.factory.Os;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		Os os= osf.getinstance("hb");
		os.spec();
		

	}

}
