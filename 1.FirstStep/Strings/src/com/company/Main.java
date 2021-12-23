package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a String";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2021";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.25";
        System.out.println(numberString);

        String lastString = "10";
        int MyInt = 50;
        lastString = lastString + MyInt;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
