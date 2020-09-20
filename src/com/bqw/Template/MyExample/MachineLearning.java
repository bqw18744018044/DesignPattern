package com.bqw.Template.MyExample;

public abstract class MachineLearning {
    protected boolean isClean = false; // 数据是否清洗完成

    abstract void EDA(); // 数据探索，抽象方法
    abstract void clean(); // 数据清洗，抽象方法
    abstract boolean isClean(); // 钩子方法
    abstract void featureEngineering(); // 特征工程，抽象方法
    abstract void train(); // 模型训练, 抽象方法
    abstract void eval(); // 模型评估，抽象方法

    public void setIsClean(boolean isClean){
        this.isClean = isClean;
    }

    public final void run(){
        EDA();
        if(!isClean())clean();
        featureEngineering();
        train();
        eval();
    }
}
