package com.company;


class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        String message = "Mitsubishi -> startEngine()";
        return message;
    }

    public String accelerate(){
        String message = "Mitsubishi -> accelerate()";
        return message;
    }

    public String brake(){
        String message = "Mitsubishi -> brake()";
        return message;
    }
}