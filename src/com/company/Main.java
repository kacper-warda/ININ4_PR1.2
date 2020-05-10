package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Nowacki";
        me.pet = new Animal("cat");

        me.setCar(new Car("Fiat", "bravo", 1.6));
        me.getCar().color = "gray";

        System.out.println(me.getCar().model);

        System.out.println(me.pet.getWeight());
    }
}
