package com.bqw.Template.MyExample;

public class Algorithm1 extends MachineLearning{
    Algorithm1(boolean isClean){
        this.isClean = isClean;
    }

    public void setIsClean(boolean isClean){
        this.isClean = isClean;
    }

    @Override
    void EDA() {
        System.out.println("算法1数据探索");
    }

    @Override
    void clean() {
        System.out.println("算法1数据清洗");
    }

    @Override
    boolean isClean() {
        return this.isClean;
    }

    @Override
    void featureEngineering() {
        System.out.println("算法1特征工程");
    }

    @Override
    void train() {
        System.out.println("算法1模型训练");
    }

    @Override
    void eval() {
        System.out.println("算法1模型评估");
    }
}
