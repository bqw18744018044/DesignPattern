package com.bqw.Adapter.Twoway;

public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee{
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target){
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
