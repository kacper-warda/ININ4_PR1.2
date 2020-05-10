package com.company.devices;

public class Phone extends Device {
    private Double screenSize;

    public Phone(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is working");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }
}
