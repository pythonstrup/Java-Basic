package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Not References
	    int value = 10;
        int anotherValue = value;

        System.out.println("value = " + value);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;

        System.out.println("value = " + value);
        System.out.println("anotherValue = " + anotherValue);


        // References
        int[] intArray = new int[5];
        int[] anotherArray = intArray;
        System.out.println("intArray[] = " + Arrays.toString(intArray));
        System.out.println("anotherArray[] = " + Arrays.toString(anotherArray));

        intArray[4] = 4;
        anotherArray[2] = 2;

        System.out.println("after change intArray[] = " + Arrays.toString(intArray));
        System.out.println("after change anotherArray[] = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(intArray);

        System.out.println("after modify intArray[] = " + Arrays.toString(intArray));
        System.out.println("after modify anotherArray[] = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 1;

        // not apply
        array = new int[] {1, 2, 3, 4, 5};
    }
}
