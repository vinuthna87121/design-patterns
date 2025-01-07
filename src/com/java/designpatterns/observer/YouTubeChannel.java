package com.java.designpatterns.observer;

import java.util.ArrayList; 
import java.util.List;


public class YouTubeChannel {
	
	    public List<Subscriber> subscribers = new ArrayList<>(); // List of subscribers
	    private String channelName;
	    private String latestVideo;

	    public YouTubeChannel(String channelName) {
	        this.channelName = channelName;
	    }

	    // Method to subscribe a user
	    public void subscribe(Subscriber subscriber) {
	        subscribers.add(subscriber);
	    }

	    // Method to unsubscribe a user
	    public void unsubscribe(Subscriber subscriber) {
	        subscribers.remove(subscriber);
	    }

	    // Notify all subscribers about a new video
	    public void uploadVideo(String videoTitle) {
	        this.latestVideo = videoTitle;
	        System.out.println("\n" + channelName + " uploaded a new video: " + videoTitle);
	        notifySubscribers();
	    }

	    // Notify each subscriber
	    private void notifySubscribers() {
	        for (Subscriber subscriber : subscribers) {
	           subscriber.update(latestVideo);
	        }
	    }
	}



