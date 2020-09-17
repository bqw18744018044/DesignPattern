package com.bqw.Factory.Simple;

public class PhoneFactory {
    public Phone getPhone(String phoneType){
        if(phoneType==null)return null;
        if(phoneType.equalsIgnoreCase("iPhone")){
            return new iPhone();
        }else if(phoneType.equalsIgnoreCase("Huawei")){
            return new HuaweiPhone();
        }else if(phoneType.equalsIgnoreCase("XiaoMi")){
            return new XiaoMiPhone();
        }
        return null;
    }

    public static void main(String...args){
        PhoneFactory factory = new PhoneFactory();
        Phone p1 = factory.getPhone("iphone");
        Phone p2 = factory.getPhone("huawei");
        Phone p3 = factory.getPhone("xiaomi");
        p1.call();
        p2.call();
        p3.call();
    }
}
