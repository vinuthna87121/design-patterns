package com.java.designpatterns.command;

public class LightOff implements Command {
    private Light light;

    LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
	

}
