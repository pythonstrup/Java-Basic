package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("302-0000-0000-0000");
        account.setBalance(2000);
        account.setCustomerName("paca");
        account.setPhoneNumber("010-0000-0000");
        account.deposit(10000);
        System.out.println(account.withdraw(5000));
        System.out.println(account.withdraw(10000));


        BankAccount account2 = new BankAccount("1111",
                10000, "good", "010-1111-1111");
        account.show();
        account2.show();

        VipPerson vip1 = new VipPerson();
        vip1.show();

        VipPerson vip2 = new VipPerson("hi", "name@email.com");
        vip2.show();

        VipPerson vip3 = new VipPerson("good", 2_000_000, "good@email.com");
        vip3.show();

    }
}
