package com.bqw.Adapter.Twoway;

public class TargetRealize implements TwoWayTarget{
    @Override
    public void request() {
        System.out.println("目标代码被调用");
    }
}
