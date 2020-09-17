package com.bqw.Factory.Method;

public class HuaweiFactory implements AbstractPhoneFactory{
    @Override
    public Phone getNewPhone() {
        return new HuaweiPhone();
    }
}
