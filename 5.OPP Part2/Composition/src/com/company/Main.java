package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch Beast", "Acer",
                27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();
//        pc.getMonitor().drawPixelAt(1500, 2100, "red");
//        pc.getMotherboard().loadProgram("Window 10.0");
//        pc.getTheCase().pressPowerButton();
    }
}
