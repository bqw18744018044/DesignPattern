package com.bqw.Observer;

import java.util.*;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void setState(int state){
        this.state = state;
        this.notifyAllObservers();
    }

    public void notifyAllObservers(){
        for(Observer observer:observers)observer.update();
    }
}
