package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

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

        Human myWife = new Human();
        myWife.firstName = "Karolina";
        myWife.setCar(new Car("Fiat", "bravo", 1.6));

        System.out.println(me.getCar());
        myWife.setCar(me.getCar());
        System.out.println(myWife.getCar());

        System.out.println(me);
        System.out.println(myWife);

        System.out.println(me.species);
        me.feed();
        me.takeForAWalk();


        Phone nokia = new Phone("Nokia", "3310");

        System.out.println(nokia.toString());

        System.out.println(nokia.producer);

        try {
            me.pet.sell();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
