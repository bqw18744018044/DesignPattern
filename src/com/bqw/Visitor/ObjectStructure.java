package com.bqw.Visitor;

import java.util.*;

public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> i=list.iterator();
        while(i.hasNext())
        {
            ((Element) i.next()).accept(visitor);
        }
    }

    public void add(Element e){
        list.add(e);
    }

    public void remove(Element e){
        list.remove(e);
    }
}
