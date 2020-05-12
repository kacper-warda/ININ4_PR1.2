package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("not enough money, sorry");
        }
        if (seller.getCar() != this) {
            throw new Exception("you cannot sell something that is not yours");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(this);
        seller.setCar(null);
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

}
