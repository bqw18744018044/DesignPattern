package com.bqw.Template.MyExample;

public class Demo {
    public static void main(String...args){
        MachineLearning algo1 = new Algorithm1(true);
        System.out.println("第一次执行算法");
        algo1.run();
        System.out.println("\n\n再一次执行算法");
        algo1.setIsClean(false);
        algo1.run();
    }
}
