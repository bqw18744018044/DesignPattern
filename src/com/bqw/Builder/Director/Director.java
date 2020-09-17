package com.bqw.Builder.Director;

import com.bqw.Builder.Builder.AbstractBuilder;
import com.bqw.Builder.Product.Computer;

public class Director {
    private AbstractBuilder builder = null;
    public Director(AbstractBuilder builder){
        this.builder = builder;
    }
    public Computer construct(){
        builder.buildMainBoard();
        builder.buildCPU();
        return builder.createComputer();
    }
}
