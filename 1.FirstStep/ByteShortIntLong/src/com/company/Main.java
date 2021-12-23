package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); // underflow

        // error
        // int myMaxIntTest = 2147483648; // over limit
        int myMaxIntTest = 2_147_483_647;

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = " + myMaxByte);
        System.out.println("Byte Minimum Value = " + myMinByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("short Maximum Value = " + myMaxShort);
        System.out.println("short Minimum Value = " + myMinShort);

        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLong);
        System.out.println("Long Minimum Value = " + myMinLong);
        long bigLongLiteralValue = 2_147_483_647_243L;
        System.out.println(bigLongLiteralValue);

        int total = (myMinIntValue / 2);
        
        byte newByteValue = (byte) (myMinByte / 2);

        short newShortValue = (short) (myMaxShort / 2);

        //Primitive Types Chanllenge
        byte byteValue = 100;
        short shortValue = 200;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
