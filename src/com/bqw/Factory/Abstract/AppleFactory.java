package com.bqw.Factory.Abstract;

public class AppleFactory implements AbstractFactory{
    @Override
    public PC getNewPC() {
        return new Mac();
    }

    @Override
    public Phone getNewPhone() {
        return new iPhone();
    }
}
