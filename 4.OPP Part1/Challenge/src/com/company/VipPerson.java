package com.company;

public class VipPerson {
    private String name;
    private int creditLimit;
    private String email;

    public VipPerson(){
        this("default name", 1_000_000, "default@email.com");
    }

    public VipPerson(String name,String email){
        this(name, 1_000_000, email);
    }

    public VipPerson(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public void show(){
        System.out.println("name : " + name);
        System.out.println("credit limit : " + creditLimit);
        System.out.println("email : " + email);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
