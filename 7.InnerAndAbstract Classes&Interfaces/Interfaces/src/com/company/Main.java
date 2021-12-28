package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone pacaPhone;
        pacaPhone = new DeskPhone(11111111);
        pacaPhone.powerOn();
        pacaPhone.callPhone(11111111);
        pacaPhone.answer();

        pacaPhone = new MobilePhone(22222222);
        pacaPhone.powerOn();
        pacaPhone.callPhone(22222222);
        pacaPhone.answer();
    }
}
