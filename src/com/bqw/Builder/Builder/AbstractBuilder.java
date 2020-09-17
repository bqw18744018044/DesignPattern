package com.bqw.Builder.Builder;

import com.bqw.Builder.Product.Computer;

public abstract class AbstractBuilder {
    abstract public void buildCPU();
    abstract public void buildMainBoard();
    abstract public Computer createComputer();
}
