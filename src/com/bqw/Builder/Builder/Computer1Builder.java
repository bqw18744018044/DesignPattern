package com.bqw.Builder.Builder;

import com.bqw.Builder.Product.Computer;
import com.bqw.Builder.Product.Intel;
import com.bqw.Builder.Product.MSI;

public class Computer1Builder extends AbstractBuilder{
    Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu(new Intel());
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard(new MSI());
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
