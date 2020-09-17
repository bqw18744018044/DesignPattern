package com.bqw.Factory.Abstract;

public class HuaweiPhone implements Phone{

    @Override
    public void call() {
        System.out.println("Huawei Phone call");
    }
}
