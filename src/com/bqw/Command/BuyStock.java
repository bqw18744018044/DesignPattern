package com.bqw.Command;

// 封装Stock.buy()方法
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.buy();
    }
}

