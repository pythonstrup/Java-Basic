package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if( tonerAmount > 0 && tonerAmount <= 100){
            if((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        double pagesToPrint = pages;
        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint /= 2;
            this.pagesPrinted += pagesToPrint;
            return (int) Math.round(pagesToPrint);
        } else {
            this.pagesPrinted += pagesToPrint;
            return (int) pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
