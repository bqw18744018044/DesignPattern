package com.bqw.Factory.Method;

public class Demo {
    public static void main(String...args){
        AbstractPhoneFactory apple = new AppleFactory();
        AbstractPhoneFactory hua = new HuaweiFactory();
        AbstractPhoneFactory xiao = new XiaomiFactory();
        Phone p1 = apple.getNewPhone();
        Phone p2 = hua.getNewPhone();
        Phone p3 = xiao.getNewPhone();
        p1.call();
        p2.call();
        p3.call();
    }
}
