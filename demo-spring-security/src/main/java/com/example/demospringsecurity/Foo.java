package com.example.demospringsecurity;

public class Foo {
    private double id;
    private String name;
    
    // constructor, getters and setters
    public Foo(double id, String name){
        this.id = id;
        this.name = name;
    }

    public double getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}