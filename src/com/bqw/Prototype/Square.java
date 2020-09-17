package com.bqw.Prototype;

public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    void drow() {
        System.out.println("Inside Square::draw() method.");
    }
}
