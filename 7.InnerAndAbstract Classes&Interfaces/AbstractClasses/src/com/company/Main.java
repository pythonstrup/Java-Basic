package com.company;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggy");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Pigeon");
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Cockatoo");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
