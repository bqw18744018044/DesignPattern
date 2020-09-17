package com.bqw.Decorator;

public class Demo {
    public static void main(String...args){
        Component p = new ConcreteComponent();
        p.operation();
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
