package com.bqw.Factory.Abstract;

public class XiaomiFactory implements AbstractFactory{
    @Override
    public PC getNewPC() {
        return new XiaomiPC();
    }

    @Override
    public Phone getNewPhone() {
        return new XiaoMiPhone();
    }
}
