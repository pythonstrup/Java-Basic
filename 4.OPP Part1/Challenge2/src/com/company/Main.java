package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle(2, 2, 1, 20, "motorCycle");
        Car morning = new Car(false, 4, "Kia", "Morning");
        Avante mycar = new Avante(20_000_000);

        morning.incresing();
        morning.incresing();
        morning.incresing();
        morning.incresing();
        morning.incresing();
        morning.decresing();

        mycar.incresing();
        mycar.incresing();
        mycar.incresing();

    }
}
