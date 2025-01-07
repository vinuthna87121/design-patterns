package com.java.designpatterns.command;

public class LightOn implements Command {
    private Light light;

    LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

}
