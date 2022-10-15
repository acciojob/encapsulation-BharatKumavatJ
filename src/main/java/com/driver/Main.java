package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "bharat";

        obj.setName("bharat");
        System.out.println(obj.getName());
    }
}


// Encapsulation
