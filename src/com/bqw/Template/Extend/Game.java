package com.bqw.Template.Extend;

public abstract class Game {
    public String username = null;
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    abstract boolean isLogin();

    //模板
    public final void play(){
        //初始化游戏
        initialize();
        //钩子方法
        if(isLogin()){
            //开始游戏
            startPlay();
        }
        //结束游戏
        endPlay();
    }
}
