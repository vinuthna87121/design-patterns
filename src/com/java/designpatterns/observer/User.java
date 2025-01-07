package com.java.designpatterns.observer;

 public class User implements Subscriber {
	    private String name;

	    public User(String name) {
	        this.name = name;
	    }

	    @Override
	    public void update(String videoTitle) {
	        System.out.println(name + " got notified about a new video: " + videoTitle);
	    }
	}


