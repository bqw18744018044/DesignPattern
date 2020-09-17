package com.bqw.Mediator;

public class ConcreteColleague1 extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        this.mediator.relay(this);
    }
}
