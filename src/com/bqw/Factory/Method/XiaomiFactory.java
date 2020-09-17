package com.bqw.Factory.Method;

public class XiaomiFactory implements AbstractPhoneFactory{
    @Override
    public Phone getNewPhone() {
        return new XiaoMiPhone();
    }
}
