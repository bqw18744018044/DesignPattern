package com.bqw.Factory.Abstract;

public class Demo {
    public static void main(String...args){
        AbstractFactory apple = new AppleFactory();
        AbstractFactory hua = new HuaweiFactory();
        AbstractFactory xiao = new XiaomiFactory();
        Phone p1 = apple.getNewPhone();
        Phone p2 = hua.getNewPhone();
        Phone p3 = xiao.getNewPhone();
        PC pc1 = apple.getNewPC();
        PC pc2 = hua.getNewPC();
        PC pc3 = xiao.getNewPC();
        p1.call();
        p2.call();
        p3.call();
        pc1.open();
        pc2.open();
        pc3.open();
    }
}
