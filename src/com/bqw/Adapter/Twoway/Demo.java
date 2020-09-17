package com.bqw.Adapter.Twoway;

public class Demo {
    public static void main(String...args){
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();

        target = new TargetRealize();
        adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();

    }
}
