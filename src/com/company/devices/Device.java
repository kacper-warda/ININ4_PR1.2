package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String producer;
    public final String model;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    abstract public void turnOn();

}
