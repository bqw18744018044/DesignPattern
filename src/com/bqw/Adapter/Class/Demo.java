package com.bqw.Adapter.Class;

public class Demo {
    public static void main(String...args){
        Target target = new ClassAdapter();
        target.request();
    }
}
