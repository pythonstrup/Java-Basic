package com.pythonstrup.packagesChall;

public class Series {
    public static int nSum(int n){
        if(n < 0)
            return -1;

        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if(n < 0)
            return -1;

        if(n == 0)
            return 0;

        int fac = 1;
        for(int i =1; i<=n; i++){
            fac *= i;
        }
        return fac;
    }

    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
}
