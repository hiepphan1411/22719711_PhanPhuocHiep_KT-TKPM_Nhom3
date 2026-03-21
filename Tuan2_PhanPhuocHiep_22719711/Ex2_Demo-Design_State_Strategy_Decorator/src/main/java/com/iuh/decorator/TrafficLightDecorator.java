package com.iuh.decorator;

public abstract class TrafficLightDecorator implements TrafficLightDisplay {
    protected TrafficLightDisplay wrapped;

    public TrafficLightDecorator(TrafficLightDisplay light) {
        this.wrapped = light;
    }

    @Override
    public void display() {
        wrapped.display();
    }
}
