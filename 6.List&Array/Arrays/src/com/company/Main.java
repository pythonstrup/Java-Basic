package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//	    int[] myArray = new int [10]; //{1,2,3,4,5,6,7,8,9,10};
////        myArray[0] = 45;
////        myArray[1] = 476;
////        myArray[5] = 50;
//
//        for(int i = 0; i<10; i++){
//            myArray[i] = i*10;
//        }
//        printArray(myArray);

        int[] myIntergers = getIntegers(5);
        printArray(myIntergers);
        System.out.println("The average is " + getAverage(myIntergers));
    }

    public static void printArray(int[] Array){
        for(int i = 0 ; i<Array.length; i++){
            System.out.println("Element " + i + " value is " + Array[i]);
        }
    }

    public static int [] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }

        return (double) sum/ (double) array.length;
    }
}
