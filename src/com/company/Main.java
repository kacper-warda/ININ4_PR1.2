package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Nowacki";
        me.pet = new Animal("cat");

        me.car = new Car("Fiat", "bravo", 1.6);
        me.car.color = "gray";

        System.out.println(me.car.model);
    }
}
