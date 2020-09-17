package com.bqw.Prototype;

public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void drow() {
        System.out.println("Inside Circle::draw() method.");
    }
}
