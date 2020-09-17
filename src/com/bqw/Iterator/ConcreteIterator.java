package com.bqw.Iterator;

import java.util.*;

public class ConcreteIterator implements Iterator{
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object object = null;
        if(hasNext()){
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if(index<list.size()-1)
            return true;
        else
            return false;
    }
}
