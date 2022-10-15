package com.driver;

public class RWOnly {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

//
// Task 5:
//         try implementing getter and setters member function in class RWOnly
// Task 6:
//        Now, try setting a value to name in Main function using setter function and access it's value using getter function
//        Learnings:
//        Encapsulation is used for hidding data,
//        you can create a readOnly member, by just implementing getter funtion for that
//        Or you can also create a writeOnly member, by just implementing setter function for that */