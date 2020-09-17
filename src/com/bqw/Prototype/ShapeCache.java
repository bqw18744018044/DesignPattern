package com.bqw.Prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<String,Shape>();
    public static void loadCache(){
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rect = new Rectangle();
        shapeMap.put(circle.getType(),circle);
        shapeMap.put(square.getType(),square);
        shapeMap.put(rect.getType(),rect);
    }

    public static Shape getShape(String type){
        Shape cachedShape = shapeMap.get(type);
        if(cachedShape!=null){
            return (Shape)cachedShape.clone();
        }
        return null;
    }

    public static void main(String...args){
        ShapeCache.loadCache();
        Circle c1 = (Circle)ShapeCache.getShape("Circle");
        Circle c2 = (Circle)ShapeCache.getShape("Circle");
        System.out.println(c1==c2);
    }
}
