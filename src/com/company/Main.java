package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Nowacki";
        me.pet = new Animal("cat");
        me.pet.name = "Simba";

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
            System.out.println("me.cash  " + me.cash);
            System.out.println("myWife.cash  " + myWife.cash);
            System.out.println("me.pet " + me.pet);
            System.out.println("myWife.pet " + myWife.pet);

            me.pet.sell(myWife, me, 50.0);

            System.out.println("me.cash  " + me.cash);
            System.out.println("myWife.cash  " + myWife.cash);
            System.out.println("me.pet " + me.pet);
            System.out.println("myWife.pet " + myWife.pet);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            nokia.installAnApp("facebook");
            nokia.installAnApp("messenger", "3.2.4");
            String[] appNames = {"whatsapp", "instagram"};
            nokia.installAnApp(appNames);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
