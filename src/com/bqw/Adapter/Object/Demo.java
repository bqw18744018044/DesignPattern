package com.bqw.Adapter.Object;

public class Demo {
    public static void main(String...args){
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
