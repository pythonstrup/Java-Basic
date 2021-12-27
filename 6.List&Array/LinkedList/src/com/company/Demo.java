package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesTovisit = new LinkedList<String>();
        addInOrder(placesTovisit, "Seoul");
        addInOrder(placesTovisit, "Ansan");
        addInOrder(placesTovisit, "Incheon");
        addInOrder(placesTovisit, "Chuncheon");
        addInOrder(placesTovisit, "Goyang");
        addInOrder(placesTovisit, "Sungnam");
        addInOrder(placesTovisit, "Gunpo");

//        placesTovisit.add("Seoul");
//        placesTovisit.add("Ansan");
//        placesTovisit.add("Incheon");
//        placesTovisit.add("Chuncheon");
//        placesTovisit.add("Goyang");
//        placesTovisit.add("Sungnam");
//        placesTovisit.add("Gunpo");

        printList(placesTovisit);

        addInOrder(placesTovisit, "Dangjin");
        addInOrder(placesTovisit, "Busan");
        printList(placesTovisit);

        placesTovisit.remove(5);
        printList(placesTovisit);
        visit(placesTovisit);
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(newCity);
            if(comparision == 0) {
                System.out.println(newCity + " already included as a destination");
                return false;
            } else if(comparision > 0 ){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                // nothing to do
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available action: \npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu option");
    }
}
