package com.bqw.Flyweight;

public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }

    public void setInfo(String info){
        this.info = info;
    }
}
