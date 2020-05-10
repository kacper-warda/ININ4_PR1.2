package com.company.devices;

public class Car extends Device {

    public final Double engineSize;
    public String color;
    private Double millage;
    private Double price = 1000.0;


    public Car(String producer, String model, Double engineSize) {
        super(producer, model);
        this.engineSize = engineSize;
    }

    public Double getMillage() {
        return millage;
    }

    public void setMillage(Double millage) {
        this.millage = millage;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return producer + " " + model + " " + engineSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is working");
    }
}
