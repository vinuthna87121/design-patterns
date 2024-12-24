package com.java.designpatterns.builder;

public class Shop {
	public static void main(String[] args) {
		
	
	Phone p = new Phonebuilder().setModel("android").setNum(1).getPhone();

 System.out.println(p);

}
}