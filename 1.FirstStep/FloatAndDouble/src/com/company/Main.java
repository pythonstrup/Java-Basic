package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        // Challenge
        int pound = 50;
        double kg = 0.45359237d;
        double pound2kg = pound * kg;
        System.out.println(pound2kg);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(anotherNumber);
    }
}
