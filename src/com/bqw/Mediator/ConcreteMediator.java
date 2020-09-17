package com.bqw.Mediator;

import java.util.*;

public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues = new ArrayList<>();
    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for(Colleague ob:colleagues){
            if(!ob.equals(cl)){
                ob.receive();
            }
        }
    }
}
