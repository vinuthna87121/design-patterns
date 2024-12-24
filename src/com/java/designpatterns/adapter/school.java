package com.java.designpatterns.adapter;

public class school {
	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		Pen p = new PilotAdapter();
		aw.setP(p);
		aw.writeAssignment("i am tired");

	}

}
