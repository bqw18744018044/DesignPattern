package com.bqw.Memento;

import java.util.*;

// 管理者，对多种、多个Memento进行管理
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
