package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double transaction){
        if(findBranch(branchName) != null){
            return findBranch(branchName).newCustomer(name, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String name, double transaction) {
        if(findBranch(branchName) != null){
            return findBranch(branchName).addCustomerTransaction(name, transaction);
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i<branches.size(); i++){
            String name = branches.get(i).getName();
            if(name == branchName){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTrasactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            for(int i = 0; i<branch.getCustomers().size(); i++){
                System.out.println("Customer: " + branch.getCustomers().get(i).getName()+"[" + (i+1) + "]");
                if(printTrasactions){
                    System.out.println("Transactions");
                    Customer customer = branch.getCustomers().get(i);
                    for(int j = 0; j < customer.getTransactions().size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + customer.getTransactions().get(j));
                    }
                }

            }
            return true;

        } else {
            return false;
        }

    }
}
