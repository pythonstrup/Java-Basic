package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double transaction){
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName, transaction));
            return true;

        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        if(findCustomer(customerName) != null){
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i<customers.size(); i++){
            String cName = this.customers.get(i).getName();
            if(cName == customerName){
                return this.customers.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
