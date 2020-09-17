package com.bqw.Builder.Product;

public class Computer {
    private CPU cpu;
    private MainBoard mainBoard;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void run(){
        this.mainBoard.showInfo();
        this.cpu.run();
    }
}
