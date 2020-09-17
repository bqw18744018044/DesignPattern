package com.bqw.Factory.Method;

public class AppleFactory implements AbstractPhoneFactory{
    @Override
    public Phone getNewPhone() {
        return new iPhone();
    }
}
