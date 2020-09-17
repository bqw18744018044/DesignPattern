package com.bqw.Factory.Abstract;

public class HuaweiFactory implements AbstractFactory{
    @Override
    public PC getNewPC() {
        return new HuaweiPC();
    }

    @Override
    public Phone getNewPhone() {
        return new HuaweiPhone();
    }
}
