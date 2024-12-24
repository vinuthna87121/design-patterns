package com.java.designpatterns.adapter;

import com.java.designpatterns.vinuthna.PilotPen;

public class PilotAdapter implements Pen {

	PilotPen pp= new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);
		
	}

}
