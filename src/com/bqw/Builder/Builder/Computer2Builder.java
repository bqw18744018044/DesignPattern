package com.bqw.Builder.Builder;

import com.bqw.Builder.Product.AMD;
import com.bqw.Builder.Product.ASUS;
import com.bqw.Builder.Product.Computer;

public class Computer2Builder extends AbstractBuilder{
    Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu(new AMD());
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard(new ASUS());
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
