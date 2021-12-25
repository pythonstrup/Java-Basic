package com.company;


class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        String message = "Holden -> startEngine()";
        return message;
    }

    public String accelerate(){
        String message = "Holden -> accelerate()";
        return message;
    }

    public String brake(){
        String message = "Holden -> brake()";
        return message;
    }
}
