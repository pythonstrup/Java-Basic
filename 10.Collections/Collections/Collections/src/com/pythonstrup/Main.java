package com.pythonstrup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for D13");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> reveseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reveseSeats);
        printList(reveseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + "-" + seat.getPrice() + "$");
        }
        System.out.println();
        System.out.println("======================================================================================================================");
    }


}
