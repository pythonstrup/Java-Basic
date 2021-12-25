package com.company;

public class Vehicle {
    private int tire;
    private int door;
    private int engine;
    private int speed;
    private String name;

    public Vehicle(int tire, int door, int engine, int speed, String name) {
        this.tire = tire;
        this.door = door;
        this.engine = engine;
        this.speed = speed;
        this.name = name;
    }

    public void steering() {

    }

    public void incresing(){
        speed += 10;
        System.out.println("Vehicle.incresing() called. +10km/h");
    }

    public void decresing(){
        speed -= 10;
        System.out.println("Vehicle.decresing() called. -10km/h");
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called");
    }

    public int getTire() {
        return tire;
    }

    public int getDoor() {
        return door;
    }

    public int getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
