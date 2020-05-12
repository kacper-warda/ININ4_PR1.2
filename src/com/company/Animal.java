package com.company;

import java.io.File;

public class Animal implements Edible, Saleable {
    final String species;
    String name;
    File pic;
    protected Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 11.0;
    static final Double DEFAULT_LION_WEIGHT = 180.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }
    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("to late for food");
        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }
    }

    void takeForAWalk() {
        if (weight <= 0.0) {
            System.out.println("cannot walk the town with dead animal you freak");
        } else if (weight <= 1.0) {
            System.out.println("thx for a walk but I'm hungry, my weight is now " + weight);
            weight -= 0.1;
        } else {
            System.out.println("thx for a walk, my weight is now " + weight);
            weight -= 0.1;
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() {
        weight = 0.0;
        System.out.println("adiooooooos");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("NO SLAVERY!!!");
        }
        if (buyer.cash < price) {
            throw new Exception("not enough money, sorry");
        }
        if (seller.pet != this) {
            throw new Exception("you cannot sell something that is not yours");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.pet = this;
        seller.pet = null;
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }
}
