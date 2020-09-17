package com.bqw.Template.Extend;

public class Demo {
    public static void main(String...args){
        Game game = new Football();
        game.play();
        System.out.println();
        game.username = "张三";
        game.play();
    }
}
