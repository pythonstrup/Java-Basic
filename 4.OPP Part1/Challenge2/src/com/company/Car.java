package com.company;

public class Car extends Vehicle{
    private boolean isElectric;
    private int seats;
    private String brandName;
    private int gear;

    public Car(boolean isElectric, int seats, String brandName, String name) {
        super(4, 4, 1, 20, name);
        this.isElectric = isElectric;
        this.seats = seats;
        this.brandName = brandName;
        this.gear = 1;
    }

    public void incresing(){
        super.incresing();
        changingGears();
        System.out.println(super.getName() + " Car.incresing() called. speed : " + super.getSpeed() + "km/h");
    }

    public void decresing(){
        super.decresing();
        changingGears();
        System.out.println(super.getName() + " Car.decresing() called. speed : " + super.getSpeed() + "km/h");
    }

    public void changingGears(){
        if(super.getSpeed() > 30 && super.getSpeed() <= 60)
            this.gear = 2;
        else if(super.getSpeed() > 60)
            this.gear = 3;
        else
            this.gear = 1;

        System.out.println("gear level is " + gear);
    }
}

