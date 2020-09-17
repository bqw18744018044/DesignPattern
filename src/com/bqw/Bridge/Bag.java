package com.bqw.Bridge;

abstract public class Bag {
    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract String getName();
}
