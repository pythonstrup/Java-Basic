package com.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        String message = "Car -> startEngine()";
        return message;
    }

    public String accelerate(){
        String message = "Car -> accelerate()";
        return message;
    }

    public String brake(){
        String message = "Car -> brake()";
        return message;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}




