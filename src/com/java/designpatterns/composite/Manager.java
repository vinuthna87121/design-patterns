package com.java.designpatterns.composite;


	public class Manager implements Employee {
	    private String name;
	    private String position;

	    public Manager(String name, String position) {
	        this.name = name;
	        this.position = position;
	    }

	    @Override
	    public void showDetails() {
	        System.out.println("Manager: " + name + ", Position: " + position);
	    }
	}



