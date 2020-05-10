package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 2000.0;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.getPrice()) {
            System.out.println("Gratulacje Confgrats you bought it");
            this.car = car;
        } else if (this.salary > car.getPrice() / 12.0) {
            System.out.println("You bought it, I mean your bank bought it, but it could be yours in the future");
            this.car = car;
        } else {
            System.out.println("Go to work man");
        }
    }
}
