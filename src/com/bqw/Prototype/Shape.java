package com.bqw.Prototype;

public abstract class Shape implements Cloneable{
    protected String type;

    abstract void drow();

    public String getType(){
        return type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
