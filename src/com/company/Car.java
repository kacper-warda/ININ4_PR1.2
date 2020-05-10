package com.company;

public class Car {
    final String producent;
    final String model;
    final Double engineSize;
    String color;
    private Double millage;
    private Double price = 1000.0;


    public Car(String producent, String model, Double engineSize) {
        this.producent = producent;
        this.model = model;
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
}
