package com.pythonstrup;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getPrivateVar(){
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
//        System.out.println("Value of i is now " + i);
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass{
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }
        public void timesTwo() {
            System.out.println("varOne is still available here " + varOne);
            for (int i = 0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
