package com.bqw.Memento;

// 备忘录，用于存储状态
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
