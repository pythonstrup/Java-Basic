package com.company;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        return length;
    }

    private static int[] readElements(int length){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];

        for(int i = 0; i<length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
}
