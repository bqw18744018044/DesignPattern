package com.bqw.Mediator;

public class ConcreteColleague2 extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        this.mediator.relay(this);
    }
}
