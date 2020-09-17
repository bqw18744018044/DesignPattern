package com.bqw.Facade;

public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;
    private Shape square;

    public ShapeMaker(){
        rectangle = new Rectangle();
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
