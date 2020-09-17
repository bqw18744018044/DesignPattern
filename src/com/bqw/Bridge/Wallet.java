package com.bqw.Bridge;

public class Wallet extends Bag{
    @Override
    public String getName() {
        return color.getColor()+"Wallet";
    }
}
