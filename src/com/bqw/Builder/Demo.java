package com.bqw.Builder;

import com.bqw.Builder.Builder.AbstractBuilder;
import com.bqw.Builder.Builder.Computer1Builder;
import com.bqw.Builder.Builder.Computer2Builder;
import com.bqw.Builder.Director.Director;
import com.bqw.Builder.Product.Computer;

public class Demo {
    public static void main(String...args){
        AbstractBuilder builder1 = new Computer1Builder();
        AbstractBuilder builder2 = new Computer2Builder();
        Director director1 = new Director(builder1);
        Director director2 = new Director(builder2);
        Computer computer1 = director1.construct();
        Computer computer2 = director2.construct();
        computer1.run();
        computer2.run();
    }

}
