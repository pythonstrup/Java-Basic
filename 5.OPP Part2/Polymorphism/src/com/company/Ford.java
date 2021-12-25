package com.company;

class Ford extends Car {
    public Ford(int cylinder, String name){
        super(cylinder, name);
    }

    public String startEngine(){
        String message = "Ford -> startEngine()";
        return message;
    }

    public String accelerate(){
        String message = "Ford -> accelerate()";
        return message;
    }

    public String brake(){
        String message = "Ford -> brake()";
        return message;
    }
}