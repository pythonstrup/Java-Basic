package com.company;

public class Main {

    public static void main(String[] args) {
	    double var1 = 20.00d;
        double var2 = 80.00d;
        double result = (var1 + var2) * 100.00d;
        System.out.println("First Step = " + result);
        result = result % 40.00d;
        System.out.println("Result = " + result);

        boolean booleanValue = (result == 0) ? true : false;
        System.out.println(booleanValue);
        if(!booleanValue){
            System.out.println("Got some remainder");
        }
    }
}
