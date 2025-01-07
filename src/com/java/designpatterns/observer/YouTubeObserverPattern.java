package com.java.designpatterns.observer;


	public class YouTubeObserverPattern {
	    public static void main(String[] args) {
	        // Create a YouTube channel (Subject)
	        YouTubeChannel techChannel = new YouTubeChannel("TechWorld");

	        // Create subscribers (Observers)
	        User alice = new User("Alice");	        User bob = new User("Bob");
	        User charlie = new User("Charlie");

	        // Subscribe users to the channel
	        techChannel.subscribe(alice);
	        techChannel.subscribe(bob);

	        // Upload a new video
	        techChannel.uploadVideo("Observer Pattern Tutorial");

	        // Subscribe another user and upload another video
	        techChannel.subscribe(charlie);
	        techChannel.uploadVideo("Dependency Injection Explained");
	    }
	}


