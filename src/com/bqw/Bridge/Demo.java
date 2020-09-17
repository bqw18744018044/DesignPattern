package com.bqw.Bridge;

public class Demo {
    public static void main(String...args){
        Color yellow = new Yellow();
        Color red = new Red();
        Bag handBag = new HandBag();
        Bag wallet = new Wallet();
        handBag.setColor(yellow);
        wallet.setColor(red);
        System.out.println(handBag.getName());
        System.out.println(wallet.getName());
    }
}
