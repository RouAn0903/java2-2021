package com.ro.cust;

public class Tester {
    public static void main(String[] args) {
        Customer cust = new Customer("0001", 800);
        System.out.println(cust.id+"\t"+cust.amount+"\t"+cust.getTotal());

        SilverCustomer Mary = new SilverCustomer("Mary", 1000);
        System.out.println(Mary.id+"\t"+ Mary.amount+"\t"+Mary.getTotal());
    }
}
