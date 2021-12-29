package com.pythonstrup;

public class Main {

    public static void main(String[] args) {
        Account pacaAccount = new Account("paca");
        pacaAccount.deposit(1000);
        pacaAccount.withdraw(500);
        pacaAccount.withdraw(-200);
        pacaAccount.deposit(-20);
        pacaAccount.calculateBalance();

        System.out.println("Balance on account is " +pacaAccount.getBalance());
        pacaAccount.calculateBalance();
    }
}
