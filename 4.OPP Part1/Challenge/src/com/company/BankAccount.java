package com.company;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String phoneNumber;

    public BankAccount(){
        this("00000", 0, "default name", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, int balance, String customerName, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;

        // error
        // this(accountNumber, balance, customerName, phoneNumber);
    }

    public void show(){
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Balance : " + this.balance);
        System.out.println("Customer name : " + customerName);
        System.out.println("Phone Number : " + phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(int money){
        this.balance += money;
    }

    public int withdraw(int money){
        if(balance < money){
            System.out.println("withdraw is not available.");
            return 0;
        }

        this.balance -= money;
        return money;
    }
}
