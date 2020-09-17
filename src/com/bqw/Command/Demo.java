package com.bqw.Command;

public class Demo {
    public static void main(String...args){
        Stock abcstock = new Stock();
        BuyStock buyStock = new BuyStock(abcstock);
        SellStock sellStock = new SellStock(abcstock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
